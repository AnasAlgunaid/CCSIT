package Lab5.StudentsRecordsManagement;

import java.time.LocalDate;
import java.util.Scanner;


public class Application {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the number of students: ");
        int noStud = input.nextInt();
        int choice;
        Student[] students = new Student[noStud];

        do {
            choice = menu();

            switch (choice)
            {
                case 1:
                {
                    if (Student.numOfStudents < noStud)
                    {
                        students[Student.numOfStudents] = addStudent();
                        System.out.println("Student Added Successfully [Number Of Students: " + Student.numOfStudents + "]");
                    }
                    else
                    {
                        System.out.println("You can't add more students");
                    }
                    break;
                }

            }
        }while (choice != 0) ;

    }

    public static int menu(){
        System.out.println("Welcome to Students Records Management System");
        System.out.println("1- Add a new student");
        System.out.println("2- Update a student");
        System.out.println("3- Update the GPA of student");
        System.out.println("4- Delete Student");
        System.out.println("5- Enter 0 to exit\n");
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }

    public static Student addStudent()
    {


        System.out.println("Enter the ID: ");
        String ID = input.next();
        System.out.println("Enter the first name: ");
        String firstName = input.next();
        System.out.println("Enter the last name: ");
        String lastName = input.next();
        System.out.println("Enter the birthday date[Day Month Year]: ");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        System.out.println("Enter the GPA of the student: ");
        double GPA = input.nextDouble();
        Student stu = new Student(ID, firstName, lastName, LocalDate.of(year, month, day), GPA);
        return stu;
    }
}
