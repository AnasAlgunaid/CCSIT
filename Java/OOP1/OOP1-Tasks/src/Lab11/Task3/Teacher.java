package Lab11.Task3;

import java.util.Arrays;

public class Teacher extends Person{
    private int numCourses;
    private String [] courses;
    private static final int MAX_COURSES = 5;
    public Teacher(String name, String address){
        super(name, address);
        this.numCourses=0;
        this.courses= new String[MAX_COURSES];
    }
    public Teacher(int numCourses, String[] courses, String name, String
            address) {
        super(name, address);
        this.numCourses = numCourses;
        this.courses = courses;
    }
    public int getNumCourses() {
        return numCourses;
    }
    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    public String[] getCourses() {
        return courses;
    }


    @Override
    public String toString() {
        return "Teacher{" + super.toString() + "numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + '}';
    }
    public boolean addCourse(String _course)
    {
        if ( numCourses == 0 )
        {
            courses[numCourses]=_course;
            numCourses++;
            return true;
        }
        else
            for ( int i=0; i < numCourses && numCourses != MAX_COURSES ; ++i)
            {
                if (!courses[i].equals(_course) )
                {
                    courses[numCourses]=_course;
                    numCourses++;
                    return true;
                }

            }

        return false;
    }

    public boolean removeCourse(String _course)
    {
        for ( int i = 0 ; i< numCourses; ++i)
            if (courses[i].equals(_course))
            {
                courses[i]=null;
                while (i < numCourses-1)
                {
                    courses[i]= courses[i+1];
                    ++i;
                }
                numCourses--;
                return true;
            }
        return false;
    }
    public void printCourses ()
    {
        for (int i=0; i< numCourses; ++i)
            System.out.println("Course#" + (i+1) + " " + courses[i]);
    }

}