package hu.bme.aut.protokit.m2m.oogen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import hu.bme.aut.oogen.OOArrayIndexing;
import hu.bme.aut.oogen.OOAssignmentExpression;
import hu.bme.aut.oogen.OOBaseType;
import hu.bme.aut.oogen.OOBitWiseComplement;
import hu.bme.aut.oogen.OOBitWiseLeftShift;
import hu.bme.aut.oogen.OOBitWiseRightShift;
import hu.bme.aut.oogen.OOBitwiseAndExpression;
import hu.bme.aut.oogen.OOBitwiseOrExpression;
import hu.bme.aut.oogen.OOBoolLiteral;
import hu.bme.aut.oogen.OOClass;
import hu.bme.aut.oogen.OOCollectionType;
import hu.bme.aut.oogen.OOExpression;
import hu.bme.aut.oogen.OOIf;
import hu.bme.aut.oogen.OOIntegerLiteral;
import hu.bme.aut.oogen.OOLanguage;
import hu.bme.aut.oogen.OOLanguageSpecificExpression;
import hu.bme.aut.oogen.OOLanguageSpecificSnippet;
import hu.bme.aut.oogen.OOLongLiteral;
import hu.bme.aut.oogen.OOMember;
import hu.bme.aut.oogen.OOMethod;
import hu.bme.aut.oogen.OOModel;
import hu.bme.aut.oogen.OOPackage;
import hu.bme.aut.oogen.OOReturn;
import hu.bme.aut.oogen.OOStatement;
import hu.bme.aut.oogen.OOType;
import hu.bme.aut.oogen.OOTypeCast;
import hu.bme.aut.oogen.OOVariable;
import hu.bme.aut.oogen.OOVariableReferenceExpression;
import hu.bme.aut.oogen.OOVisibility;
import hu.bme.aut.oogen.OogenFactory;
import hu.bme.aut.protokit.model.BinaryField;
import hu.bme.aut.protokit.model.BitField;
import hu.bme.aut.protokit.model.BitFieldComponent;
import hu.bme.aut.protokit.model.CountField;
import hu.bme.aut.protokit.model.DataType;
import hu.bme.aut.protokit.model.DataTypeField;
import hu.bme.aut.protokit.model.Field;
import hu.bme.aut.protokit.model.Formatter;
import hu.bme.aut.protokit.model.IntegerField;
import hu.bme.aut.protokit.model.LengthField;
import hu.bme.aut.protokit.model.ListField;
import hu.bme.aut.protokit.model.ProtocolModel;
import hu.bme.aut.protokit.model.StringField;

public class Protokit2OogenTransform {
	private static OogenFactory factory = OogenFactory.eINSTANCE;
	
	private static OOType booleanType() {
		OOType byteType = factory.createOOType();
		byteType.setBaseType(OOBaseType.BOOLEAN);
		return byteType;
	}
	
	private static OOBoolLiteral falseLiteral() {
		OOBoolLiteral ret = factory.createOOBoolLiteral();
		ret.setValue(false);
		return ret;
	}
	
	private static OOBoolLiteral trueLiteral() {
		OOBoolLiteral ret = factory.createOOBoolLiteral();
		ret.setValue(true);
		return ret;
	}
	
	private static OOType byteType() {
		OOType byteType = factory.createOOType();
		byteType.setBaseType(OOBaseType.BYTE);
		return byteType;
	}
	
	private static OOType intType() {
		OOType intType = factory.createOOType();
		intType.setBaseType(OOBaseType.INT);
		return intType;
	}
	
	private static OOType longType() {
		OOType longType = factory.createOOType();
		longType.setBaseType(OOBaseType.LONG);
		return longType;
	}

	private static OOType byteArrayType() {
		OOType byteArrayType = factory.createOOType();
		byteArrayType.setBaseType(OOBaseType.BYTE);
		byteArrayType.setArray(true);
		return byteArrayType;
	}

	private static OOType stringType() {
		OOType stringType = factory.createOOType();
		stringType.setBaseType(OOBaseType.STRING);
		return stringType;
	}
	
	private static OOType objectType(OOClass cl) {
		OOType objectType = factory.createOOType();
		objectType.setBaseType(OOBaseType.OBJECT);
		objectType.setClassType(cl);
		return objectType;
	}
	
	private static OOType objectType() {
		OOType objectType = factory.createOOType();
		objectType.setBaseType(OOBaseType.OBJECT);
		return objectType;
	}
	
	private static OOVariableReferenceExpression reference(OOVariable var) {
		OOVariableReferenceExpression ref = factory.createOOVariableReferenceExpression();
		ref.setVariable(var);
		return ref;
	}
	
