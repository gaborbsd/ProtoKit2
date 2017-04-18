package hu.bme.aut.oogen.java

import hu.bme.aut.oogen.general.OOCodeGeneratorTemplates
import hu.bme.aut.oogen.OOClass
import hu.bme.aut.oogen.OOMember
import hu.bme.aut.oogen.OOVisibility
import hu.bme.aut.oogen.OOType
import hu.bme.aut.oogen.OOMethod
import hu.bme.aut.oogen.OOStatement
import hu.bme.aut.oogen.OOExpression
import hu.bme.aut.oogen.OOReturn
import hu.bme.aut.oogen.OOArrayIndexing
import java.util.List
import hu.bme.aut.oogen.OOVariable
import hu.bme.aut.oogen.OOAdditionExpression
import hu.bme.aut.oogen.OOSubtractionExpression
import hu.bme.aut.oogen.OODivisionExpression
import hu.bme.aut.oogen.OOMultiplicationExpression
import hu.bme.aut.oogen.OOIntegerDivisionExpression
import hu.bme.aut.oogen.OOPowerExpression
import hu.bme.aut.oogen.OORootExpression
import hu.bme.aut.oogen.OOBitwiseOrExpression
import hu.bme.aut.oogen.OOBitwiseXorExpression
import hu.bme.aut.oogen.OOBitwiseAndExpression
import hu.bme.aut.oogen.OOAssignmentExpression
import hu.bme.aut.oogen.OODoubleLiteral
import hu.bme.aut.oogen.OOFloatLiteral
import hu.bme.aut.oogen.OOIntegerLiteral
import hu.bme.aut.oogen.OOLongLiteral
import hu.bme.aut.oogen.OOLogicalLiteral
import hu.bme.aut.oogen.OOEmptyStatement
import hu.bme.aut.oogen.OOIf
import java.util.Collections
import hu.bme.aut.oogen.OOWhile
import hu.bme.aut.oogen.OODoWhile
import hu.bme.aut.oogen.OOFor
import hu.bme.aut.oogen.OOForEach
import hu.bme.aut.oogen.OOBaseType
import hu.bme.aut.oogen.OOVariableReferenceExpression
import hu.bme.aut.oogen.OOBitWiseLeftShift
import hu.bme.aut.oogen.OOBitWiseRightShift
import hu.bme.aut.oogen.OOBitWiseComplement
import hu.bme.aut.oogen.OOCollectionType
import hu.bme.aut.oogen.OOLanguageSpecificExpression
import hu.bme.aut.oogen.OOLanguage
import hu.bme.aut.oogen.OOTypeCast
import hu.bme.aut.oogen.OOBoolLiteral
import hu.bme.aut.oogen.OONew
import hu.bme.aut.oogen.OOPrint
import hu.bme.aut.oogen.OOWriteFile

class OOCodeGeneratorTemplatesJava implements OOCodeGeneratorTemplates {
	
	private static OOCodeGeneratorTemplatesJava instance;

	def static OOCodeGeneratorTemplatesJava getInstance() {
		if (instance == null)
			instance = new OOCodeGeneratorTemplatesJava();
		return instance;
	}
	
	override String generate(OOClass cl) '''


	«IF !cl.isNestedClass()» 
	package «cl.package.name»;
	
	import java.nio.ByteBuffer;
	import java.util.*;
	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	import hu.bme.aut.protokit.runtime.ProtoUtil;
	«ENDIF»
	
	

«IF cl.isNestedClass()» 
public static class _«cl.name» «generateInterfaceImplementation(cl)»{
	«ELSE»
public class «cl.name»  «generateInterfaceImplementation(cl)» {
	«ENDIF»
	
	«FOR m : cl.members.filter[m|m.languages.empty || m.languages.contains(OOLanguage.JAVA)]»
	«m.generate»
	«ENDFOR»
	
	«IF !cl.ooclass.isEmpty» 
	«FOR c : cl.ooclass»
	«generate(c)»
	
	«ENDFOR»
	«ENDIF»
	
	
	«FOR m : cl.methods.filter[m|m.languages.empty || m.languages.contains(OOLanguage.JAVA)]»
	«m.generate»
	«ENDFOR»
	
	«IF !cl.oocompare.isEmpty»
	«generateCompareTo(cl)»
	«ENDIF»
	
	
}
	'''
	
	def String generateCompareTo(OOClass c)'''
	public int compareTo(«c.name» «c.oocompare.get(0).comparedObjectName») {
	«FOR compare : c.oocompare»
				«FOR statement : compare.statements»
						«statement.generateStatement»		
				«ENDFOR»
	«ENDFOR»
	
	}
	'''		
	

	
	
