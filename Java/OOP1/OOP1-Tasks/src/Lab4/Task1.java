/*
------------------------- Task Description: -------------------------
Write a program that calculate and classify the rainfall average
for 4 weeks.
    - Firstly, read the rainfall rates for each day in the 4 weeks and
    store them in a 2-dimensional array [4][7].

    - Write a method getClassification() to get the classification. The method should receive
    the rainfall average for a week from the main, and print the classification for that week:
    High, Medium or Low; based on the received average.
    Rainfall average Classification

        > High:     average >= 6
        > Medium:   6 > average > 3
        > Low:      average < = 3
---------------------------------------------------------------------
*/

package Lab4;

import java.util.Scanner;


public class Task1 {
    public static String getClassification(double weekAvg)
    {
        if (weekAvg >= 6)
        {
            return ("High ( " + weekAvg + " )");
        }
        else if (weekAvg > 3 && weekAvg < 6)
        {
            return ("Medium ( " + weekAvg + " )");
        }
        else
        {
            return ("Low ( " + weekAvg + " )");
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int weeks = 4;
        int days = 7;
        double [] [] rainfall = new double[weeks] [days];
        double [] rainfallAvg = new double[weeks];
        System.out.println("Please enter the rainfall rates for 4 weeks");
        for(int i = 0; i < weeks; i++)
        {
            System.out.print("Week#" + (i+1) + ": ");
            for (int j = 0; j < days; j++)
            {
                rainfall[i][j] = input.nextInt();
                rainfallAvg[i] = rainfallAvg[i] + rainfall[i][j];
            }
        }

        System.out.println("Classification for each week: ");
        for (int i = 0; i < weeks; i++)
        {
            System.out.println("Week#" + (i+1) + getClassification(rainfallAvg[i] / days) + ":  ");
        }
        input.close();
    }
}
