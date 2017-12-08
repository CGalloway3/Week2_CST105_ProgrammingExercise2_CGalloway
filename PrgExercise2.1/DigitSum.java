//This is my own work. Chad Galloway
/**  Program: Digit Sum
*    File: DigitSum.java
*    Summary: Sum the numbers in a 5 digit input.
*    Author: Chad Galloway
*    Date: December 8, 2017
**/
package programmingexercise2;

import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {
        
        // Declare variables
        int userInput = 0;
        int Digit1, Digit2, Digit3, Digit4, Digit5;
        int Sum;
        
        while (userInput == 0) {
            userInput = readUserInput();            
        }
        
        // Calculate Digits
        Digit1 = userInput%10;
        userInput = userInput / 10;       

        Digit2 = userInput%10;
        userInput = userInput / 10;

        Digit3 = userInput%10;
        userInput = userInput / 10;

        Digit4 = userInput%10;
        userInput = userInput / 10;

        Digit5 = userInput;
        
        // Sum all the digits in the number and display the result
        Sum = Digit1 + Digit2 + Digit3 + Digit4 + Digit5;
        System.out.println("The sum of the digits is " + Digit5 + " + " + Digit4 + " + " + Digit3 + " + " + Digit2 + " + " + Digit1 + " = " + Sum);
        
    }
    
    private static int readUserInput() {
        
        // Initialize inputScanner as a new Scanner class
        Scanner inputScanner = new Scanner(System.in);
        
        // Read user input of a five digit number
        System.out.print("Please enter a positive five digit integer: ");
        int input = inputScanner.nextInt();
        
        //Error checking
        if (input > 99999) { // Catch values too high
            System.out.println("The number you entered has too many digits. Please try again.");
            return(0);
        }

        if (input < 10000) { //Catch values too low
            System.out.println("The number you entered has too few digits or is a negitive number. Please try again.");
            return(0);
        }
        
        return(input); // return entered amount;
    }

}
