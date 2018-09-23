/*******************************
RetirementCalculator.java
Author: David Brungardt
Calculates the year you will retire based on user input.
Inherits ICalculate interface and abstract Calculator class.
********************************/
// import ICalculate package and ICalculate interface.
import ICalculate.ICalculate;
// import Calculator package and Calculator class.
import Calculator.Calculator;

public class RetirementCalculator extends Calculator implements ICalculate
{
  // Initialize fields for RetirementCalculator class
  String birthMonth;
  int birthDay;

  // Property for birthMonth field
  public String getBirthMonth()
  {
    return this.birthMonth;
  }
  public void setBirthMonth(String value)
  {
    // Check to see if string is empty
    if (value != "")
    {
      this.birthMonth = value;
    }
    else
    {
      System.out.println("No valid entry was given.");
    }
  } // end of Property for birthMonth field

  // Property for birthDay field
  public int getBirthDay()
  {
    return this.birthDay;
  }
  public void setBirthDay(int value)
  {
    // Check to see if value is positive
    if (value > 0)
    {
      this.birthDay = value;
    }
    else
    {
      System.out.println("No valid entry for birthday was given.");
    }
  } // end of Property for birthDay field

  RetirementCalculator(String birthMonth, int birthDay)
  {
    // assign values for birth month and birth day.
    this.setBirthMonth(birthMonth);
    this.setBirthDay(birthDay);
  } // end of constructor

  public int Calculate(int birthYear, int retirementAge)
  {
    // assign int values for input1 and input2
    super.setInput1(birthYear);
    super.setInput2(retirementAge);

    // calulate retirement age based on birth year and age of retirement
    super.Output1 = birthYear + retirementAge;

    // return retirement age
    return super.Output1;

  } // end of Calculate method

} // end of RetirementCalculator class