	def String generateInterfaceImplementation(OOClass c)'''
		«IF !c.oocompare.isEmpty»
		implemets Comparable<«c.name»> 
		«ENDIF»
'''		
	
	def String generate(OOMember m) '''
«m.visibility.generate» «m.generateTransient» «m.type.generate» «m.name»«m.generateInit»;
'''	
	def String generateTransient(OOMember m) {
		if (m.transient) "transient" else ""
	}

	def String generate(OOVisibility v) {
		switch v {
			case OOVisibility.PRIVATE:
				"private"
			case OOVisibility.PACKAGE:
				""
			case OOVisibility.PROTECTED:
				"protected"
			case OOVisibility.PUBLIC:
				"public"
		}
	}
	
	def String generateInit(OOMember m) '''
	«val exp = m.initializerExpression»
	«IF exp != null»
	«IF	!(exp instanceof OOLanguageSpecificExpression) ||
		(exp instanceof OOLanguageSpecificExpression &&
			!((exp as OOLanguageSpecificExpression).snippets.filter[s|s.lang == OOLanguage.JAVA].empty))» = «m.initializerExpression.generateExpression»«ENDIF»«ENDIF»'''
	
	def String generate(OOType t) {
		val arrayNotation = if(t.array) "[]" else ""
		val baseType = if(t.collectionType == OOCollectionType.NONE) t.baseTypeNormal else t.baseTypeObject
		val sb = new StringBuffer
		
		switch (t.collectionType) {
			case LIST: {
				sb.append("List<")
				sb.append(baseType)
				sb.append(arrayNotation)
				sb.append(">")
			}
			case SET: {
				sb.append("Set<")
				sb.append(baseType)
				sb.append(arrayNotation)
				sb.append(">")
			}
			case NONE: {
				sb.append(baseType)
				sb.append(arrayNotation)
			}
		}
		return sb.toString
	}
	
	def String baseTypeNormal(OOType t) {
				switch t.baseType {
			case OOBaseType.BOOLEAN:
				"boolean"
			case OOBaseType.BYTE:
				"byte"
			case OOBaseType.INT:
				"int"
			case OOBaseType.LONG:
				"long"
			case OOBaseType.DOUBLE:
				"double"
			case OOBaseType.STRING:
				"String"
			case OOBaseType.OBJECT:
				if (t.classType != null) t.classType.name else "Object"
		}
	}
	
		def String baseTypeObject(OOType t) {
				switch t.baseType {
			case OOBaseType.BYTE:
				"Byte"
			case OOBaseType.INT:
				"Integer"
			case OOBaseType.LONG:
				"Long"
			case OOBaseType.DOUBLE:
				"Double"
			case OOBaseType.STRING:
				"String"
			case OOBaseType.OBJECT:
				if (t.classType != null) t.classType.name else "Object"
			case BOOLEAN:
				"Boolean"
		}
	}
	
	def String generate(OOMethod m) '''
«m.visibility.generate» «m.generateStatic» «m.returnType.generateReturnType» «m.name»(«m.parameters.generateMethodParams») {
	«FOR s : m.statements»
		«s.generateStatement»
	«ENDFOR»
}'''

	def String generateStatic(OOMethod m) {
		if (m.static) "static" else ""
	} 

	def String generateReturnType(OOType t) {
		return if (t == null) "void" else t.generate		
	}
	
	def generateMethodParams(List<OOVariable> vars) '''«FOR v : vars SEPARATOR ', '»«v.type.generate» «v.name»«ENDFOR»'''
	
	def dispatch String generateStatement(OOStatement s) ''''''
	
	def dispatch String generateStatement(OOVariable s) '''«s.type.generate» «s.name»«IF (s.initializerExpression != null)» = «s.initializerExpression.generateExpression»«ENDIF»;'''
	
	def dispatch String generateStatement(OOReturn s) '''return «s.returnedExpresssion.generateExpression»;'''
	
	def dispatch String generateStatement(OOEmptyStatement s) ''';'''
	
	def dispatch String generateStatement(OOPrint p) '''
		«FOR a : p.parameter»
		System.out.println(«a.generateReference»);
		«ENDFOR»
	'''
	
