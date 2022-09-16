package Lab2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = in.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = in.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = in.nextInt();

        if(num1 < 0 || num2 < 0 || num3 < 0)
        {
            System.out.println("Sorry, Please enter numbers greater than 0.");
        }

        else {
            int avg = (num1 + num2 + num3)/3;
            int fmax = Math.max(num1, num2);
            int fmin = Math.min(num1, num2);
            System.out.println("The Average is: " + avg);
            System.out.println("The Max is: " + Math.max(fmax, num3));
            System.out.println("The Min is: " + Math.min(fmin, num3));
        }

    }
}
