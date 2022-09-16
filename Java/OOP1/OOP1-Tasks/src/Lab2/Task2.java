package Lab2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numOfDays;
        while(true)
        {
            System.out.println("\nPlease enter the number of the month [999 to exit]: ");
            int numOfMonth = in.nextInt();
            if(numOfMonth == 999)
            {
                System.out.println("Thank You For Using The Program .. GoodBey");
                break;
            }
            switch(numOfMonth)
            {
                case 1:
                    numOfDays = 31;
                    System.out.println("-------- January [ " + numOfDays + " Days] --------");
                    break;
                case 2: {
                    System.out.print("Please enter the year: ");
                    int theYear = in.nextInt();
                    numOfDays = (theYear % 4 == 0) ? 29 : 28;
                    System.out.println("-------- February [ " + numOfDays + " Days] --------");
                    break;
                }
                case 3:
                    numOfDays = 31;
                    System.out.println("-------- March [ " + numOfDays + " Days] --------");
                    break;
                case 4:
                    numOfDays = 30;
                    System.out.println("-------- April [ " + numOfDays + " Days] --------");
                    break;
                case 5:
                    numOfDays = 31;
                    System.out.println("-------- May [ " + numOfDays + " Days] --------");
                    break;
                case 6:
                    numOfDays = 30;
                    System.out.println("-------- June [ " + numOfDays + " Days] --------");
                    break;
                case 7:
                    numOfDays = 31;
                    System.out.println("-------- July [ " + numOfDays + " Days] --------");
                    break;
                case 8:
                    numOfDays = 31;
                    System.out.println("-------- August [ " + numOfDays + " Days] --------");
                    break;
                case 9:
                    numOfDays = 30;
                    System.out.println("-------- September [ " + numOfDays + " Days] --------");
                    break;
                case 10:
                    numOfDays = 31;
                    System.out.println("-------- October [ " + numOfDays + " Days] --------");
                    break;
                case 11:
                    numOfDays = 30;
                    System.out.println("-------- November [ " + numOfDays + " Days] --------");
                    break;
                case 12:
                    numOfDays = 31;
                    System.out.println("-------- December [ " + numOfDays + " Days] --------");
                    break;

                default:
                    System.out.println("Please enter a number between 1 and 12.");
            }
        }


    }
}
