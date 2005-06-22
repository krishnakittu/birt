/***********************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Actuate Corporation - initial API and implementation
 ***********************************************************************/

package org.eclipse.birt.chart.model.attribute;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Stretch</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc -->
 * 
 * This type represents the options available for stretching (filling) block
 * contents.
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.birt.chart.model.attribute.AttributePackage#getStretch()
 * @model
 * @generated
 */
public final class Stretch extends AbstractEnumerator
{

	/**
	 * The '<em><b>Horizontal</b></em>' literal value. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #HORIZONTAL_LITERAL
	 * @model name="Horizontal"
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL = 0;

	/**
	 * The '<em><b>Vertical</b></em>' literal value. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #VERTICAL_LITERAL
	 * @model name="Vertical"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL = 1;

	/**
	 * The '<em><b>Both</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #BOTH_LITERAL
	 * @model name="Both"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH = 2;

	/**
	 * The '<em><b>Horizontal</b></em>' literal object. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Horizontal</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #HORIZONTAL
	 * @generated
	 * @ordered
	 */
	public static final Stretch HORIZONTAL_LITERAL = new Stretch( HORIZONTAL,
			"Horizontal" ); //$NON-NLS-1$

	/**
	 * The '<em><b>Vertical</b></em>' literal object. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Vertical</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #VERTICAL
	 * @generated
	 * @ordered
	 */
	public static final Stretch VERTICAL_LITERAL = new Stretch( VERTICAL,
			"Vertical" ); //$NON-NLS-1$

	/**
	 * The '<em><b>Both</b></em>' literal object. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Both</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #BOTH
	 * @generated
	 * @ordered
	 */
	public static final Stretch BOTH_LITERAL = new Stretch( BOTH, "Both" ); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Stretch</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final Stretch[] VALUES_ARRAY = new Stretch[]{
			HORIZONTAL_LITERAL, VERTICAL_LITERAL, BOTH_LITERAL,
	};

	/**
	 * A public read-only list of all the '<em><b>Stretch</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

	/**
	 * Returns the '<em><b>Stretch</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static Stretch get( String name )
	{
		for ( int i = 0; i < VALUES_ARRAY.length; ++i )
		{
			Stretch result = VALUES_ARRAY[i];
			if ( result.toString( ).equals( name ) )
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stretch</b></em>' literal with the specified
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static Stretch get( int value )
	{
		switch ( value )
		{
			case HORIZONTAL :
				return HORIZONTAL_LITERAL;
			case VERTICAL :
				return VERTICAL_LITERAL;
			case BOTH :
				return BOTH_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private Stretch( int value, String name )
	{
		super( value, name );
	}

} //Stretch
