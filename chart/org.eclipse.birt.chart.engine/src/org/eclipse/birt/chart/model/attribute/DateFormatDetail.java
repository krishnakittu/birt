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
 * <em><b>Date Format Detail</b></em>', and utility methods for working with
 * them. <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * This type defines the form of Date.
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.birt.chart.model.attribute.AttributePackage#getDateFormatDetail()
 * @model
 * @generated
 */
public final class DateFormatDetail extends AbstractEnumerator
{

	/**
	 * The '<em><b>Date</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #DATE_LITERAL
	 * @model name="Date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE = 0;

	/**
	 * The '<em><b>Date Time</b></em>' literal value. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #DATE_TIME_LITERAL
	 * @model name="Date_Time"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME = 1;

	/**
	 * The '<em><b>Date</b></em>' literal object. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DATE
	 * @generated
	 * @ordered
	 */
	public static final DateFormatDetail DATE_LITERAL = new DateFormatDetail( DATE,
			"Date" ); //$NON-NLS-1$

	/**
	 * The '<em><b>Date Time</b></em>' literal object. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Date Time</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DATE_TIME
	 * @generated
	 * @ordered
	 */
	public static final DateFormatDetail DATE_TIME_LITERAL = new DateFormatDetail( DATE_TIME,
			"Date_Time" ); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Date Format Detail</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final DateFormatDetail[] VALUES_ARRAY = new DateFormatDetail[]{
			DATE_LITERAL, DATE_TIME_LITERAL,
	};

	/**
	 * A public read-only list of all the '<em><b>Date Format Detail</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

	/**
	 * Returns the '<em><b>Date Format Detail</b></em>' literal with the
	 * specified name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DateFormatDetail get( String name )
	{
		for ( int i = 0; i < VALUES_ARRAY.length; ++i )
		{
			DateFormatDetail result = VALUES_ARRAY[i];
			if ( result.toString( ).equals( name ) )
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Format Detail</b></em>' literal with the
	 * specified value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DateFormatDetail get( int value )
	{
		switch ( value )
		{
			case DATE :
				return DATE_LITERAL;
			case DATE_TIME :
				return DATE_TIME_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private DateFormatDetail( int value, String name )
	{
		super( value, name );
	}

} //DateFormatDetail
