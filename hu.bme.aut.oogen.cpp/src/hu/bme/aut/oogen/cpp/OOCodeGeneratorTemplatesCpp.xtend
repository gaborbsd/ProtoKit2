package hu.bme.aut.oogen.cpp

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
import hu.bme.aut.oogen.OOLanguage
import hu.bme.aut.oogen.OOLanguageSpecificExpression
import hu.bme.aut.oogen.OOTypeCast
import hu.bme.aut.oogen.OOBoolLiteral
import hu.bme.aut.oogen.OONew

class OOCodeGeneratorTemplatesCpp implements OOCodeGeneratorTemplates {
	
	private static OOCodeGeneratorTemplatesCpp instance;
	
	def static OOCodeGeneratorTemplatesCpp getInstance() {
		if (instance == null)
			instance = new OOCodeGeneratorTemplatesCpp();
		return instance;
	}
	
	override String generate(OOClass cl) '''	
namespace «cl.package.name»;

#include <cmath>

class «cl.name» {
	«IF !cl.members.filter[m|m.languages.empty || m.languages.contains(OOLanguage.CPP)].filter[m | m.visibility == OOVisibility.PRIVATE].empty»
	private:
	«FOR m : cl.members.filter[m|m.languages.empty || m.languages.contains(OOLanguage.CPP)].filter[m | m.visibility == OOVisibility.PRIVATE]»
	«m.generate»
	«ENDFOR»
	«ENDIF»
	
	«IF !cl.members.filter[m|m.languages.empty || m.languages.contains(OOLanguage.CPP)].filter[m | m.visibility == OOVisibility.PACKAGE || m.visibility == OOVisibility.PROTECTED].empty»
	protected:
	«FOR m : cl.members.filter[m|m.languages.empty || m.languages.contains(OOLanguage.CPP)].filter[m | m.visibility == OOVisibility.PACKAGE || m.visibility == OOVisibility.PROTECTED]»
	«m.generate»
	«ENDFOR»
	«ENDIF»
	
	«IF !cl.members.filter[m|m.languages.empty || m.languages.contains(OOLanguage.CPP)].filter[m | m.visibility == OOVisibility.PUBLIC].empty»
	public:
	«FOR m : cl.members.filter[m|m.languages.empty || m.languages.contains(OOLanguage.CPP)].filter[m | m.visibility == OOVisibility.PUBLIC]»
	«m.generate»
	«ENDFOR»
	«ENDIF»
	
	«IF !cl.methods.filter[m|m.languages.empty || m.languages.contains(OOLanguage.CPP)].filter[m | m.visibility == OOVisibility.PRIVATE].empty»
	private:
	«FOR m : cl.methods.filter[m|m.languages.empty || m.languages.contains(OOLanguage.CPP)].filter[m | m.visibility == OOVisibility.PRIVATE]»
	«m.generate»
	«ENDFOR»
	«ENDIF»
	
	«IF !cl.methods.filter[m|m.languages.empty || m.languages.contains(OOLanguage.CPP)].filter[m | m.visibility == OOVisibility.PACKAGE || m.visibility == OOVisibility.PROTECTED].empty»
	protected:
	«FOR m : cl.methods.filter[m|m.languages.empty || m.languages.contains(OOLanguage.CPP)].filter[m | m.visibility == OOVisibility.PACKAGE || m.visibility == OOVisibility.PROTECTED]»
	«m.generate»
	«ENDFOR»
	«ENDIF»
	
	«IF !cl.methods.filter[m|m.languages.empty || m.languages.contains(OOLanguage.CPP)].filter[m | m.visibility == OOVisibility.PUBLIC].empty»
	public:
	«FOR m : cl.methods.filter[m|m.languages.empty || m.languages.contains(OOLanguage.CPP)].filter[m | m.visibility == OOVisibility.PUBLIC]»
	«m.generate»
	«ENDFOR»
	«ENDIF»
	
}
	'''
	
	def String generate(OOMember m) '''
«m.type.generate» «m.name»;
'''
	
	def String generate(OOType t) {
		val baseType = if(t.collectionType == OOCollectionType.NONE) t.baseTypeNormal else t.baseTypeObject
		val sb = new StringBuffer
		
		if (t.array) {
					sb.append("std::vector<")
					sb.append(baseType)
					sb.append(">")
		} else {
			switch (t.collectionType) {
				case LIST: {
					sb.append("std::list<")
					sb.append(baseType)
					sb.append(">")
				}
				case SET: {
					sb.append("set<")
					sb.append(baseType)
					sb.append(">")
				}
				case NONE: {
					sb.append(baseType)
				}
			}
		}
		return sb.toString
	}
	
	def String baseTypeNormal(OOType t) {
				switch t.baseType {
			case OOBaseType.BOOLEAN:
				"bool"
			case OOBaseType.BYTE:
				"char"
			case OOBaseType.INT:
				"int"
			case OOBaseType.LONG:
				"long"
			case OOBaseType.DOUBLE:
				"double"
			case OOBaseType.STRING:
				"string"
			case OOBaseType.OBJECT:
				if (t.classType != null) t.classType.name else "void *"
		}
	}
	
		def String baseTypeObject(OOType t) {
				switch t.baseType {
			case OOBaseType.BOOLEAN:
				"bool"
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
				if (t.classType != null) t.classType.name else "void *"
		}
	}
	
	def String generate(OOMethod m) '''
«m.generateStatic» «m.returnType.generateReturnType» «m.name»(«m.parameters.generateMethodParams») {
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
	
	def dispatch String generateStatement(OOIf s) '''
	«var List<OOIf> list = Collections.singletonList(s)»
	«list.addAll(s.elseIfs)»
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
	
	def dispatch String generateStatement(OONew s) '''new «s.type.generate»(«FOR v : s.constructorParameters SEPARATOR ', '»«v.name»«ENDFOR»)'''
	
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
	
	def dispatch String generateExpression(OOIntegerDivisionExpression s) '''((long)«s.leftSide.generateExpression») / ((long)«s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOMultiplicationExpression s) '''(«s.leftSide.generateExpression») * («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOPowerExpression s) '''pow(«s.leftSide.generateExpression», «s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OORootExpression s) '''pow(«s.leftSide.generateExpression», 1.0 / «s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOLogicalLiteral s) '''«IF s.value»true«ELSE»false«ENDIF»'''
	
	def dispatch String generateExpression(OOBitwiseOrExpression s) '''(«s.leftSide.generateExpression») | («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOBitwiseXorExpression s) '''(«s.leftSide.generateExpression») ^ («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOBitwiseAndExpression s) '''(«s.leftSide.generateExpression») & («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOBitWiseLeftShift s) '''(«s.leftSide.generateExpression») << («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOBitWiseRightShift s) '''(«s.leftSide.generateExpression») >> («s.rightSide.generateExpression»)'''
	
	def dispatch String generateExpression(OOBitWiseComplement s) '''~(«s.operand.generateExpression»)'''
	
	def dispatch String generateExpression(OOLanguageSpecificExpression s) '''«var sn = s.snippets.findFirst[e|e.lang == OOLanguage.CPP]»«if (sn != null) sn.code»'''
	
	def dispatch String generateExpression(OOTypeCast s) '''(«s.type.generate»)(«s.expression.generateExpression»)'''
	
	def dispatch String generateExpression(OONew s) '''new «s.type.generate»(«FOR v : s.constructorParameters SEPARATOR ', '»«v.name»«ENDFOR»)'''
	
	def dispatch String generateReference(OOVariable v) '''«v.name»'''
	
	def dispatch String generateReference(OOMember v) '''this.«v.name»'''
}