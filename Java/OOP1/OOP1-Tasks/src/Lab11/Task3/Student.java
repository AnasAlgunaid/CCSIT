package Lab11.Task3;

public class Student extends Person {
    private int numCourses;
    private String [] courses;
    private int [] grades;
    private static final int MAX_COURSES = 30;

    public Student(String name, String address){
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[MAX_COURSES];
        this.grades = new int[MAX_COURSES];
    }
    public Student(int numCourses, String[] courses, int[] grades, String
            name, String address) {
        super(name, address);
        this.numCourses = numCourses;
        this.courses = courses;
        this.grades = grades;
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
    public int[] getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+ " numCourses=" + numCourses + "}" ;
        //you may call printGrades
    }
    public void addCourseGrade(String course, int grade) {
        if (numCourses < MAX_COURSES)
        {
            this.grades[numCourses] = grade;
            this.courses[numCourses] = course;
            numCourses++;
        }
        else
        {
            System.out.println("You cannot add a course. The student has already 30 courses.");
        }
    }

    public void printGrades()
    {
        if (numCourses > 0)
        {
            for (int i = 0; i < numCourses; i++)
                System.out.println(courses[i] + ": " + grades[i]);
        }
        else
            System.out.println("The student is not enrolled in any courses!");
    }
    public double getAverage()
    {
        if (numCourses > 0)
        {
            double average = 0.0;
            for (int i = 0; i < numCourses; i++)
            {
                average += grades[i];
            }
            return (average / numCourses);
        }
        else
        {
            return 0;
        }

    }


}
