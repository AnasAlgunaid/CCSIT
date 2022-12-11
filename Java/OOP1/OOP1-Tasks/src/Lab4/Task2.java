/*
------------------------- Task Description: -------------------------
Write a Java method to check whether a string is a valid password.

Password rules:
    – A password must have at least ten characters.
    – A password consists of only letters and digits.
    – A password must contain at least two digits
---------------------------------------------------------------------
*/

package Lab4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.\n");
        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = input.nextLine();

        if (checkValid(password))
        {
            System.out.println("Password is valid: [ " + password + " ]." );
        }
        else
        {
            System.out.println("Password is not valid: [ " + password + " ]." );
        }

        input.close();
    }

    public static boolean checkValid(String password)
    {
        boolean lengthCheck = true;
        boolean onlyLettersAndDigits = true;

        if (password.length() < 8)
        {
            lengthCheck = false;
            System.out.println("\nA password must have at least eight characters.");
        }

        int digitCount = 0;
        for(int i = 0; i < password.length(); i++)
        {
            if(!Character.isLetterOrDigit(password.charAt(i)) )
            {
                onlyLettersAndDigits = false;
                System.out.println("\nA password consists of only letters and digits.");
                break;
            }
        }

        for (int i = 0; i < password.length(); i++)
        {
            if(Character.isDigit(password.charAt(i)))
            {
                digitCount++;
            }
        }

        if (digitCount < 2)
        {
            System.out.println("\nA password must contain at least two digits.");
        }

        if (lengthCheck && onlyLettersAndDigits && (digitCount > 2))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
