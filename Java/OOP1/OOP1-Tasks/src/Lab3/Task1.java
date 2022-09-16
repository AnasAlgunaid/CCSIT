package Lab3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = in.nextInt();
        String studentName = "";
        int studentScore = 0;
        int maxScore = 0;
        String maxName = "";
        for(int i = 0; i < numOfStudents; i++)
        {
            System.out.printf("Enter name and score of student [%d]: ", i+1);
            studentName = in.next();
            studentScore = in.nextInt();
            if(studentScore > maxScore)
            {
                maxScore = studentScore;
                maxName = studentName;
            }
        }

        System.out.printf(" ----- The student with the highest score is: " + maxName + " with score (%d) ----- ",maxScore );
    }
}
