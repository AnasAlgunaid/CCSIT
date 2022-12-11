/*
------------------------- Task Description: -------------------------
Suppose you need to implement a system for a machine that has 5 statuses:
ON, OFF, START, IN PROGRESS and DONE.

Using the enumerated data type called “Machine”, create java method
to check the selected button and show the related messages.

When the users press any button, the machine must respond with proper
action as follows:
    1. ON: display on the screen “The machine is ON”.
    2. OFF: display on the screen “The machine is OFF, GOOD BYE”.
    3. START: display on the screen “The machine is starting”.
    4. IN PROGRESS: it is displayed when the machine is start.
    5. DONE: when the progress is done.
---------------------------------------------------------------------
*/

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
