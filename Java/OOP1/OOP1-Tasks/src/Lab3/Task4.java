/*
------------------------- Task Description: -------------------------
Write a Java program to count Words in a String – Counts the number
of individual words in a string.
---------------------------------------------------------------------
*/

package Lab3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String txt = in.nextLine();
        txt = txt.trim();
        int counter = 0;

        for (int i = 0; i < txt.length(); i++)
        {
            if(txt.charAt(i) == ' ')
            {
                counter++;
            }
        }
        counter++;
        System.out.printf("The number of words: %d", counter );
    }
}
