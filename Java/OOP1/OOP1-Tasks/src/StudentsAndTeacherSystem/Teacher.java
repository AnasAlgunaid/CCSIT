package StudentsAndTeacherSystem;

import java.util.Arrays;

public class Teacher extends Person{
    private int numCourses;
    private String [] courses;
    private static final int MAX_COURSES = 5;

    public Teacher(String name, String address)
    {
        super.setName(name);
        super.setAddress(address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "numCourses=" + numCourses +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

    public boolean addCourse(String course)
    {
        for(int i = 0; i < numCourses; i++)
        {
            if(courses[i] == course)
            {
                return false;
            }
        }

        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course)
    {
        for(int i = 0; i < numCourses; i++)
        {
            if(course == courses[i])
            {
                for(int j = i; j < numCourses; j++)
                {
                    courses[j] = courses[j+1];
                }
                numCourses--;
                return true;
            }
        }
        return false;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public String[] getCourses() {
        return courses;
    }

}
