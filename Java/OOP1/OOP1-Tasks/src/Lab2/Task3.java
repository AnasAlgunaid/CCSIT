package Lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String maxName = "";
        int maxLength = 0;

        System.out.print("How many names you want to compare?: ");
        int numOfNames = in.nextInt();
        for(int i = 0; i < numOfNames; i++ )
        {
            System.out.printf("Enter #%d name: ", i+1 );
            String theName = in.next();
            if (theName.length() > maxLength)
            {
                maxLength = theName.length();
                maxName = theName;
            }
        }
        System.out.printf("\n ----- The longest string: " + maxName + " With %d letters. -----\n", maxLength);
    }
}
