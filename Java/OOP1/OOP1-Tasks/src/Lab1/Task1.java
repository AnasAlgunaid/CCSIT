package Lab1;

import java.time.YearMonth;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Get the birth year from the user
        System.out.print("Please enter your birth year: ");
        int birthYear = in.nextInt();

        // Get the current year
        int currentYear = YearMonth.now().getYear();

        // Print the age
        int theAge = currentYear - birthYear;
        System.out.printf("Your age is: %d years.", theAge);
    }
}
