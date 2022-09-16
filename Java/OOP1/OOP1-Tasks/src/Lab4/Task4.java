package Lab4;

import java.util.Scanner;

public class Task4 {
    static enum Machine {
        ON, OFF, START, IN_PROGRESS, DONE
    };

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        String choice = input.next().toUpperCase();
        Machine status;

        try{
            check(Machine.valueOf(choice));
        } catch (Exception e) {
            System.out.println("Error .. Please enter a valid choice");
        }

    }

    public static void check(Machine status)
    {
        switch(status)
        {
            case ON:
                System.out.println("The machine is ON");
                break;
            case OFF:
                System.out.println("The machine is OFF,  GOOD BEY");
                break;
            case START:
                System.out.println("The machine is starting");
                break;
            case IN_PROGRESS:
                System.out.println(status.name());
                break;
            case DONE:
                break;
        }
    }
}
