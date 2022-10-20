package StudentsAndTeacherSystem;

import java.util.Scanner;

public class Application {
    static int numOfTeachers = 0;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Student [] students = new Student[100];
        Teacher [] teachers = new Teacher[100];
        int choice = 0;
        do{
            choice = mainMenu();
            switch (choice)
            {
                case 1:
                    teacherMenu(teachers);
                    break;
                case 2:
                    studentMenu();
                    break;
                default:
                    break;
            }
        } while(choice > 3 && choice > 0);

    }

    public static int searchTeacher(Teacher [] teachers)
    {
        System.out.print("Enter the name of teacher: ");
        String name = input.next();

        for (int i = 0; i < numOfTeachers; i++)
        {
            if (name == teachers[i].getName())
            {
                return i;
            }
        }
        return -1;
    }
    public static int mainMenu()
    {
        System.out.println("---- Welcome to college system ----");
        System.out.println("1- Teacher Subsystem");
        System.out.println("2- Student Subsystem");
        System.out.println("3- Exit");
        System.out.print("Your choice: ");
        return (input.nextInt());
    }

    public static void teacherMenu(Teacher [] teachers)
    {
        int choice = 0;
        do
        {
            System.out.println("---- Welcome to Teacher Sub-System");
            System.out.println("1- Add your personal information");
            System.out.println("2- Add new course");
            System.out.println("3- Remove a course");
            System.out.println("4- Print all courses");
            System.out.println("5- Exit");
            System.out.print("Your choice: ");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                {
                    System.out.print("Please enter teacher's name: ");
                    String name = input.next();

                    System.out.print("Please enter teacher's address: ");
                    String address = input.next();

                    teachers[numOfTeachers] = new Teacher(name, address);
                    System.out.println("Teacher: " + teachers[numOfTeachers].getName() + " Added successfully");
                    numOfTeachers++;
                    break;
                }
                case 2:
                {
                    boolean addedSuccess = false;
                    String courseName = "";
                    int index = searchTeacher(teachers);
                    if (index > 0)
                    {
                        System.out.print("Enter the name of course: ");
                        courseName = input.next();
                        addedSuccess = teachers[index].addCourse(courseName);
                        if (addedSuccess)
                        {
                            System.out.println("Course: " + courseName + " Added Successfully");
                        }
                        if (!addedSuccess)
                        {
                            System.out.println("Failed to add course");
                        }
                    }
                    else
                    {
                        System.out.println("Teacher not found");
                    }
                }
                case 3:
                {
                    boolean removedSuccess = false;
                    int index = searchTeacher(teachers);
                    if(index > 0)
                    {
                        System.out.print("Enter the name of course: ");
                        String courseName = input.next();
                        removedSuccess = teachers[index].removeCourse(courseName);
                        if (removedSuccess)
                        {
                            System.out.println("Course: " + courseName + " is removed successfully");
                        }
                        else
                        {
                            System.out.println("Failed to remove the course");
                        }
                    }
                    break;
                }
            }

        }while (choice > 0 && choice < 5);



    }

    public static void studentMenu()
    {
        int choice = 0;
        do {
            System.out.println("---- Welcome to Student Sub-System");
            System.out.println("1- Add your personal information");
            System.out.println("2- Add new course");
            System.out.println("3- Print grades");
            System.out.println("4- Get the average");
            System.out.println("5- Exit");
            System.out.print("Your choice: ");
            choice = input.nextInt();
        }while (choice > 0 && choice < 5);


    }

}
