package StudentsAndTeacherSystem;

import java.util.Arrays;

public class Student extends Person{
    int numCourses;
    String [] courses;
    double [] grades;
    private static final int MAX_COURSES = 30;

    public Student(String name, String address){
        super.setName(name);
        super.setAddress(address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new double[MAX_COURSES];
    }

    @Override
    public String toString() {
        return "Student{" +
                "numCourses=" + numCourses +
                ", courses=" + Arrays.toString(courses) +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    public void addCourseGrade(String course, double grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades(){
        System.out.println("Course:\t\t\t\t\t\tGrade: ");
        for (int i = 0; i < numCourses; i++)
        {
            System.out.println(courses[i] + "\t\t\t\t\t\t" + grades[i]);
        }
    }

    public double getAverageGrade(){
        double sum = 0;

        for(int i = 0; i < numCourses; i++)
        {
            sum += grades[i];
        }

        return (sum / numCourses);
    }


}
