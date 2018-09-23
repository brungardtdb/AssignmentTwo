/*******************************
Calculator.java
Author: David Brungardt
Abstract class for applications that calculate a value using input.
Inherits ICalculate interface.
********************************/
// Create package for Calculator class
package Calculator;
// import ICalculate package and ICalculate interface.
import ICalculate.ICalculate;

public abstract class Calculator implements ICalculate
{
  // Initialize fields for abstract Calculator class
  int input1;
  int input2;
  public int Output1;

  // Property for Input1 field
  public int getInput1()
  {
    return this.input1;
  }
  public void setInput1(int value)
  {
    // Check to see if value is positive
    if (value > 0)
    {
      this.input1 = value;
    }
    else
    {
      System.out.println("Please enter a positive integer for the calculation.");
    }
  } // end of Property for Input1 field

  // Property for Input2 field
  public int getInput2()
  {
    return this.input2;
  }
  public void setInput2(int value)
  {
    // Check to see if value is positive
    if (value > 0)
    {
      this.input2 = value;
    }
    else
    {
      System.out.println("Please enter a positive integer for the calculation.");
    }
  } // end of Property for Input2 field

  // Empty constructor for Calculator class
  public Calculator()
  {

  } // end of constructor

  // Abstract calculate method using ICalculate interface
  public abstract int Calculate(int input1, int input2);

} // end of Calculator class
