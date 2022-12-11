/*
------------------------- Task Description: -------------------------
Write a java method deleteChar(), which deletes any occurrence in
the first argument “str1” of the single character which is the second
argument “c”.

Assume the method signature is: void deleteChar(String str1, char c);
---------------------------------------------------------------------
*/

package Lab4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Type in a string: ");
        String str1 = input.nextLine();

        System.out.print("Enter a letter to delete: ");
        char c = input.next().charAt(0);

        deleteChar(str1, c);

        input.close();
    }

    public static void deleteChar(String str1, char c)
    {
        String txtAfter = "";
        for(int i = 0; i < str1.length(); i++)
        {
            if(str1.charAt(i) != c)
            {
                txtAfter = txtAfter + str1.charAt(i);
            }
        }

        System.out.println("The string after deleting the character [ " + c + " ]: " + txtAfter );
    }
}
