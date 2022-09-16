package Lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txtBefore = in.nextLine();
        String txtAfter = "";
        int counter = 0;
        for (int i = 0; i < txtBefore.length(); i++)
        {
            if(txtBefore.charAt(i) != 'M' && txtBefore.charAt(i) != 'm' )
            {
                txtAfter = txtAfter + txtBefore.charAt(i);
            }
            else
            {
                counter++;
                if (counter > 3)
                {
                    for (int j = i; j < txtBefore.length(); j++)
                    {
                        txtAfter = txtAfter + txtBefore.charAt(j);
                    }
                    break;
                }
            }
        }

        System.out.println("The new string is: " + txtAfter);

    }
}