		def dispatch String generateStatement(OOWriteFile w) 
	'''try (BufferedWriter bw = new BufferedWriter(new FileWriter(«w.getFileName()»))) {
			
			«FOR a : w.parameter»
			bw.write(«a.generateReference»);
			«ENDFOR»

			} catch (IOException e) {
	
				e.printStackTrace();
	
			}
	'''
	
	
	def dispatch String generateStatement(OOIf s) '''
	«var List<OOIf> list = Collections.singletonList(s)»
	«{list.addAll(s.elseIfs) ''}»
	«FOR i : list SEPARATOR ' else '»if («i.condition.generateExpression») {
		«FOR bs : i.bodyStatements»
			«bs.generateStatement»
		«ENDFOR»
	}«ENDFOR» «IF !s.elseStatements.empty» else {
		«FOR es : s.elseStatements»
			«es.generateStatement»
		«ENDFOR»
	}«ENDIF»'''
	
	def dispatch String generateStatement(OOWhile s) '''while («s.condition.generateExpression») {
		«FOR bs : s.bodyStatements»
			«bs.generateStatement»
		«ENDFOR»
	}'''
	
	def dispatch String generateStatement(OODoWhile s) '''do {
		«FOR bs : s.bodyStatements»
			«bs.generateStatement»
		«ENDFOR»
	} while («s.condition.generateExpression»);'''

	def dispatch String generateStatement(OOFor s) '''for («s.initExpression.generateExpression»; «s.condition.generateExpression»; «s.incrementExpression.generateExpression») {
		«FOR bs : s.bodyStatements»
			«bs.generateStatement»
		«ENDFOR»
	}'''
	
	def dispatch String generateStatement(OOForEach s) '''for () {
		«FOR bs : s.bodyStatements»
			«bs.generateStatement»
		«ENDFOR»
	}'''
	
	def dispatch String generateStatement(OOExpression s) '''«s.generateExpression»;'''
	
	def dispatch String generateExpression(OOExpression s) ''''''
	
	def dispatch String generateExpression(OOFloatLiteral s) '''«s.value»'''
	
	def dispatch String generateExpression(OODoubleLiteral s) '''«s.value»'''
	
	def dispatch String generateExpression(OOIntegerLiteral s) '''«s.value»'''
	
	def dispatch String generateExpression(OOLongLiteral s) '''«s.value»'''
	
	def dispatch String generateExpression(OOBoolLiteral s) '''«s.value»'''
	
	def dispatch String generateExpression(OOAssignmentExpression s) '''«s.leftSide.generateExpression» = «s.rightSide.generateExpression»'''
	
	def dispatch String generateExpression(OOVariableReferenceExpression s) '''«s.variable.generateReference»'''
	
	def dispatch String generateExpression(OOArrayIndexing s) '''«s.array.name»[«s.index»]'''
	
	def dispatch String generateExpression(OOAdditionExpression s) '''(«s.leftSide.generateExpression») + («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOSubtractionExpression s) '''(«s.leftSide.generateExpression») - («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OODivisionExpression s) '''(«s.leftSide.generateExpression») / («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOIntegerDivisionExpression s) '''Math.floor((«s.leftSide.generateExpression») / («s.rightSide.generateExpression»))'''
	
	def dispatch String generateExpression(OOMultiplicationExpression s) '''(«s.leftSide.generateExpression») * («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOPowerExpression s) '''Math.pow(«s.leftSide.generateExpression», «s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OORootExpression s) '''Math.pow(«s.leftSide.generateExpression», 1.0 / «s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOLogicalLiteral s) '''«IF s.value»true«ELSE»false«ENDIF»'''
	
	def dispatch String generateExpression(OOBitwiseOrExpression s) '''(«s.leftSide.generateExpression») | («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOBitwiseXorExpression s) '''(«s.leftSide.generateExpression») ^ («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOBitwiseAndExpression s) '''(«s.leftSide.generateExpression») & («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOBitWiseLeftShift s) '''(«s.leftSide.generateExpression») << («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOBitWiseRightShift s) '''(«s.leftSide.generateExpression») >>> («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOBitWiseComplement s) '''~(«s.operand.generateExpression»)'''
	
	def dispatch String generateExpression(OOLanguageSpecificExpression s) '''«var sn = s.snippets.findFirst[e|e.lang == OOLanguage.JAVA]»«if (sn != null) sn.code»'''
	
	def dispatch String generateExpression(OOTypeCast s) '''(«s.type.generate»)(«s.expression.generateExpression»)'''
	
	def dispatch String generateExpression(OONew s) '''new «s.type.generate»(«FOR v : s.constructorParameters SEPARATOR ', '»«v.name»«ENDFOR»)'''
	
	def dispatch String generateReference(OOVariable v) '''«v.name»'''
	
	def dispatch String generateReference(OOMember v) '''this.«v.name»'''
}