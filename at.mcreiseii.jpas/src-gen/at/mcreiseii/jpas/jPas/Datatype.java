/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Datatype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.mcreiseii.jpas.jPas.JPasPackage#getDatatype()
 * @model
 * @generated
 */
public enum Datatype implements Enumerator
{
  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(0, "String", "string"),

  /**
   * The '<em><b>Boolean</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN(1, "Boolean", "boolean"),

  /**
   * The '<em><b>Integer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_VALUE
   * @generated
   * @ordered
   */
  INTEGER(2, "Integer", "integer"),

  /**
   * The '<em><b>Float</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOAT_VALUE
   * @generated
   * @ordered
   */
  FLOAT(3, "Float", "real");

  /**
   * The '<em><b>String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model name="String" literal="string"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 0;

  /**
   * The '<em><b>Boolean</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @model name="Boolean" literal="boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_VALUE = 1;

  /**
   * The '<em><b>Integer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTEGER
   * @model name="Integer" literal="integer"
   * @generated
   * @ordered
   */
  public static final int INTEGER_VALUE = 2;

  /**
   * The '<em><b>Float</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLOAT
   * @model name="Float" literal="real"
   * @generated
   * @ordered
   */
  public static final int FLOAT_VALUE = 3;

  /**
   * An array of all the '<em><b>Datatype</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Datatype[] VALUES_ARRAY =
    new Datatype[]
    {
      STRING,
      BOOLEAN,
      INTEGER,
      FLOAT,
    };

  /**
   * A public read-only list of all the '<em><b>Datatype</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Datatype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Datatype</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Datatype get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Datatype result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Datatype</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Datatype getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Datatype result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Datatype</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Datatype get(int value)
  {
    switch (value)
    {
      case STRING_VALUE: return STRING;
      case BOOLEAN_VALUE: return BOOLEAN;
      case INTEGER_VALUE: return INTEGER;
      case FLOAT_VALUE: return FLOAT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Datatype(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Datatype
