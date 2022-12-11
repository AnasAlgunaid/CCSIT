/*
---------------------- Task Description: ----------------------
Write a program that converts a Fahrenheit degree to Celsius.
---------------------------------------------------------------
 */

package Lab1;

import java.util.Scanner;

/* Write a program that converts a Fahrenheit degree to Celsius */
public class Task2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Program menu and get the choice
        System.out.println("\n1) Fahrenheit to celsius.");
        System.out.println("2) Celsius to fahrenheit.");
        System.out.println("999) Exit.");
        System.out.print("Please choose a number: ");
        int choice = in.nextInt();

        double tempAfterConvert;

        switch(choice)
        {
            case 1:
            {
                // Convert from fahrenheit to celsius
                System.out.print("Enter the Fahrenheit: ");
                double temperature = in.nextDouble();
                tempAfterConvert = ((temperature-32)*5)/9;
                System.out.printf("%.2f fahrenheit equals: %.2f celsius",temperature,tempAfterConvert);
                break;
            }
            case 2:
            {
                // Convert from celsius to fahrenheit
                System.out.print("Enter the celsius: ");
                double temperature = in.nextDouble();
                tempAfterConvert = (temperature * 9/5) + 32;
                System.out.printf("%.2f celsius equals: %.2f fahrenheit",temperature,tempAfterConvert);
                break;
            }
            default:
                System.out.println("Please enter a valid choice");
        }


    }
}
