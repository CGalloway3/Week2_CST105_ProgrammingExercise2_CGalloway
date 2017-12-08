//This is my own work. Chad Galloway
/**  Program: Temperature Converter
*    File: TempConv.java
*    Summary: Converts temperature between Fahrenheit and Celsius
*    Author: Chad Galloway
*    Date: December 8, 2017
**/
package programmingexercise2;

import java.util.Scanner;

public class TempConv {

    public static void main(String[] args) {
        
        // Declare vairables
        float fahrenheitTemperature;
        float celsiusTemperature;
        
        // Initilize inputScanner as a new Scanner class
        Scanner inputScanner = new Scanner(System.in);
        
        // Read user inp1ut
        System.out.print("Enter a temperature in degrees Fahrenheit: ");
        fahrenheitTemperature = inputScanner.nextFloat();
        
        // Claculate and display results
        celsiusTemperature = ( ( fahrenheitTemperature - 32 ) * 5 ) / 9;
        System.out.println(fahrenheitTemperature + "F is equivelent to " + celsiusTemperature +"C.");
        
        // Read user input
        System.out.print("Enter a temperature in degrees Celsius: ");
        celsiusTemperature = inputScanner.nextFloat();
        
        // Calculate and display results
        fahrenheitTemperature = ( ( celsiusTemperature * 9 ) / 5 ) + 32;
        System.out.println(celsiusTemperature + "C is equivelent to " + fahrenheitTemperature +"F.");
        
        // Close input scanner
        inputScanner.close();
    }

}