/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.aut.oogen.OogenPackage
 * @generated
 */
public class OogenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OogenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OogenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OogenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OogenSwitch<Adapter> modelSwitch =
		new OogenSwitch<Adapter>() {
			@Override
			public Adapter caseOOPackage(OOPackage object) {
				return createOOPackageAdapter();
			}
			@Override
			public Adapter caseOOClass(OOClass object) {
				return createOOClassAdapter();
			}
			@Override
			public Adapter caseOOMember(OOMember object) {
				return createOOMemberAdapter();
			}
			@Override
			public Adapter caseOOVariable(OOVariable object) {
				return createOOVariableAdapter();
			}
			@Override
			public Adapter caseOOType(OOType object) {
				return createOOTypeAdapter();
			}
			@Override
			public Adapter caseOOMethod(OOMethod object) {
				return createOOMethodAdapter();
			}
			@Override
			public Adapter caseOOModel(OOModel object) {
				return createOOModelAdapter();
			}
			@Override
			public Adapter caseOOStatement(OOStatement object) {
				return createOOStatementAdapter();
			}
			@Override
			public Adapter caseOOExpression(OOExpression object) {
				return createOOExpressionAdapter();
			}
			@Override
			public Adapter caseOOReturn(OOReturn object) {
				return createOOReturnAdapter();
			}
			@Override
			public Adapter caseOOArithmeticExpression(OOArithmeticExpression object) {
				return createOOArithmeticExpressionAdapter();
			}
			@Override
			public Adapter caseOOArrayIndexing(OOArrayIndexing object) {
				return createOOArrayIndexingAdapter();
			}
			@Override
			public Adapter caseOOAssignmentExpression(OOAssignmentExpression object) {
				return createOOAssignmentExpressionAdapter();
			}
			@Override
			public Adapter caseOOTwoOperandArithmeticExpression(OOTwoOperandArithmeticExpression object) {
				return createOOTwoOperandArithmeticExpressionAdapter();
			}
			@Override
			public Adapter caseOOAdditionExpression(OOAdditionExpression object) {
				return createOOAdditionExpressionAdapter();
			}
			@Override
			public Adapter caseOOSubtractionExpression(OOSubtractionExpression object) {
				return createOOSubtractionExpressionAdapter();
			}
			@Override
			public Adapter caseOODivisionExpression(OODivisionExpression object) {
				return createOODivisionExpressionAdapter();
			}
			@Override
			public Adapter caseOOIntegerDivisionExpression(OOIntegerDivisionExpression object) {
				return createOOIntegerDivisionExpressionAdapter();
			}
			@Override
			public Adapter caseOOMultiplicationExpression(OOMultiplicationExpression object) {
				return createOOMultiplicationExpressionAdapter();
			}
			@Override
			public Adapter caseOOPowerExpression(OOPowerExpression object) {
				return createOOPowerExpressionAdapter();
			}
			@Override
			public Adapter caseOORootExpression(OORootExpression object) {
				return createOORootExpressionAdapter();
			}
			@Override
			public Adapter caseOOBitwiseOrExpression(OOBitwiseOrExpression object) {
				return createOOBitwiseOrExpressionAdapter();
			}
			@Override
			public Adapter caseOOBitwiseXorExpression(OOBitwiseXorExpression object) {
				return createOOBitwiseXorExpressionAdapter();
			}
			@Override
			public Adapter caseOOBitwiseAndExpression(OOBitwiseAndExpression object) {
				return createOOBitwiseAndExpressionAdapter();
			}
			@Override
			public Adapter caseOOLogicalExpression(OOLogicalExpression object) {
				return createOOLogicalExpressionAdapter();
			}
			@Override
			public Adapter caseOOLogicalLiteral(OOLogicalLiteral object) {
				return createOOLogicalLiteralAdapter();
			}
			@Override
			public Adapter caseOOAndExpression(OOAndExpression object) {
				return createOOAndExpressionAdapter();
			}
			@Override
			public Adapter caseOOOrExpression(OOOrExpression object) {
				return createOOOrExpressionAdapter();
			}
			@Override
			public Adapter caseOOXorExpression(OOXorExpression object) {
				return createOOXorExpressionAdapter();
			}
			@Override
			public Adapter caseOONorExpression(OONorExpression object) {
				return createOONorExpressionAdapter();
			}
			@Override
			public Adapter caseOOTwoOperandLogicalExpression(OOTwoOperandLogicalExpression object) {
				return createOOTwoOperandLogicalExpressionAdapter();
			}
			@Override
			public Adapter caseOOOneOperandLogicalExpression(OOOneOperandLogicalExpression object) {
				return createOOOneOperandLogicalExpressionAdapter();
			}
			@Override
			public Adapter caseOODoubleLiteral(OODoubleLiteral object) {
				return createOODoubleLiteralAdapter();
			}
			@Override
			public Adapter caseOOFloatLiteral(OOFloatLiteral object) {
				return createOOFloatLiteralAdapter();
			}
			@Override
			public Adapter caseOOIntegerLiteral(OOIntegerLiteral object) {
				return createOOIntegerLiteralAdapter();
			}
			@Override
			public Adapter caseOOLongLiteral(OOLongLiteral object) {
				return createOOLongLiteralAdapter();
			}
			@Override
			public Adapter caseOOIf(OOIf object) {
				return createOOIfAdapter();
			}
			@Override
			public Adapter caseOOFor(OOFor object) {
				return createOOForAdapter();
			}
			@Override
			public Adapter caseOOConditionalStatement(OOConditionalStatement object) {
				return createOOConditionalStatementAdapter();
			}
			@Override
			public Adapter caseOOWhile(OOWhile object) {
				return createOOWhileAdapter();
			}
			@Override
			public Adapter caseOODoWhile(OODoWhile object) {
				return createOODoWhileAdapter();
			}
			@Override
			public Adapter caseOOEmptyStatement(OOEmptyStatement object) {
				return createOOEmptyStatementAdapter();
			}
			@Override
			public Adapter caseOOForEach(OOForEach object) {
				return createOOForEachAdapter();
			}
			@Override
			public Adapter caseOOVariableReferenceExpression(OOVariableReferenceExpression object) {
				return createOOVariableReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseOOBitWiseLeftShift(OOBitWiseLeftShift object) {
				return createOOBitWiseLeftShiftAdapter();
			}
			@Override
			public Adapter caseOOBitWiseRightShift(OOBitWiseRightShift object) {
				return createOOBitWiseRightShiftAdapter();
			}
			@Override
			public Adapter caseOOBitWiseComplement(OOBitWiseComplement object) {
				return createOOBitWiseComplementAdapter();
			}
			@Override
			public Adapter caseOOLanguageSpecificExpression(OOLanguageSpecificExpression object) {
				return createOOLanguageSpecificExpressionAdapter();
			}
			@Override
			public Adapter caseOOLanguageSpecificSnippet(OOLanguageSpecificSnippet object) {
				return createOOLanguageSpecificSnippetAdapter();
			}
			@Override
			public Adapter caseOOTypeCast(OOTypeCast object) {
				return createOOTypeCastAdapter();
			}
			@Override
			public Adapter caseOOBoolLiteral(OOBoolLiteral object) {
				return createOOBoolLiteralAdapter();
			}
			@Override
			public Adapter caseOONew(OONew object) {
				return createOONewAdapter();
			}
			@Override
			public Adapter caseOOCompare(OOCompare object) {
				return createOOCompareAdapter();
			}
			@Override
			public Adapter caseOOPrint(OOPrint object) {
				return createOOPrintAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOPackage <em>OO Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOPackage
	 * @generated
	 */
	public Adapter createOOPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOClass <em>OO Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOClass
	 * @generated
	 */
	public Adapter createOOClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOMember <em>OO Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOMember
	 * @generated
	 */
	public Adapter createOOMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOVariable <em>OO Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOVariable
	 * @generated
	 */
	public Adapter createOOVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOType <em>OO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOType
	 * @generated
	 */
	public Adapter createOOTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOMethod <em>OO Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOMethod
	 * @generated
	 */
	public Adapter createOOMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOModel <em>OO Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOModel
	 * @generated
	 */
	public Adapter createOOModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOStatement <em>OO Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOStatement
	 * @generated
	 */
	public Adapter createOOStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOExpression <em>OO Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOExpression
	 * @generated
	 */
	public Adapter createOOExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOReturn <em>OO Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOReturn
	 * @generated
	 */
	public Adapter createOOReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOArithmeticExpression <em>OO Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOArithmeticExpression
	 * @generated
	 */
	public Adapter createOOArithmeticExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOArrayIndexing <em>OO Array Indexing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOArrayIndexing
	 * @generated
	 */
	public Adapter createOOArrayIndexingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOAssignmentExpression <em>OO Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOAssignmentExpression
	 * @generated
	 */
	public Adapter createOOAssignmentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOTwoOperandArithmeticExpression <em>OO Two Operand Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOTwoOperandArithmeticExpression
	 * @generated
	 */
	public Adapter createOOTwoOperandArithmeticExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOAdditionExpression <em>OO Addition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOAdditionExpression
	 * @generated
	 */
	public Adapter createOOAdditionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOSubtractionExpression <em>OO Subtraction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOSubtractionExpression
	 * @generated
	 */
	public Adapter createOOSubtractionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OODivisionExpression <em>OO Division Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OODivisionExpression
	 * @generated
	 */
	public Adapter createOODivisionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOIntegerDivisionExpression <em>OO Integer Division Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOIntegerDivisionExpression
	 * @generated
	 */
	public Adapter createOOIntegerDivisionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOMultiplicationExpression <em>OO Multiplication Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOMultiplicationExpression
	 * @generated
	 */
	public Adapter createOOMultiplicationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOPowerExpression <em>OO Power Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOPowerExpression
	 * @generated
	 */
	public Adapter createOOPowerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OORootExpression <em>OO Root Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OORootExpression
	 * @generated
	 */
	public Adapter createOORootExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOBitwiseOrExpression <em>OO Bitwise Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOBitwiseOrExpression
	 * @generated
	 */
	public Adapter createOOBitwiseOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOBitwiseXorExpression <em>OO Bitwise Xor Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOBitwiseXorExpression
	 * @generated
	 */
	public Adapter createOOBitwiseXorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOBitwiseAndExpression <em>OO Bitwise And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOBitwiseAndExpression
	 * @generated
	 */
	public Adapter createOOBitwiseAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOLogicalExpression <em>OO Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOLogicalExpression
	 * @generated
	 */
	public Adapter createOOLogicalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOLogicalLiteral <em>OO Logical Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOLogicalLiteral
	 * @generated
	 */
	public Adapter createOOLogicalLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOAndExpression <em>OO And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOAndExpression
	 * @generated
	 */
	public Adapter createOOAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOOrExpression <em>OO Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOOrExpression
	 * @generated
	 */
	public Adapter createOOOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOXorExpression <em>OO Xor Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOXorExpression
	 * @generated
	 */
	public Adapter createOOXorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OONorExpression <em>OO Nor Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OONorExpression
	 * @generated
	 */
	public Adapter createOONorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOTwoOperandLogicalExpression <em>OO Two Operand Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOTwoOperandLogicalExpression
	 * @generated
	 */
	public Adapter createOOTwoOperandLogicalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOOneOperandLogicalExpression <em>OO One Operand Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOOneOperandLogicalExpression
	 * @generated
	 */
	public Adapter createOOOneOperandLogicalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OODoubleLiteral <em>OO Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OODoubleLiteral
	 * @generated
	 */
	public Adapter createOODoubleLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOFloatLiteral <em>OO Float Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOFloatLiteral
	 * @generated
	 */
	public Adapter createOOFloatLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOIntegerLiteral <em>OO Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOIntegerLiteral
	 * @generated
	 */
	public Adapter createOOIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOLongLiteral <em>OO Long Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOLongLiteral
	 * @generated
	 */
	public Adapter createOOLongLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOIf <em>OO If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOIf
	 * @generated
	 */
	public Adapter createOOIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOFor <em>OO For</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOFor
	 * @generated
	 */
	public Adapter createOOForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOConditionalStatement <em>OO Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOConditionalStatement
	 * @generated
	 */
	public Adapter createOOConditionalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOWhile <em>OO While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOWhile
	 * @generated
	 */
	public Adapter createOOWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OODoWhile <em>OO Do While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OODoWhile
	 * @generated
	 */
	public Adapter createOODoWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOEmptyStatement <em>OO Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOEmptyStatement
	 * @generated
	 */
	public Adapter createOOEmptyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOForEach <em>OO For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOForEach
	 * @generated
	 */
	public Adapter createOOForEachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOVariableReferenceExpression <em>OO Variable Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOVariableReferenceExpression
	 * @generated
	 */
	public Adapter createOOVariableReferenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOBitWiseLeftShift <em>OO Bit Wise Left Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOBitWiseLeftShift
	 * @generated
	 */
	public Adapter createOOBitWiseLeftShiftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOBitWiseRightShift <em>OO Bit Wise Right Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOBitWiseRightShift
	 * @generated
	 */
	public Adapter createOOBitWiseRightShiftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOBitWiseComplement <em>OO Bit Wise Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOBitWiseComplement
	 * @generated
	 */
	public Adapter createOOBitWiseComplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOLanguageSpecificExpression <em>OO Language Specific Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOLanguageSpecificExpression
	 * @generated
	 */
	public Adapter createOOLanguageSpecificExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOLanguageSpecificSnippet <em>OO Language Specific Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOLanguageSpecificSnippet
	 * @generated
	 */
	public Adapter createOOLanguageSpecificSnippetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOTypeCast <em>OO Type Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOTypeCast
	 * @generated
	 */
	public Adapter createOOTypeCastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOBoolLiteral <em>OO Bool Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOBoolLiteral
	 * @generated
	 */
	public Adapter createOOBoolLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OONew <em>OO New</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OONew
	 * @generated
	 */
	public Adapter createOONewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOCompare <em>OO Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOCompare
	 * @generated
	 */
	public Adapter createOOCompareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.aut.oogen.OOPrint <em>OO Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.aut.oogen.OOPrint
	 * @generated
	 */
	public Adapter createOOPrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OogenAdapterFactory
