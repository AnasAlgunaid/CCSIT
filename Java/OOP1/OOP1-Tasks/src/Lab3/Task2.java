/*
------------------------- Task Description: -------------------------
Design and implement a Java program that generates a password for a student using
his name and age as the following:
    – Take the first letter from the first name, the middle letter from the
    middle name and the last letter from the last name.

    – Then concatenate the obtained letters along with age which should be
    multiplied by 100.

    – All letters should be in uppercase.
---------------------------------------------------------------------
*/

package Lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = in.next();
        System.out.print("Enter the middle name: ");
        String middleName = in.next();
        System.out.print("Enter the last name: ");
        String lastName = in.next();
        System.out.print("Enter the age: ");
        int age = in.nextInt() * 100;
        String thePassword = ("" + firstName.charAt(0) + middleName.charAt(middleName.length()/2) + lastName.charAt(lastName.length() -1) + age);
        System.out.println("The password is: " + thePassword.toUpperCase());
    }
}
