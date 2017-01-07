/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OogenFactoryImpl extends EFactoryImpl implements OogenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OogenFactory init() {
		try {
			OogenFactory theOogenFactory = (OogenFactory)EPackage.Registry.INSTANCE.getEFactory(OogenPackage.eNS_URI);
			if (theOogenFactory != null) {
				return theOogenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OogenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OogenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OogenPackage.OO_PACKAGE: return createOOPackage();
			case OogenPackage.OO_CLASS: return createOOClass();
			case OogenPackage.OO_MEMBER: return createOOMember();
			case OogenPackage.OO_VARIABLE: return createOOVariable();
			case OogenPackage.OO_TYPE: return createOOType();
			case OogenPackage.OO_METHOD: return createOOMethod();
			case OogenPackage.OO_MODEL: return createOOModel();
			case OogenPackage.OO_STATEMENT: return createOOStatement();
			case OogenPackage.OO_EXPRESSION: return createOOExpression();
			case OogenPackage.OO_RETURN: return createOOReturn();
			case OogenPackage.OO_ARITHMETIC_EXPRESSION: return createOOArithmeticExpression();
			case OogenPackage.OO_ARRAY_INDEXING: return createOOArrayIndexing();
			case OogenPackage.OO_ASSIGNMENT_EXPRESSION: return createOOAssignmentExpression();
			case OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION: return createOOTwoOperandArithmeticExpression();
			case OogenPackage.OO_ADDITION_EXPRESSION: return createOOAdditionExpression();
			case OogenPackage.OO_SUBTRACTION_EXPRESSION: return createOOSubtractionExpression();
			case OogenPackage.OO_DIVISION_EXPRESSION: return createOODivisionExpression();
			case OogenPackage.OO_INTEGER_DIVISION_EXPRESSION: return createOOIntegerDivisionExpression();
			case OogenPackage.OO_MULTIPLICATION_EXPRESSION: return createOOMultiplicationExpression();
			case OogenPackage.OO_POWER_EXPRESSION: return createOOPowerExpression();
			case OogenPackage.OO_ROOT_EXPRESSION: return createOORootExpression();
			case OogenPackage.OO_BITWISE_OR_EXPRESSION: return createOOBitwiseOrExpression();
			case OogenPackage.OO_BITWISE_XOR_EXPRESSION: return createOOBitwiseXorExpression();
			case OogenPackage.OO_BITWISE_AND_EXPRESSION: return createOOBitwiseAndExpression();
			case OogenPackage.OO_LOGICAL_EXPRESSION: return createOOLogicalExpression();
			case OogenPackage.OO_LOGICAL_LITERAL: return createOOLogicalLiteral();
			case OogenPackage.OO_AND_EXPRESSION: return createOOAndExpression();
			case OogenPackage.OO_OR_EXPRESSION: return createOOOrExpression();
			case OogenPackage.OO_XOR_EXPRESSION: return createOOXorExpression();
			case OogenPackage.OO_NOR_EXPRESSION: return createOONorExpression();
			case OogenPackage.OO_TWO_OPERAND_LOGICAL_EXPRESSION: return createOOTwoOperandLogicalExpression();
			case OogenPackage.OO_ONE_OPERAND_LOGICAL_EXPRESSION: return createOOOneOperandLogicalExpression();
			case OogenPackage.OO_DOUBLE_LITERAL: return createOODoubleLiteral();
			case OogenPackage.OO_FLOAT_LITERAL: return createOOFloatLiteral();
			case OogenPackage.OO_INTEGER_LITERAL: return createOOIntegerLiteral();
			case OogenPackage.OO_LONG_LITERAL: return createOOLongLiteral();
			case OogenPackage.OO_IF: return createOOIf();
			case OogenPackage.OO_FOR: return createOOFor();
			case OogenPackage.OO_CONDITIONAL_STATEMENT: return createOOConditionalStatement();
			case OogenPackage.OO_WHILE: return createOOWhile();
			case OogenPackage.OO_DO_WHILE: return createOODoWhile();
			case OogenPackage.OO_EMPTY_STATEMENT: return createOOEmptyStatement();
			case OogenPackage.OO_FOR_EACH: return createOOForEach();
			case OogenPackage.OO_VARIABLE_REFERENCE_EXPRESSION: return createOOVariableReferenceExpression();
			case OogenPackage.OO_BIT_WISE_LEFT_SHIFT: return createOOBitWiseLeftShift();
			case OogenPackage.OO_BIT_WISE_RIGHT_SHIFT: return createOOBitWiseRightShift();
			case OogenPackage.OO_BIT_WISE_COMPLEMENT: return createOOBitWiseComplement();
			case OogenPackage.OO_LANGUAGE_SPECIFIC_EXPRESSION: return createOOLanguageSpecificExpression();
			case OogenPackage.OO_LANGUAGE_SPECIFIC_SNIPPET: return createOOLanguageSpecificSnippet();
			case OogenPackage.OO_TYPE_CAST: return createOOTypeCast();
			case OogenPackage.OO_BOOL_LITERAL: return createOOBoolLiteral();
			case OogenPackage.OO_NEW: return createOONew();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OogenPackage.OO_BASE_TYPE:
				return createOOBaseTypeFromString(eDataType, initialValue);
			case OogenPackage.OO_VISIBILITY:
				return createOOVisibilityFromString(eDataType, initialValue);
			case OogenPackage.OO_COLLECTION_TYPE:
				return createOOCollectionTypeFromString(eDataType, initialValue);
			case OogenPackage.OO_LANGUAGE:
				return createOOLanguageFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OogenPackage.OO_BASE_TYPE:
				return convertOOBaseTypeToString(eDataType, instanceValue);
			case OogenPackage.OO_VISIBILITY:
				return convertOOVisibilityToString(eDataType, instanceValue);
			case OogenPackage.OO_COLLECTION_TYPE:
				return convertOOCollectionTypeToString(eDataType, instanceValue);
			case OogenPackage.OO_LANGUAGE:
				return convertOOLanguageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPackage createOOPackage() {
		OOPackageImpl ooPackage = new OOPackageImpl();
		return ooPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOClass createOOClass() {
		OOClassImpl ooClass = new OOClassImpl();
		return ooClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOMember createOOMember() {
		OOMemberImpl ooMember = new OOMemberImpl();
		return ooMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOVariable createOOVariable() {
		OOVariableImpl ooVariable = new OOVariableImpl();
		return ooVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOType createOOType() {
		OOTypeImpl ooType = new OOTypeImpl();
		return ooType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOMethod createOOMethod() {
		OOMethodImpl ooMethod = new OOMethodImpl();
		return ooMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOModel createOOModel() {
		OOModelImpl ooModel = new OOModelImpl();
		return ooModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOStatement createOOStatement() {
		OOStatementImpl ooStatement = new OOStatementImpl();
		return ooStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOExpression createOOExpression() {
		OOExpressionImpl ooExpression = new OOExpressionImpl();
		return ooExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOReturn createOOReturn() {
		OOReturnImpl ooReturn = new OOReturnImpl();
		return ooReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOArithmeticExpression createOOArithmeticExpression() {
		OOArithmeticExpressionImpl ooArithmeticExpression = new OOArithmeticExpressionImpl();
		return ooArithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOArrayIndexing createOOArrayIndexing() {
		OOArrayIndexingImpl ooArrayIndexing = new OOArrayIndexingImpl();
		return ooArrayIndexing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOAssignmentExpression createOOAssignmentExpression() {
		OOAssignmentExpressionImpl ooAssignmentExpression = new OOAssignmentExpressionImpl();
		return ooAssignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOTwoOperandArithmeticExpression createOOTwoOperandArithmeticExpression() {
		OOTwoOperandArithmeticExpressionImpl ooTwoOperandArithmeticExpression = new OOTwoOperandArithmeticExpressionImpl();
		return ooTwoOperandArithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOAdditionExpression createOOAdditionExpression() {
		OOAdditionExpressionImpl ooAdditionExpression = new OOAdditionExpressionImpl();
		return ooAdditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOSubtractionExpression createOOSubtractionExpression() {
		OOSubtractionExpressionImpl ooSubtractionExpression = new OOSubtractionExpressionImpl();
		return ooSubtractionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OODivisionExpression createOODivisionExpression() {
		OODivisionExpressionImpl ooDivisionExpression = new OODivisionExpressionImpl();
		return ooDivisionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOIntegerDivisionExpression createOOIntegerDivisionExpression() {
		OOIntegerDivisionExpressionImpl ooIntegerDivisionExpression = new OOIntegerDivisionExpressionImpl();
		return ooIntegerDivisionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOMultiplicationExpression createOOMultiplicationExpression() {
		OOMultiplicationExpressionImpl ooMultiplicationExpression = new OOMultiplicationExpressionImpl();
		return ooMultiplicationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPowerExpression createOOPowerExpression() {
		OOPowerExpressionImpl ooPowerExpression = new OOPowerExpressionImpl();
		return ooPowerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OORootExpression createOORootExpression() {
		OORootExpressionImpl ooRootExpression = new OORootExpressionImpl();
		return ooRootExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOBitwiseOrExpression createOOBitwiseOrExpression() {
		OOBitwiseOrExpressionImpl ooBitwiseOrExpression = new OOBitwiseOrExpressionImpl();
		return ooBitwiseOrExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOBitwiseXorExpression createOOBitwiseXorExpression() {
		OOBitwiseXorExpressionImpl ooBitwiseXorExpression = new OOBitwiseXorExpressionImpl();
		return ooBitwiseXorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOBitwiseAndExpression createOOBitwiseAndExpression() {
		OOBitwiseAndExpressionImpl ooBitwiseAndExpression = new OOBitwiseAndExpressionImpl();
		return ooBitwiseAndExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOLogicalExpression createOOLogicalExpression() {
		OOLogicalExpressionImpl ooLogicalExpression = new OOLogicalExpressionImpl();
		return ooLogicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOLogicalLiteral createOOLogicalLiteral() {
		OOLogicalLiteralImpl ooLogicalLiteral = new OOLogicalLiteralImpl();
		return ooLogicalLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOAndExpression createOOAndExpression() {
		OOAndExpressionImpl ooAndExpression = new OOAndExpressionImpl();
		return ooAndExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOOrExpression createOOOrExpression() {
		OOOrExpressionImpl ooOrExpression = new OOOrExpressionImpl();
		return ooOrExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOXorExpression createOOXorExpression() {
		OOXorExpressionImpl ooXorExpression = new OOXorExpressionImpl();
		return ooXorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OONorExpression createOONorExpression() {
		OONorExpressionImpl ooNorExpression = new OONorExpressionImpl();
		return ooNorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOTwoOperandLogicalExpression createOOTwoOperandLogicalExpression() {
		OOTwoOperandLogicalExpressionImpl ooTwoOperandLogicalExpression = new OOTwoOperandLogicalExpressionImpl();
		return ooTwoOperandLogicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOOneOperandLogicalExpression createOOOneOperandLogicalExpression() {
		OOOneOperandLogicalExpressionImpl ooOneOperandLogicalExpression = new OOOneOperandLogicalExpressionImpl();
		return ooOneOperandLogicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OODoubleLiteral createOODoubleLiteral() {
		OODoubleLiteralImpl ooDoubleLiteral = new OODoubleLiteralImpl();
		return ooDoubleLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOFloatLiteral createOOFloatLiteral() {
		OOFloatLiteralImpl ooFloatLiteral = new OOFloatLiteralImpl();
		return ooFloatLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOIntegerLiteral createOOIntegerLiteral() {
		OOIntegerLiteralImpl ooIntegerLiteral = new OOIntegerLiteralImpl();
		return ooIntegerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOLongLiteral createOOLongLiteral() {
		OOLongLiteralImpl ooLongLiteral = new OOLongLiteralImpl();
		return ooLongLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOIf createOOIf() {
		OOIfImpl ooIf = new OOIfImpl();
		return ooIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOFor createOOFor() {
		OOForImpl ooFor = new OOForImpl();
		return ooFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOConditionalStatement createOOConditionalStatement() {
		OOConditionalStatementImpl ooConditionalStatement = new OOConditionalStatementImpl();
		return ooConditionalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOWhile createOOWhile() {
		OOWhileImpl ooWhile = new OOWhileImpl();
		return ooWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OODoWhile createOODoWhile() {
		OODoWhileImpl ooDoWhile = new OODoWhileImpl();
		return ooDoWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOEmptyStatement createOOEmptyStatement() {
		OOEmptyStatementImpl ooEmptyStatement = new OOEmptyStatementImpl();
		return ooEmptyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOForEach createOOForEach() {
		OOForEachImpl ooForEach = new OOForEachImpl();
		return ooForEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOVariableReferenceExpression createOOVariableReferenceExpression() {
		OOVariableReferenceExpressionImpl ooVariableReferenceExpression = new OOVariableReferenceExpressionImpl();
		return ooVariableReferenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOBitWiseLeftShift createOOBitWiseLeftShift() {
		OOBitWiseLeftShiftImpl ooBitWiseLeftShift = new OOBitWiseLeftShiftImpl();
		return ooBitWiseLeftShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOBitWiseRightShift createOOBitWiseRightShift() {
		OOBitWiseRightShiftImpl ooBitWiseRightShift = new OOBitWiseRightShiftImpl();
		return ooBitWiseRightShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOBitWiseComplement createOOBitWiseComplement() {
		OOBitWiseComplementImpl ooBitWiseComplement = new OOBitWiseComplementImpl();
		return ooBitWiseComplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOLanguageSpecificExpression createOOLanguageSpecificExpression() {
		OOLanguageSpecificExpressionImpl ooLanguageSpecificExpression = new OOLanguageSpecificExpressionImpl();
		return ooLanguageSpecificExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOLanguageSpecificSnippet createOOLanguageSpecificSnippet() {
		OOLanguageSpecificSnippetImpl ooLanguageSpecificSnippet = new OOLanguageSpecificSnippetImpl();
		return ooLanguageSpecificSnippet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOTypeCast createOOTypeCast() {
		OOTypeCastImpl ooTypeCast = new OOTypeCastImpl();
		return ooTypeCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOBoolLiteral createOOBoolLiteral() {
		OOBoolLiteralImpl ooBoolLiteral = new OOBoolLiteralImpl();
		return ooBoolLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OONew createOONew() {
		OONewImpl ooNew = new OONewImpl();
		return ooNew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOBaseType createOOBaseTypeFromString(EDataType eDataType, String initialValue) {
		OOBaseType result = OOBaseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOOBaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOVisibility createOOVisibilityFromString(EDataType eDataType, String initialValue) {
		OOVisibility result = OOVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOOVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOCollectionType createOOCollectionTypeFromString(EDataType eDataType, String initialValue) {
		OOCollectionType result = OOCollectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOOCollectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOLanguage createOOLanguageFromString(EDataType eDataType, String initialValue) {
		OOLanguage result = OOLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOOLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OogenPackage getOogenPackage() {
		return (OogenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OogenPackage getPackage() {
		return OogenPackage.eINSTANCE;
	}

} //OogenFactoryImpl
