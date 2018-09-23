/*******************************
Operation2.java
Author: David Brungardt
Program that calculates the date that you will retire
based on user input.
********************************/

// import scanner method from utility
import java.util.Scanner;

public class Operation2
{
  public static void main(String[] args)
  {
    // Initialize variables for Operation2 class
    String birthMonth;
    int birthDay;
    int birthYear;
    int retirementAge;
    int retirementYear;

    // Create new instance of Scanner class
    Scanner scnr = new Scanner(System.in);
    // give instructions to user and prompt user for input
    System.out.println("Please enter your birth month\\day\\year, each seperated by a space.");
    System.out.println("Example: March 18 2000.");

    // assign values to appropriate fields
    birthMonth = scnr.next();
    birthDay = scnr.nextInt();
    birthYear = scnr.nextInt();

    // Create new instance of RetirementCalculator class
    RetirementCalculator thisRetirementCalculator = new RetirementCalculator(birthMonth, birthDay);

    // ask user for retirement retirementAge
    System.out.println("\nPlease enter the age at which you plan to retire.");

    // assign value for retirement age
    retirementAge = scnr.nextInt();

    // calculate year of retirement
    retirementYear = thisRetirementCalculator.Calculate(birthYear, retirementAge);

    // Print date of retirement for the user
    System.out.println("\nYou will retire on: " + thisRetirementCalculator.birthMonth + " " + thisRetirementCalculator.birthDay + " " + retirementYear);

  } // end of main method

} // end of Operation2 class
