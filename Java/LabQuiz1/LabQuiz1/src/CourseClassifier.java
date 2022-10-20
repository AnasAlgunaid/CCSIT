
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anas Aljunaid
 */

/* 
Course Classification	[7 Marks]
1.	(1 mark) Create Student class with the following attributes:     
Name, CourseGrading (double array)
2.	(2 marks) Provide the following functionalities in the student class:
a.	Constructors (default only)
b.	Accessors and mutators for all fields.
c.	Access modifiers should be:
•	private: all class attributes
•	public: all class methods 
3.	Write a program that record and classify the midterm grades for 3 courses and classify each course grading for High, Medium, or Low.
a)	(2 marks) Ask the user to provide the number of students and prepare a single dimension array of students sArray[NoStudents] , and read the student name and grading for each students from the user in each course (Note: Number of students is dynamic from the user and number of courses is constant = 3).
b)	 (3 marks) Prepare a new method calcCourseClassification (Student [] sArray) that receive the array of students and calculate the course average of each course, calculate and print the level of each course based on the following:
?	If the average > 12 then print: "The course average is high"
?	If the average = 12 then print: "The course average is medium"
?	If the average < 12 then print: "The course average is low"

*/

import java.util.Scanner;

/**
 *
 *
 * @author Anas Aljunaid
 */

public class CourseClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // Get the number of students
        System.out.print("Enter No of Students: ");
        int NoStudents = input.nextInt();

        // Declare students array
        Student [] sArray = new Student[NoStudents];

        // Define the students and get the name and the grading
        System.out.println("Please enter the students Information");
        for(int i = 0; i < 3; i++){
            sArray[i] = new Student();

            // Get the name of the student from the user
            System.out.print("Enter Student Name for " + (i+1) + ": ");
            sArray[i].setName(input.next());

            //Get grades from the user (We can also pass Anonymous array instead of "grades" array)
            System.out.print("Enter Student# " + (i+1)  + " Grading for the 3 courses: ");
            double [] grades = new double[3];
            for(int j = 0; j < 3; j++){
                grades[j] = input.nextDouble();
            }

            // Assign grades to the student
            sArray[i].setCourseGrading(grades);

            System.out.println();
        }

        // Call the method
        calcCourseClassification(sArray);

    }//End of main

    public static void calcCourseClassification (Student[] sArray)
    {
        System.out.println("Classification for each course:");
        double sum , avg;
        for(int i = 0; i < 3; i++){
            sum = 0;
            avg = 0;

            // Summing the grade of the course for all students
            for(int j = 0; j < sArray.length; j++){
                sum += sArray[j].getCourseGrading()[i];
            }

            // Calculate the average
            avg = sum / sArray.length;

            // Print classification
            System.out.print("Course#" + (i+1) + " : ");
            if(avg > 12){
                System.out.println("High");
            }
            else if(avg == 12){
                System.out.println("Medium");
            }
            else if(avg < 12){
                System.out.println("Low");
            }
        }

    }//End of getClassification method
}