	private static OOReturn returnExp(OOExpression exp) {
		OOReturn ret = factory.createOOReturn();
		ret.setReturnedExpresssion(exp);
		return ret;
	}
	
	private String capitalize(String s) {
		if (s.isEmpty())
			return s;
		else if (s.length() == 1)
			return new String(new char[] { Character.toUpperCase(s.charAt(0))});
		else
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	public OOModel transform(ProtocolModel model) {
		OOModel ooModel = factory.createOOModel();
		OOPackage pkg = factory.createOOPackage();
		pkg.setName("gen");
		ooModel.getPackages().add(pkg);
		
		List<OOClass> classes = pkg.getClasses();
		for (DataType dt : model.getDatatypes()) {
			classes.add(dataType2Class(dt));
			classes.addAll(formattersPerDataType(dt));
		}
		
		return ooModel;
	}
	
	private OOClass dataType2Class(DataType dt) {
		OOClass dtClass = factory.createOOClass();
		dtClass.setName(dt.getName());
		
		List<OOMember> members = dtClass.getMembers();
		for (Field f : dt.getFields()) {
			OOMember m = field2Member(f);
			if (m != null)
				members.add(m);
		}
		
		List<OOMethod> methods = dtClass.getMethods();
		for (Field f : dt.getFields()) {
			List<OOMethod> ms = field2Getter(f, dtClass);
			if (ms != null && !ms.isEmpty())
				methods.addAll(ms);
		}

		for (Field f : dt.getFields()) {
			List<OOMethod> ms = field2Setter(f, dtClass);
			if (ms != null && !ms.isEmpty())
				methods.addAll(ms);
		}
		
		OOMethod sizeMethod = createSizeMethod(dt.getFields());
		methods.add(sizeMethod);
		
		OOMethod serializeMethod = createSerializeMethod(dt.getFields());
		methods.add(serializeMethod);
		
		OOMethod deserializeMethod = createDeserializeMethod(dt.getFields(), dtClass);
		methods.add(deserializeMethod);
		
		OOMethod equalsMethod = createEqualsMethod(dt.getFields(), dtClass);
		methods.add(equalsMethod);
		
		OOMethod hashCodeMethod = createHashCodeMethod(dt.getFields());
		methods.add(hashCodeMethod);
		
		return dtClass;
	}
	
	private OOMember field2Member(Field f) {
		
		OOMember member = factory.createOOMember();
		member.setVisibility(OOVisibility.PRIVATE);
		member.setName(f.getName());
		
		OOType memberType = factory.createOOType();
		member.setType(memberType);
		
		if (f instanceof IntegerField) {
			memberType.setBaseType(OOBaseType.LONG);
		} else if (f instanceof BinaryField) {
			memberType.setBaseType(OOBaseType.BYTE);
			memberType.setArray(true);
		} else if (f instanceof BitField) {
			int arrLen = (int) Math.ceil(((BitField) f).getComponents().stream().mapToInt(c -> c.getBitLen()).sum() / 8);
			memberType.setBaseType(OOBaseType.BYTE);
			memberType.setArray(true);
			
			OOLanguageSpecificExpression init = factory.createOOLanguageSpecificExpression();
			OOLanguageSpecificSnippet javaSnippet = factory.createOOLanguageSpecificSnippet();
			javaSnippet.setLang(OOLanguage.JAVA);
			javaSnippet.setCode("new byte[" + arrLen + "]");
			init.getSnippets().add(javaSnippet);
			member.setInitializerExpression(init);
		} else if (f instanceof StringField) {
			memberType.setBaseType(OOBaseType.STRING);
		} else if (f instanceof ListField) {
			ListField lf = (ListField) f;
			DataType dt = lf.getElementType();
			
			OOClass memberClass = factory.createOOClass();
			memberClass.setName(dt.getName());
			
			memberType.setBaseType(OOBaseType.OBJECT);
			memberType.setCollectionType(OOCollectionType.LIST);
			memberType.setClassType(memberClass);
			
			OOLanguageSpecificExpression init = factory.createOOLanguageSpecificExpression();
			OOLanguageSpecificSnippet javaSnippet = factory.createOOLanguageSpecificSnippet();
			javaSnippet.setLang(OOLanguage.JAVA);
			javaSnippet.setCode("new ArrayList<>()");
			init.getSnippets().add(javaSnippet);
			member.setInitializerExpression(init);
		} else if (f instanceof DataTypeField) {
			DataType dt = ((DataTypeField) f).getDatatype();
			OOClass memberClass = factory.createOOClass();
			memberClass.setName(dt.getName());
			
			memberType.setBaseType(OOBaseType.OBJECT);
			memberType.setClassType(memberClass);
		} else
			return null;
		
		return member;
	}
	
	private List<OOMethod> field2Getter(Field f, OOClass containingClass) {
		Optional<OOMember> referencedMemberOpt = containingClass.getMembers().stream()
				.filter(m -> m.getName().equals(f.getName())).findFirst();
		
		if (f instanceof BitField)
			return bitField2Getter((BitField) f, referencedMemberOpt.get());
		
		OOMethod getter = factory.createOOMethod();
		getter.setName("get" + capitalize(f.getName()));
		getter.setVisibility(OOVisibility.PUBLIC);
		if (!referencedMemberOpt.isPresent()) {
			getter.setReturnType(longType());
		} else {
			getter.setReturnType(referencedMemberOpt.get().getType());
		}
		List<OOStatement> getterBody = getter.getStatements();
		OOReturn returnStatement = factory.createOOReturn();
		getterBody.add(returnStatement);
		
		if (f instanceof LengthField) {
			LengthField lf = (LengthField) f;
			BinaryField bf = lf.getRef();
			
			OOLanguageSpecificExpression returnExp = factory.createOOLanguageSpecificExpression();
			
			// Java
			OOLanguageSpecificSnippet javaSnippet = factory.createOOLanguageSpecificSnippet();
			javaSnippet.setCode(bf.getName() + ".length");
			javaSnippet.setLang(OOLanguage.JAVA);
			returnExp.getSnippets().add(javaSnippet);
			
			// C++
			OOLanguageSpecificSnippet cppSnippet = factory.createOOLanguageSpecificSnippet();
			cppSnippet.setCode(bf.getName() + ".size()");
			cppSnippet.setLang(OOLanguage.CPP);
			returnExp.getSnippets().add(cppSnippet);
			
			returnStatement.setReturnedExpresssion(returnExp);
		} else if (f instanceof CountField) {
			CountField cf = (CountField) f;
			ListField lf = cf.getRef();
			
			OOLanguageSpecificExpression returnExp = factory.createOOLanguageSpecificExpression();
			
			// Java
			OOLanguageSpecificSnippet javaSnippet = factory.createOOLanguageSpecificSnippet();
			javaSnippet.setCode(lf.getName() + ".size()");
			javaSnippet.setLang(OOLanguage.JAVA);
			returnExp.getSnippets().add(javaSnippet);
			
			// C++
			OOLanguageSpecificSnippet cppSnippet = factory.createOOLanguageSpecificSnippet();
			cppSnippet.setCode(lf.getName() + ".size()");
			cppSnippet.setLang(OOLanguage.CPP);
			returnExp.getSnippets().add(cppSnippet);
			
			returnStatement.setReturnedExpresssion(returnExp);

		} else {
			OOVariableReferenceExpression returnExp = factory.createOOVariableReferenceExpression();
			returnExp.setVariable(referencedMemberOpt.get());
			returnStatement.setReturnedExpresssion(returnExp);
		}
		
		return Collections.singletonList(getter);
	}
	
	private List<OOMethod> bitField2Getter(BitField f, OOMember ref) {
		List<OOMethod> getters = new ArrayList<>();
		int offset = 0;
		
		for (BitFieldComponent c : f.getComponents()) {
			OOMethod getter = createBitFieldGetter(c.getName(), ref, offset / 8, 8 - (offset % 8) - c.getBitLen(), c.getBitLen());
			getters.add(getter);
			offset += c.getBitLen();
		}
		return getters;
	}
	
	private int createMaskForLen(int len) {
		int base = 1;
		int ret = 0;
		while (len > 0) {
			ret += base;
			base <<= 1;
			len--;
		}
		return ret;
	}
	
	private OOMethod createBitFieldGetter(String comoponent, OOMember ref, int idx, int os, int len) {
		OOMethod getter = factory.createOOMethod();
		getter.setName("get" + capitalize(comoponent));
		getter.setVisibility(OOVisibility.PUBLIC);
		getter.setReturnType(longType());
		List<OOStatement> getterBody = getter.getStatements();
		
		OOArrayIndexing arrayIndexing = factory.createOOArrayIndexing();
		arrayIndexing.setArray(ref);
		arrayIndexing.setIndex(idx);
		
		OOIntegerLiteral mask = factory.createOOIntegerLiteral();
		mask.setValue(createMaskForLen(len));
		OOIntegerLiteral shift = factory.createOOIntegerLiteral();
		shift.setValue(os);
		OOBitWiseLeftShift shiftedMask = factory.createOOBitWiseLeftShift();
		shiftedMask.setLeftSide(mask);
		shiftedMask.setRightSide(shift);

		OOBitwiseAndExpression maskingExp = factory.createOOBitwiseAndExpression();
		maskingExp.setLeftSide(arrayIndexing);
		maskingExp.setRightSide(shiftedMask);
		
		OOBitWiseRightShift shiftBack = factory.createOOBitWiseRightShift();
		shiftBack.setLeftSide(maskingExp);
		shiftBack.setRightSide(shift);
		
		OOReturn returnStatement = factory.createOOReturn();
		returnStatement.setReturnedExpresssion(shiftBack);
		getterBody.add(returnStatement);
		
		return getter;
	}
	
	private List<OOMethod> field2Setter(Field f, OOClass containingClass) {
		if (f instanceof LengthField) {
			return null;
		} else if (f instanceof CountField) {
			return null;
		}
		Optional<OOMember> referencedMemberOpt = containingClass.getMembers().stream()
				.filter(m -> m.getName().equals(f.getName())).findFirst();
		if (!referencedMemberOpt.isPresent())
			return null;

		if (f instanceof BitField)
			return bitField2Setter((BitField) f, referencedMemberOpt.get());

		OOMethod setter = factory.createOOMethod();
		setter.setName("set" + capitalize(f.getName()));
		setter.setVisibility(OOVisibility.PUBLIC);
		setter.setReturnType(null);

		OOVariable param = factory.createOOVariable();
		param.setName(f.getName());
		param.setType(referencedMemberOpt.get().getType());
		setter.getParameters().add(param);

		List<OOStatement> setterBody = setter.getStatements();
		OOAssignmentExpression assignment = factory.createOOAssignmentExpression();
		OOVariableReferenceExpression leftSide = factory.createOOVariableReferenceExpression();
		leftSide.setVariable(referencedMemberOpt.get());
		OOVariableReferenceExpression rightSide = factory.createOOVariableReferenceExpression();
		rightSide.setVariable(param);
		assignment.setLeftSide(leftSide);
		assignment.setRightSide(rightSide);
		setterBody.add(assignment);

		return Collections.singletonList(setter);
	}
	
	private List<OOMethod> bitField2Setter(BitField f, OOMember ref) {
		List<OOMethod> setters = new ArrayList<>();
		int offset = 0;
		
		for (BitFieldComponent c : f.getComponents()) {
			OOMethod setter = createBitFieldSetter(c.getName(), ref, offset / 8, 8 - (offset % 8) - c.getBitLen(), c.getBitLen());
			setters.add(setter);
			offset += c.getBitLen();
		}
		return setters;
	}
	
	private OOMethod createBitFieldSetter(String comoponent, OOMember ref, int idx, int os, int len) {
		OOVariable param = factory.createOOVariable();
		param.setType(longType());
		param.setName(comoponent);
		
		OOMethod setter = factory.createOOMethod();
		setter.setName("set" + capitalize(comoponent));
		setter.setVisibility(OOVisibility.PUBLIC);
		setter.setReturnType(null);
		setter.getParameters().add(param);
		List<OOStatement> setterBody = setter.getStatements();
		
		OOArrayIndexing arrayIndexing = factory.createOOArrayIndexing();
		arrayIndexing.setArray(ref);
		arrayIndexing.setIndex(idx);
		
		OOIntegerLiteral mask = factory.createOOIntegerLiteral();
		mask.setValue(createMaskForLen(len));
		OOIntegerLiteral shift = factory.createOOIntegerLiteral();
		shift.setValue(os);
		OOBitWiseLeftShift shiftedMask = factory.createOOBitWiseLeftShift();
		shiftedMask.setLeftSide(mask);
		shiftedMask.setRightSide(shift);
		OOBitWiseComplement negatedMask = factory.createOOBitWiseComplement();
		negatedMask.setOperand(shiftedMask);

		OOBitwiseAndExpression clearingExp = factory.createOOBitwiseAndExpression();
		clearingExp.setLeftSide(arrayIndexing);
		clearingExp.setRightSide(negatedMask);
		
		OOTypeCast castedClearingExp = factory.createOOTypeCast();
		castedClearingExp.setType(byteType());
		castedClearingExp.setExpression(clearingExp);
		
		OOAssignmentExpression clearing = factory.createOOAssignmentExpression();
		clearing.setLeftSide(arrayIndexing);
		clearing.setRightSide(castedClearingExp);
		setterBody.add(clearing);
		
		OOVariableReferenceExpression valueToSet = factory.createOOVariableReferenceExpression();
		valueToSet.setVariable(param);
		OOBitWiseLeftShift shiftedParam = factory.createOOBitWiseLeftShift();
		shiftedParam.setLeftSide(valueToSet);
		shiftedParam.setRightSide(shift);
		
		OOBitwiseOrExpression settingExp = factory.createOOBitwiseOrExpression();
		settingExp.setLeftSide(arrayIndexing);
		settingExp.setRightSide(shiftedParam);

		OOTypeCast castedSettingExp = factory.createOOTypeCast();
		castedSettingExp.setType(byteType());
		castedSettingExp.setExpression(settingExp);
		
		OOAssignmentExpression setting = factory.createOOAssignmentExpression();
		setting.setLeftSide(arrayIndexing);
		setting.setRightSide(castedSettingExp);
		setterBody.add(setting);
		
		return setter;
	}
	
	private OOMethod createSizeMethod(List<Field> fields) {
		OOMethod sizeMethod = factory.createOOMethod();
		sizeMethod.getLanguages().add(OOLanguage.JAVA);
		sizeMethod.setName("size");
		sizeMethod.setVisibility(OOVisibility.PUBLIC);
		sizeMethod.setReturnType(longType());
		
		long invarSizeComponent = 0;
		OOLongLiteral invarLiteral = factory.createOOLongLiteral();
		OOVariable sizeVariable = factory.createOOVariable();
		sizeVariable.setType(longType());
		sizeVariable.setName("size");
		sizeVariable.setInitializerExpression(invarLiteral);
		sizeMethod.getStatements().add(sizeVariable);
		
		for (Field f : fields.stream().filter(f -> !f.isTransientField()).collect(Collectors.toList())) {
			OOLanguageSpecificExpression sizeExp = factory.createOOLanguageSpecificExpression();
			OOLanguageSpecificSnippet javaSnippet = factory.createOOLanguageSpecificSnippet();
			javaSnippet.setLang(OOLanguage.JAVA);

			if (!(f instanceof DataTypeField || f instanceof ListField || f instanceof BitField) && !f.isUnbounded()) {
				invarSizeComponent += f.getByteLen();
				continue;
			} else if (f instanceof BitField) {
				invarSizeComponent += Math.ceil(((BitField) f).getComponents().stream().mapToInt(c -> c.getBitLen()).sum() / 8);
				continue;
			} else if (f instanceof DataTypeField) {
				javaSnippet.setCode("size += " + f.getName() + ".size()");

			} else if (f instanceof ListField) {
				ListField lf = (ListField) f;
				javaSnippet.setCode("for (" + lf.getElementType().getName() + " e : " + lf.getName() + ") { size += e.size(); }");
			} else {
				if (f instanceof BinaryField)
					javaSnippet.setCode("size += " + f.getName() + ".length");
				else if (f instanceof StringField) {
					if (f.getFormatter() == null)
						javaSnippet.setCode("size += " + f.getName() + ".length()");
					else
						javaSnippet.setCode("size += " + f.getFormatter().getName() + ".size(" + f.getName() + ")");
				}
			}
			sizeExp.getSnippets().add(javaSnippet);
			sizeMethod.getStatements().add(sizeExp);
		}

		invarLiteral.setValue(invarSizeComponent);

		OOReturn returnStatement = factory.createOOReturn();
		sizeMethod.getStatements().add(returnStatement);
		
		OOVariableReferenceExpression varRef = factory.createOOVariableReferenceExpression();
		varRef.setVariable(sizeVariable);
		returnStatement.setReturnedExpresssion(varRef);
		
		return sizeMethod;
	}
	
	private OOMethod createSerializeMethod(List<Field> fields) {
		OOMethod serializeMethod = factory.createOOMethod();
		serializeMethod.getLanguages().add(OOLanguage.JAVA);
		serializeMethod.setName("serialize");
		serializeMethod.setVisibility(OOVisibility.PUBLIC);
		serializeMethod.setReturnType(byteArrayType());
		
		OOLanguageSpecificExpression bufferVar = factory.createOOLanguageSpecificExpression();
		OOLanguageSpecificSnippet javaBufferSnippet = factory.createOOLanguageSpecificSnippet();
		javaBufferSnippet.setLang(OOLanguage.JAVA);
		javaBufferSnippet.setCode("ByteBuffer buf = ByteBuffer.allocate((int)this.size())" );
		bufferVar.getSnippets().add(javaBufferSnippet);
		serializeMethod.getStatements().add(bufferVar);
		
		for (Field f : fields.stream().filter(f -> !f.isTransientField()).collect(Collectors.toList())) {
			OOLanguageSpecificExpression serializeExp = factory.createOOLanguageSpecificExpression();
			OOLanguageSpecificSnippet javaSnippet = factory.createOOLanguageSpecificSnippet();
			javaSnippet.setLang(OOLanguage.JAVA);

			if (f instanceof IntegerField)
				javaSnippet.setCode("buf.put(ProtoUtil.longToBytes(" + f.getName() + ", " + f.getByteLen() + "))");
			else if (f instanceof CountField || f instanceof LengthField)
				javaSnippet.setCode("buf.put(ProtoUtil.longToBytes(get" + capitalize(f.getName()) + "(), " + f.getByteLen() + "))");
			else if (f instanceof BinaryField || f instanceof BitField)
				javaSnippet.setCode("buf.put(" + f.getName() + ")");
			else if (f instanceof StringField) {
				if (f.getFormatter() == null)
					javaSnippet.setCode("buf.put(" + f.getName() + ".getBytes())");
				else
					javaSnippet.setCode("buf.put(" + f.getFormatter().getName() + ".toBytes(" + f.getName() + "))");
			} else if (f instanceof ListField) {
				ListField lf = (ListField) f;
				javaSnippet.setCode("for (" + lf.getElementType().getName() + " e : " + lf.getName()
						+ ") { buf.put(e.serialize()); }");
			} else if (f instanceof DataTypeField)
				javaSnippet.setCode("buf.put(" + f.getName() + ".serialize())");
			serializeExp.getSnippets().add(javaSnippet);
			serializeMethod.getStatements().add(serializeExp);
		}
		
		OOLanguageSpecificExpression retVat = factory.createOOLanguageSpecificExpression();
		OOLanguageSpecificSnippet javaRetSnippet = factory.createOOLanguageSpecificSnippet();
		javaRetSnippet.setLang(OOLanguage.JAVA);
		javaRetSnippet.setCode("return buf.array()" );
		retVat.getSnippets().add(javaRetSnippet);
		serializeMethod.getStatements().add(retVat);

		return serializeMethod;
	}
	
	private OOMethod createDeserializeMethod(List<Field> fields, OOClass containingClass ) {
		OOMethod deserializeMethod = factory.createOOMethod();
		deserializeMethod.getLanguages().add(OOLanguage.JAVA);
		deserializeMethod.setName("deserialize");
		deserializeMethod.setVisibility(OOVisibility.PUBLIC);
		deserializeMethod.setStatic(true);
		
		OOVariable objParam = factory.createOOVariable();
		objParam.setType(objectType(containingClass));
		objParam.setName("newObject");
		deserializeMethod.getParameters().add(objParam);
		
		OOVariable bufParam = factory.createOOVariable();
		bufParam.setType(byteArrayType());
		bufParam.setName("arr");
		deserializeMethod.getParameters().add(bufParam);
		
		OOVariable offsetParam = factory.createOOVariable();
		offsetParam.setType(intType());
		offsetParam.setName("offset");
		deserializeMethod.getParameters().add(offsetParam);
		
		deserializeMethod.setReturnType(intType());
		
		for (Field f : fields.stream().filter(f -> !f.isTransientField()).collect(Collectors.toList())) {
			OOLanguageSpecificExpression deserializeExp = factory.createOOLanguageSpecificExpression();
			OOLanguageSpecificSnippet javaSnippet = factory.createOOLanguageSpecificSnippet();
			javaSnippet.setLang(OOLanguage.JAVA);

			if (f instanceof IntegerField)
				javaSnippet.setCode("newObject." + f.getName() + " = ProtoUtil.bytesToLong(arr, offset, " + f.getByteLen() + "); offset += " + f.getByteLen());
			else if (f instanceof CountField || f instanceof LengthField) {
				OOVariable var = factory.createOOVariable();
				var.setType(intType());
				var.setName(f.getName());
				deserializeMethod.getStatements().add(var);
				
				javaSnippet.setCode("(int)ProtoUtil.bytesToLong(arr, offset, " + f.getByteLen() + "); offset += " + f.getByteLen());
				deserializeExp.getSnippets().add(javaSnippet);
				var.setInitializerExpression(deserializeExp);
				continue;
			} else if (f instanceof BinaryField) {
				if (!f.isUnbounded())
					javaSnippet.setCode("newObject." + f.getName() + " = Arrays.copyOfRange(arr, offset, offset + " + f.getByteLen() + "); offset += " + f.getByteLen());
				else {
					Optional<Field> optLf = fields.stream().filter(f1 -> f1 instanceof LengthField && ((LengthField)f1).getRef().equals(f)).findFirst();
					if (optLf.isPresent()) {
						LengthField lf = (LengthField) optLf.get();
						javaSnippet.setCode("newObject." + f.getName() + " = Arrays.copyOfRange(arr, offset, offset + " + lf.getName() + "); offset += " + lf.getName());
					} else
						javaSnippet.setCode("newObject." + f.getName() + " = Arrays.copyOf(arr, offset)");
				}
			} else if (f instanceof BitField) {
				BitField bf = (BitField) f;
				int len = bf.getComponents().stream().mapToInt(c -> c.getBitLen()).sum() / 8;
				javaSnippet.setCode("newObject." + f.getName() + " = Arrays.copyOfRange(arr, offset, offset + " + len + "); offset += " + len);
			} else if (f instanceof StringField) {
				if (f.getFormatter() == null) {
					if (!f.isUnbounded())
						javaSnippet.setCode("newObject." + f.getName() + " = new String(Arrays.copyOfRange(arr, offset, offset + " + f.getByteLen() + "); offset += " + f.getByteLen());
					else
						javaSnippet.setCode("newObject." + f.getName() + " = new String(Arrays.copyOf(arr, offset)");

				} else
					javaSnippet.setCode("newObject." + f.getName() + " = " + f.getFormatter().getName() + ".fromBytes(arr, offset); offset += " + f.getFormatter().getName() + ".size(arr, offset)");
			} else if (f instanceof ListField) {
				CountField cf = (CountField)fields.stream().filter(f1 -> (f1 instanceof CountField) && ((CountField)f1).getRef().equals(f))
						.findFirst().get();
				ListField lf = (ListField) f;
				String type = lf.getElementType().getName();
				String fName = lf.getName();
				if (cf == null)
					continue;
				javaSnippet.setCode("newObject." + fName + " = new ArrayList<>(); for (int i = 0; i < " + cf.getName() + "; i++) { " + type + " tmp = new " + type + "(); offset = " + type + ".deserialize(tmp, arr, offset); newObject." + fName + ".add(tmp); }");
			} else if (f instanceof DataTypeField) {
				DataTypeField df = (DataTypeField) f;
				javaSnippet.setCode("newObject." + f.getName() + " = new " + df.getDatatype().getName() + "(); offset = " + df.getDatatype().getName() + ".deserialize(newObject. " + f.getName() + ", arr, offset);");
			}
			deserializeExp.getSnippets().add(javaSnippet);
			deserializeMethod.getStatements().add(deserializeExp);
		}
		
		deserializeMethod.getStatements().add(returnExp(reference(offsetParam)));
		return deserializeMethod;
	}
	
	
	private OOMethod createEqualsMethod(List<Field> fields, OOClass containingClass) {
		OOMethod equalsMethod = factory.createOOMethod();
		equalsMethod.getLanguages().add(OOLanguage.JAVA);
		equalsMethod.setName("equals");
		equalsMethod.setVisibility(OOVisibility.PUBLIC);
		OOVariable param = factory.createOOVariable();
		param.setName("otherObject");
		param.setType(objectType());
		equalsMethod.getParameters().add(param);
		equalsMethod.setReturnType(booleanType());
		
		OOVariable other = factory.createOOVariable();
		other.setType(objectType(containingClass));
		other.setName("other");
		OOTypeCast cast = factory.createOOTypeCast();
		cast.setType(objectType(containingClass));
		cast.setExpression(reference(param));
		other.setInitializerExpression(cast);
		equalsMethod.getStatements().add(other);
		
		for (Field f : fields.stream().filter(f -> f.isIdentityField()).collect(Collectors.toList())) {
			OOIf testForMismatch = factory.createOOIf();
			testForMismatch.getBodyStatements().add(returnExp(falseLiteral()));
			
			OOLanguageSpecificExpression mismatchCondition = factory.createOOLanguageSpecificExpression();
			OOLanguageSpecificSnippet javaSnippet = factory.createOOLanguageSpecificSnippet();
			javaSnippet.setLang(OOLanguage.JAVA);

			if (f instanceof IntegerField)
				javaSnippet.setCode("this." + f.getName() + " != other." + f.getName());
			else if (f instanceof BinaryField || f instanceof BitField)
				javaSnippet.setCode("!Arrays.equals(this." + f.getName() + ", other." + f.getName() + ")");
			else if (f instanceof StringField || f instanceof ListField || f instanceof DataTypeField) {
				javaSnippet.setCode("!this." + f.getName() + ".equals(other." + f.getName() + ")");
			} else
				continue;
			
			mismatchCondition.getSnippets().add(javaSnippet);
			testForMismatch.setCondition(mismatchCondition);
			equalsMethod.getStatements().add(testForMismatch);
		}
		
		OOReturn returnTrue = factory.createOOReturn();
		returnTrue.setReturnedExpresssion(trueLiteral());
		equalsMethod.getStatements().add(returnTrue);
		
		return equalsMethod;
	}
	
	private OOMethod createHashCodeMethod(List<Field> fields) {
		OOMethod hashCodeMethod = factory.createOOMethod();
		hashCodeMethod.getLanguages().add(OOLanguage.JAVA);
		hashCodeMethod.setName("hashCode");
		hashCodeMethod.setVisibility(OOVisibility.PUBLIC);
		hashCodeMethod.setReturnType(intType());
		
		OOIntegerLiteral invarLiteral = factory.createOOIntegerLiteral();
		invarLiteral.setValue(0);
		OOVariable hashVariable = factory.createOOVariable();
		hashVariable.setType(intType());
		hashVariable.setName("hash");
		hashVariable.setInitializerExpression(invarLiteral);
		hashCodeMethod.getStatements().add(hashVariable);
		
		for (Field f : fields.stream().filter(f -> f.isIdentityField()).collect(Collectors.toList())) {
			OOLanguageSpecificExpression hashExp = factory.createOOLanguageSpecificExpression();
			OOLanguageSpecificSnippet javaSnippet = factory.createOOLanguageSpecificSnippet();
			javaSnippet.setLang(OOLanguage.JAVA);

			if (f instanceof IntegerField)
				javaSnippet.setCode("hash += (int)" + f.getName());
			else if (f instanceof BinaryField || f instanceof BitField)
				javaSnippet.setCode("hash += Arrays.hashCode(" + f.getName() + ")");
			else if (f instanceof StringField || f instanceof ListField || f instanceof DataTypeField) {
					javaSnippet.setCode("hash += " + f.getName() + ".hashCode()");
			} else
				continue;
	
			hashExp.getSnippets().add(javaSnippet);
			hashCodeMethod.getStatements().add(hashExp);
		}

		OOReturn returnStatement = factory.createOOReturn();
		hashCodeMethod.getStatements().add(returnStatement);
		
		OOVariableReferenceExpression varRef = factory.createOOVariableReferenceExpression();
		varRef.setVariable(hashVariable);
		returnStatement.setReturnedExpresssion(varRef);
		
		return hashCodeMethod;
	}
	
	private List<OOClass> formattersPerDataType(DataType dt) {
		List<OOClass> formatters = new ArrayList<>();
		dt.getFields().stream().map(f -> formatterPerField(f)).filter(fm -> fm != null).forEach(fm -> formatters.add(fm));
		return formatters;
	}
	
	private OOClass formatterPerField(Field f) {
		Formatter fm = f.getFormatter();
		if (fm == null)
			return null;

		OOClass fmClass = factory.createOOClass();
		fmClass.getLanguages().add(OOLanguage.JAVA);
		fmClass.setName(fm.getName());
		fmClass.setKeep(true);
		
		OOMethod toBytesMethod = factory.createOOMethod();
		toBytesMethod.setVisibility(OOVisibility.PUBLIC);
		toBytesMethod.setStatic(true);
		toBytesMethod.setReturnType(byteArrayType());
		toBytesMethod.setName("toBytes");
		OOVariable toByteStringParam = factory.createOOVariable();
		toByteStringParam.setType(stringType());
		toByteStringParam.setName("str");
		toBytesMethod.getParameters().add(toByteStringParam);
		fmClass.getMethods().add(toBytesMethod);
		
		OOMethod fromBytesMethod = factory.createOOMethod();
		fromBytesMethod.setVisibility(OOVisibility.PUBLIC);
		fromBytesMethod.setStatic(true);
		fromBytesMethod.setReturnType(stringType());
		fromBytesMethod.setName("fromBytes");
		OOVariable bufferParam = factory.createOOVariable();
		bufferParam.setType(byteArrayType());
		bufferParam.setName("arr");
		fromBytesMethod.getParameters().add(bufferParam);
		OOVariable offsetParam = factory.createOOVariable();
		offsetParam.setType(intType());
		offsetParam.setName("offset");
		fromBytesMethod.getParameters().add(offsetParam);
		fmClass.getMethods().add(fromBytesMethod);
		
		OOMethod sizeMethod = factory.createOOMethod();
		sizeMethod.setVisibility(OOVisibility.PUBLIC);
		sizeMethod.setStatic(true);
		sizeMethod.setReturnType(intType());
		sizeMethod.setName("size");
		OOVariable sizeStringParam = factory.createOOVariable();
		sizeStringParam.setType(stringType());
		sizeStringParam.setName("str");
		sizeMethod.getParameters().add(sizeStringParam);
		fmClass.getMethods().add(sizeMethod);
		
		OOMethod sizeMethod2 = factory.createOOMethod();
		sizeMethod2.setVisibility(OOVisibility.PUBLIC);
		sizeMethod2.setStatic(true);
		sizeMethod2.setReturnType(intType());
		sizeMethod2.setName("size");
		OOVariable bufferParam2 = factory.createOOVariable();
		bufferParam2.setType(byteArrayType());
		bufferParam2.setName("arr");
		sizeMethod2.getParameters().add(bufferParam2);
		OOVariable offsetParam2 = factory.createOOVariable();
		offsetParam2.setType(intType());
		offsetParam2.setName("offset");
		sizeMethod2.getParameters().add(offsetParam2);
		fmClass.getMethods().add(sizeMethod2);
		
		return fmClass;
	}
}
