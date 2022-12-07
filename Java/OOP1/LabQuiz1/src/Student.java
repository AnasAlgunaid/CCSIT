class Student
{
    // Attributes
    private String Name;

    private double [] CourseGrading;

    // Constructors
    public Student(){
        CourseGrading = new double[3];
    }

    // Accessors and mutators
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double[] getCourseGrading() {
        return CourseGrading;
    }

    public void setCourseGrading(double[] courseGrading) {
        CourseGrading = courseGrading;
    }
}

