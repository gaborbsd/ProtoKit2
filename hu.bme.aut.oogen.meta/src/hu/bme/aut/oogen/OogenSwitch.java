/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.aut.oogen.OogenPackage
 * @generated
 */
public class OogenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OogenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OogenSwitch() {
		if (modelPackage == null) {
			modelPackage = OogenPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OogenPackage.OO_PACKAGE: {
				OOPackage ooPackage = (OOPackage)theEObject;
				T result = caseOOPackage(ooPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_CLASS: {
				OOClass ooClass = (OOClass)theEObject;
				T result = caseOOClass(ooClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_MEMBER: {
				OOMember ooMember = (OOMember)theEObject;
				T result = caseOOMember(ooMember);
				if (result == null) result = caseOOVariable(ooMember);
				if (result == null) result = caseOOStatement(ooMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_VARIABLE: {
				OOVariable ooVariable = (OOVariable)theEObject;
				T result = caseOOVariable(ooVariable);
				if (result == null) result = caseOOStatement(ooVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_TYPE: {
				OOType ooType = (OOType)theEObject;
				T result = caseOOType(ooType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_METHOD: {
				OOMethod ooMethod = (OOMethod)theEObject;
				T result = caseOOMethod(ooMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_MODEL: {
				OOModel ooModel = (OOModel)theEObject;
				T result = caseOOModel(ooModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_STATEMENT: {
				OOStatement ooStatement = (OOStatement)theEObject;
				T result = caseOOStatement(ooStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_EXPRESSION: {
				OOExpression ooExpression = (OOExpression)theEObject;
				T result = caseOOExpression(ooExpression);
				if (result == null) result = caseOOStatement(ooExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_RETURN: {
				OOReturn ooReturn = (OOReturn)theEObject;
				T result = caseOOReturn(ooReturn);
				if (result == null) result = caseOOStatement(ooReturn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_ARITHMETIC_EXPRESSION: {
				OOArithmeticExpression ooArithmeticExpression = (OOArithmeticExpression)theEObject;
				T result = caseOOArithmeticExpression(ooArithmeticExpression);
				if (result == null) result = caseOOExpression(ooArithmeticExpression);
				if (result == null) result = caseOOStatement(ooArithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_ARRAY_INDEXING: {
				OOArrayIndexing ooArrayIndexing = (OOArrayIndexing)theEObject;
				T result = caseOOArrayIndexing(ooArrayIndexing);
				if (result == null) result = caseOOExpression(ooArrayIndexing);
				if (result == null) result = caseOOStatement(ooArrayIndexing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_ASSIGNMENT_EXPRESSION: {
				OOAssignmentExpression ooAssignmentExpression = (OOAssignmentExpression)theEObject;
				T result = caseOOAssignmentExpression(ooAssignmentExpression);
				if (result == null) result = caseOOExpression(ooAssignmentExpression);
				if (result == null) result = caseOOStatement(ooAssignmentExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION: {
				OOTwoOperandArithmeticExpression ooTwoOperandArithmeticExpression = (OOTwoOperandArithmeticExpression)theEObject;
				T result = caseOOTwoOperandArithmeticExpression(ooTwoOperandArithmeticExpression);
				if (result == null) result = caseOOArithmeticExpression(ooTwoOperandArithmeticExpression);
				if (result == null) result = caseOOExpression(ooTwoOperandArithmeticExpression);
				if (result == null) result = caseOOStatement(ooTwoOperandArithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_ADDITION_EXPRESSION: {
				OOAdditionExpression ooAdditionExpression = (OOAdditionExpression)theEObject;
				T result = caseOOAdditionExpression(ooAdditionExpression);
				if (result == null) result = caseOOTwoOperandArithmeticExpression(ooAdditionExpression);
				if (result == null) result = caseOOArithmeticExpression(ooAdditionExpression);
				if (result == null) result = caseOOExpression(ooAdditionExpression);
				if (result == null) result = caseOOStatement(ooAdditionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_SUBTRACTION_EXPRESSION: {
				OOSubtractionExpression ooSubtractionExpression = (OOSubtractionExpression)theEObject;
				T result = caseOOSubtractionExpression(ooSubtractionExpression);
				if (result == null) result = caseOOTwoOperandArithmeticExpression(ooSubtractionExpression);
				if (result == null) result = caseOOArithmeticExpression(ooSubtractionExpression);
				if (result == null) result = caseOOExpression(ooSubtractionExpression);
				if (result == null) result = caseOOStatement(ooSubtractionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_DIVISION_EXPRESSION: {
				OODivisionExpression ooDivisionExpression = (OODivisionExpression)theEObject;
				T result = caseOODivisionExpression(ooDivisionExpression);
				if (result == null) result = caseOOTwoOperandArithmeticExpression(ooDivisionExpression);
				if (result == null) result = caseOOArithmeticExpression(ooDivisionExpression);
				if (result == null) result = caseOOExpression(ooDivisionExpression);
				if (result == null) result = caseOOStatement(ooDivisionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_INTEGER_DIVISION_EXPRESSION: {
				OOIntegerDivisionExpression ooIntegerDivisionExpression = (OOIntegerDivisionExpression)theEObject;
				T result = caseOOIntegerDivisionExpression(ooIntegerDivisionExpression);
				if (result == null) result = caseOOTwoOperandArithmeticExpression(ooIntegerDivisionExpression);
				if (result == null) result = caseOOArithmeticExpression(ooIntegerDivisionExpression);
				if (result == null) result = caseOOExpression(ooIntegerDivisionExpression);
				if (result == null) result = caseOOStatement(ooIntegerDivisionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_MULTIPLICATION_EXPRESSION: {
				OOMultiplicationExpression ooMultiplicationExpression = (OOMultiplicationExpression)theEObject;
				T result = caseOOMultiplicationExpression(ooMultiplicationExpression);
				if (result == null) result = caseOOTwoOperandArithmeticExpression(ooMultiplicationExpression);
				if (result == null) result = caseOOArithmeticExpression(ooMultiplicationExpression);
				if (result == null) result = caseOOExpression(ooMultiplicationExpression);
				if (result == null) result = caseOOStatement(ooMultiplicationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_POWER_EXPRESSION: {
				OOPowerExpression ooPowerExpression = (OOPowerExpression)theEObject;
				T result = caseOOPowerExpression(ooPowerExpression);
				if (result == null) result = caseOOTwoOperandArithmeticExpression(ooPowerExpression);
				if (result == null) result = caseOOArithmeticExpression(ooPowerExpression);
				if (result == null) result = caseOOExpression(ooPowerExpression);
				if (result == null) result = caseOOStatement(ooPowerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_ROOT_EXPRESSION: {
				OORootExpression ooRootExpression = (OORootExpression)theEObject;
				T result = caseOORootExpression(ooRootExpression);
				if (result == null) result = caseOOTwoOperandArithmeticExpression(ooRootExpression);
				if (result == null) result = caseOOArithmeticExpression(ooRootExpression);
				if (result == null) result = caseOOExpression(ooRootExpression);
				if (result == null) result = caseOOStatement(ooRootExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_BITWISE_OR_EXPRESSION: {
				OOBitwiseOrExpression ooBitwiseOrExpression = (OOBitwiseOrExpression)theEObject;
				T result = caseOOBitwiseOrExpression(ooBitwiseOrExpression);
				if (result == null) result = caseOOTwoOperandArithmeticExpression(ooBitwiseOrExpression);
				if (result == null) result = caseOOArithmeticExpression(ooBitwiseOrExpression);
				if (result == null) result = caseOOExpression(ooBitwiseOrExpression);
				if (result == null) result = caseOOStatement(ooBitwiseOrExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_BITWISE_XOR_EXPRESSION: {
				OOBitwiseXorExpression ooBitwiseXorExpression = (OOBitwiseXorExpression)theEObject;
				T result = caseOOBitwiseXorExpression(ooBitwiseXorExpression);
				if (result == null) result = caseOOTwoOperandArithmeticExpression(ooBitwiseXorExpression);
				if (result == null) result = caseOOArithmeticExpression(ooBitwiseXorExpression);
				if (result == null) result = caseOOExpression(ooBitwiseXorExpression);
				if (result == null) result = caseOOStatement(ooBitwiseXorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_BITWISE_AND_EXPRESSION: {
				OOBitwiseAndExpression ooBitwiseAndExpression = (OOBitwiseAndExpression)theEObject;
				T result = caseOOBitwiseAndExpression(ooBitwiseAndExpression);
				if (result == null) result = caseOOTwoOperandArithmeticExpression(ooBitwiseAndExpression);
				if (result == null) result = caseOOArithmeticExpression(ooBitwiseAndExpression);
				if (result == null) result = caseOOExpression(ooBitwiseAndExpression);
				if (result == null) result = caseOOStatement(ooBitwiseAndExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_LOGICAL_EXPRESSION: {
				OOLogicalExpression ooLogicalExpression = (OOLogicalExpression)theEObject;
				T result = caseOOLogicalExpression(ooLogicalExpression);
				if (result == null) result = caseOOExpression(ooLogicalExpression);
				if (result == null) result = caseOOStatement(ooLogicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_LOGICAL_LITERAL: {
				OOLogicalLiteral ooLogicalLiteral = (OOLogicalLiteral)theEObject;
				T result = caseOOLogicalLiteral(ooLogicalLiteral);
				if (result == null) result = caseOOLogicalExpression(ooLogicalLiteral);
				if (result == null) result = caseOOExpression(ooLogicalLiteral);
				if (result == null) result = caseOOStatement(ooLogicalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_AND_EXPRESSION: {
				OOAndExpression ooAndExpression = (OOAndExpression)theEObject;
				T result = caseOOAndExpression(ooAndExpression);
				if (result == null) result = caseOOTwoOperandLogicalExpression(ooAndExpression);
				if (result == null) result = caseOOLogicalExpression(ooAndExpression);
				if (result == null) result = caseOOExpression(ooAndExpression);
				if (result == null) result = caseOOStatement(ooAndExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_OR_EXPRESSION: {
				OOOrExpression ooOrExpression = (OOOrExpression)theEObject;
				T result = caseOOOrExpression(ooOrExpression);
				if (result == null) result = caseOOTwoOperandLogicalExpression(ooOrExpression);
				if (result == null) result = caseOOLogicalExpression(ooOrExpression);
				if (result == null) result = caseOOExpression(ooOrExpression);
				if (result == null) result = caseOOStatement(ooOrExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_XOR_EXPRESSION: {
				OOXorExpression ooXorExpression = (OOXorExpression)theEObject;
				T result = caseOOXorExpression(ooXorExpression);
				if (result == null) result = caseOOTwoOperandLogicalExpression(ooXorExpression);
				if (result == null) result = caseOOLogicalExpression(ooXorExpression);
				if (result == null) result = caseOOExpression(ooXorExpression);
				if (result == null) result = caseOOStatement(ooXorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_NOR_EXPRESSION: {
				OONorExpression ooNorExpression = (OONorExpression)theEObject;
				T result = caseOONorExpression(ooNorExpression);
				if (result == null) result = caseOOOneOperandLogicalExpression(ooNorExpression);
				if (result == null) result = caseOOLogicalExpression(ooNorExpression);
				if (result == null) result = caseOOExpression(ooNorExpression);
				if (result == null) result = caseOOStatement(ooNorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_TWO_OPERAND_LOGICAL_EXPRESSION: {
				OOTwoOperandLogicalExpression ooTwoOperandLogicalExpression = (OOTwoOperandLogicalExpression)theEObject;
				T result = caseOOTwoOperandLogicalExpression(ooTwoOperandLogicalExpression);
				if (result == null) result = caseOOLogicalExpression(ooTwoOperandLogicalExpression);
				if (result == null) result = caseOOExpression(ooTwoOperandLogicalExpression);
				if (result == null) result = caseOOStatement(ooTwoOperandLogicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_ONE_OPERAND_LOGICAL_EXPRESSION: {
				OOOneOperandLogicalExpression ooOneOperandLogicalExpression = (OOOneOperandLogicalExpression)theEObject;
				T result = caseOOOneOperandLogicalExpression(ooOneOperandLogicalExpression);
				if (result == null) result = caseOOLogicalExpression(ooOneOperandLogicalExpression);
				if (result == null) result = caseOOExpression(ooOneOperandLogicalExpression);
				if (result == null) result = caseOOStatement(ooOneOperandLogicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_DOUBLE_LITERAL: {
				OODoubleLiteral ooDoubleLiteral = (OODoubleLiteral)theEObject;
				T result = caseOODoubleLiteral(ooDoubleLiteral);
				if (result == null) result = caseOOArithmeticExpression(ooDoubleLiteral);
				if (result == null) result = caseOOExpression(ooDoubleLiteral);
				if (result == null) result = caseOOStatement(ooDoubleLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_FLOAT_LITERAL: {
				OOFloatLiteral ooFloatLiteral = (OOFloatLiteral)theEObject;
				T result = caseOOFloatLiteral(ooFloatLiteral);
				if (result == null) result = caseOOArithmeticExpression(ooFloatLiteral);
				if (result == null) result = caseOOExpression(ooFloatLiteral);
				if (result == null) result = caseOOStatement(ooFloatLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_INTEGER_LITERAL: {
				OOIntegerLiteral ooIntegerLiteral = (OOIntegerLiteral)theEObject;
				T result = caseOOIntegerLiteral(ooIntegerLiteral);
				if (result == null) result = caseOOArithmeticExpression(ooIntegerLiteral);
				if (result == null) result = caseOOExpression(ooIntegerLiteral);
				if (result == null) result = caseOOStatement(ooIntegerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_LONG_LITERAL: {
				OOLongLiteral ooLongLiteral = (OOLongLiteral)theEObject;
				T result = caseOOLongLiteral(ooLongLiteral);
				if (result == null) result = caseOOArithmeticExpression(ooLongLiteral);
				if (result == null) result = caseOOExpression(ooLongLiteral);
				if (result == null) result = caseOOStatement(ooLongLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_IF: {
				OOIf ooIf = (OOIf)theEObject;
				T result = caseOOIf(ooIf);
				if (result == null) result = caseOOConditionalStatement(ooIf);
				if (result == null) result = caseOOStatement(ooIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_FOR: {
				OOFor ooFor = (OOFor)theEObject;
				T result = caseOOFor(ooFor);
				if (result == null) result = caseOOConditionalStatement(ooFor);
				if (result == null) result = caseOOStatement(ooFor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_CONDITIONAL_STATEMENT: {
				OOConditionalStatement ooConditionalStatement = (OOConditionalStatement)theEObject;
				T result = caseOOConditionalStatement(ooConditionalStatement);
				if (result == null) result = caseOOStatement(ooConditionalStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_WHILE: {
				OOWhile ooWhile = (OOWhile)theEObject;
				T result = caseOOWhile(ooWhile);
				if (result == null) result = caseOOConditionalStatement(ooWhile);
				if (result == null) result = caseOOStatement(ooWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_DO_WHILE: {
				OODoWhile ooDoWhile = (OODoWhile)theEObject;
				T result = caseOODoWhile(ooDoWhile);
				if (result == null) result = caseOOConditionalStatement(ooDoWhile);
				if (result == null) result = caseOOStatement(ooDoWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_EMPTY_STATEMENT: {
				OOEmptyStatement ooEmptyStatement = (OOEmptyStatement)theEObject;
				T result = caseOOEmptyStatement(ooEmptyStatement);
				if (result == null) result = caseOOStatement(ooEmptyStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_FOR_EACH: {
				OOForEach ooForEach = (OOForEach)theEObject;
				T result = caseOOForEach(ooForEach);
				if (result == null) result = caseOOStatement(ooForEach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_VARIABLE_REFERENCE_EXPRESSION: {
				OOVariableReferenceExpression ooVariableReferenceExpression = (OOVariableReferenceExpression)theEObject;
				T result = caseOOVariableReferenceExpression(ooVariableReferenceExpression);
				if (result == null) result = caseOOExpression(ooVariableReferenceExpression);
				if (result == null) result = caseOOStatement(ooVariableReferenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_BIT_WISE_LEFT_SHIFT: {
				OOBitWiseLeftShift ooBitWiseLeftShift = (OOBitWiseLeftShift)theEObject;
				T result = caseOOBitWiseLeftShift(ooBitWiseLeftShift);
				if (result == null) result = caseOOTwoOperandArithmeticExpression(ooBitWiseLeftShift);
				if (result == null) result = caseOOArithmeticExpression(ooBitWiseLeftShift);
				if (result == null) result = caseOOExpression(ooBitWiseLeftShift);
				if (result == null) result = caseOOStatement(ooBitWiseLeftShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_BIT_WISE_RIGHT_SHIFT: {
				OOBitWiseRightShift ooBitWiseRightShift = (OOBitWiseRightShift)theEObject;
				T result = caseOOBitWiseRightShift(ooBitWiseRightShift);
				if (result == null) result = caseOOTwoOperandArithmeticExpression(ooBitWiseRightShift);
				if (result == null) result = caseOOArithmeticExpression(ooBitWiseRightShift);
				if (result == null) result = caseOOExpression(ooBitWiseRightShift);
				if (result == null) result = caseOOStatement(ooBitWiseRightShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_BIT_WISE_COMPLEMENT: {
				OOBitWiseComplement ooBitWiseComplement = (OOBitWiseComplement)theEObject;
				T result = caseOOBitWiseComplement(ooBitWiseComplement);
				if (result == null) result = caseOOArithmeticExpression(ooBitWiseComplement);
				if (result == null) result = caseOOExpression(ooBitWiseComplement);
				if (result == null) result = caseOOStatement(ooBitWiseComplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_LANGUAGE_SPECIFIC_EXPRESSION: {
				OOLanguageSpecificExpression ooLanguageSpecificExpression = (OOLanguageSpecificExpression)theEObject;
				T result = caseOOLanguageSpecificExpression(ooLanguageSpecificExpression);
				if (result == null) result = caseOOLogicalExpression(ooLanguageSpecificExpression);
				if (result == null) result = caseOOExpression(ooLanguageSpecificExpression);
				if (result == null) result = caseOOStatement(ooLanguageSpecificExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_LANGUAGE_SPECIFIC_SNIPPET: {
				OOLanguageSpecificSnippet ooLanguageSpecificSnippet = (OOLanguageSpecificSnippet)theEObject;
				T result = caseOOLanguageSpecificSnippet(ooLanguageSpecificSnippet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_TYPE_CAST: {
				OOTypeCast ooTypeCast = (OOTypeCast)theEObject;
				T result = caseOOTypeCast(ooTypeCast);
				if (result == null) result = caseOOExpression(ooTypeCast);
				if (result == null) result = caseOOStatement(ooTypeCast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_BOOL_LITERAL: {
				OOBoolLiteral ooBoolLiteral = (OOBoolLiteral)theEObject;
				T result = caseOOBoolLiteral(ooBoolLiteral);
				if (result == null) result = caseOOExpression(ooBoolLiteral);
				if (result == null) result = caseOOStatement(ooBoolLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_NEW: {
				OONew ooNew = (OONew)theEObject;
				T result = caseOONew(ooNew);
				if (result == null) result = caseOOExpression(ooNew);
				if (result == null) result = caseOOStatement(ooNew);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OogenPackage.OO_COMPARE: {
				OOCompare ooCompare = (OOCompare)theEObject;
				T result = caseOOCompare(ooCompare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOPackage(OOPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOClass(OOClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOMember(OOMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOVariable(OOVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOType(OOType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOMethod(OOMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOModel(OOModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOStatement(OOStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOExpression(OOExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOReturn(OOReturn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOArithmeticExpression(OOArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Array Indexing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Array Indexing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOArrayIndexing(OOArrayIndexing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Assignment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOAssignmentExpression(OOAssignmentExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Two Operand Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Two Operand Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOTwoOperandArithmeticExpression(OOTwoOperandArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Addition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Addition Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOAdditionExpression(OOAdditionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Subtraction Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Subtraction Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOSubtractionExpression(OOSubtractionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Division Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Division Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOODivisionExpression(OODivisionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Integer Division Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Integer Division Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOIntegerDivisionExpression(OOIntegerDivisionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Multiplication Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Multiplication Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOMultiplicationExpression(OOMultiplicationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Power Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Power Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOPowerExpression(OOPowerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Root Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Root Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOORootExpression(OORootExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Bitwise Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Bitwise Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOBitwiseOrExpression(OOBitwiseOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Bitwise Xor Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Bitwise Xor Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOBitwiseXorExpression(OOBitwiseXorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Bitwise And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Bitwise And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOBitwiseAndExpression(OOBitwiseAndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOLogicalExpression(OOLogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Logical Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Logical Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOLogicalLiteral(OOLogicalLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOAndExpression(OOAndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOOrExpression(OOOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Xor Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Xor Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOXorExpression(OOXorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Nor Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Nor Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOONorExpression(OONorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Two Operand Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Two Operand Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOTwoOperandLogicalExpression(OOTwoOperandLogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO One Operand Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO One Operand Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOOneOperandLogicalExpression(OOOneOperandLogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Double Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOODoubleLiteral(OODoubleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Float Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOFloatLiteral(OOFloatLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOIntegerLiteral(OOIntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Long Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Long Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOLongLiteral(OOLongLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOIf(OOIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO For</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO For</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOFor(OOFor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Conditional Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Conditional Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOConditionalStatement(OOConditionalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOWhile(OOWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Do While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Do While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOODoWhile(OODoWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Empty Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Empty Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOEmptyStatement(OOEmptyStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO For Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO For Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOForEach(OOForEach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Variable Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Variable Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOVariableReferenceExpression(OOVariableReferenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Bit Wise Left Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Bit Wise Left Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOBitWiseLeftShift(OOBitWiseLeftShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Bit Wise Right Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Bit Wise Right Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOBitWiseRightShift(OOBitWiseRightShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Bit Wise Complement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Bit Wise Complement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOBitWiseComplement(OOBitWiseComplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Language Specific Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Language Specific Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOLanguageSpecificExpression(OOLanguageSpecificExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Language Specific Snippet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Language Specific Snippet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOLanguageSpecificSnippet(OOLanguageSpecificSnippet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Type Cast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Type Cast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOTypeCast(OOTypeCast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Bool Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Bool Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOBoolLiteral(OOBoolLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO New</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO New</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOONew(OONew object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OO Compare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OO Compare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOCompare(OOCompare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OogenSwitch
