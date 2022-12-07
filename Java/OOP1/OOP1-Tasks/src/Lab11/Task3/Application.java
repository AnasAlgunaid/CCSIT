package Lab11.Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ArrayList<Person> users = new ArrayList<>();

        //declare few Teacher and Student objects

        // Student 1
        String std1Name = "Yara Mohammed Hammad";
        String std1Address = "Ibn majed street, Dammmam, Eastren province, Saudi Arabia";
        users.add(new Student(std1Name, std1Address));

        // Student 2
        String std2Name = "Aysha Mohammed Alkhan";
        String std2Address = "King Fahad street, Khobar, Eastren province, Saudi Arabia";
        users.add(new Student(std2Name, std2Address));

        // Teachers
        users.add(new Teacher("Nora Alrashed", "Dhahran, Saudi Arabia"));
        users.add(new Teacher("Arwa Almazroua", "Dammam, Saudi Arabia"));


        for (Person p : users){
            moreDetails(p);
        }

        for (int i = 0; i < users.size(); i++)
            System.out.println(users.get(i));
    }

    public static void moreDetails(Person currentPerson) {
        Scanner input = new Scanner(System.in);
        if (currentPerson instanceof Teacher) {
            System.out.println("\nTeacher: " + currentPerson.getName());
            Teacher t = (Teacher) currentPerson;
            System.out.println("Please Enter course name: ");
            t.addCourse(input.nextLine());
        }
        if (currentPerson instanceof Student) {
            System.out.println("\nStudent: " + currentPerson.getName());
            Student s = (Student) currentPerson;
            System.out.println("Please Enter course name: ");
            String courseName = input.nextLine();
            System.out.println("Please Enter grade: ");
            int grade = input.nextInt();
            s.addCourseGrade(courseName, grade);
        }
    }//end of moreDetails method


}

