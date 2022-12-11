/*
------------------------- Task Description: -------------------------
Write a method that removes the duplicate elements from an array list
of integers using the following header:
    public static void removeDuplicate(ArrayList<Integer> list)

Write a test program that prompts the user to enter 10 integers
to a list and displays the distinct integers.
---------------------------------------------------------------------
*/

package Lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listBefore = new ArrayList<>();

        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < 10; i++){
            listBefore.add(input.nextInt());
        }

        removeDuplicate(listBefore);

    }

    public static void removeDuplicate(ArrayList<Integer> listBefore){
        ArrayList<Integer> listAfter = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            boolean isUnique = true;
            if(!listAfter.contains(listBefore.get(i))){
                listAfter.add(listBefore.get(i));
            }
        }

        listBefore.clear();

        listAfter.addAll(listBefore);

        System.out.println("The distinct integers are: " + listAfter);
    }
}
