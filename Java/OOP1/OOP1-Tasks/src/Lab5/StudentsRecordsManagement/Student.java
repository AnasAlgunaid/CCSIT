package Lab5.StudentsRecordsManagement;

import java.time.LocalDate;

public class Student {
    public String ID;
    String FirstName;
    String LastName;
    LocalDate BirthDate;
    private double GPA;
    public static int numOfStudents = 0 ;

    public Student() {
        this("", "", "", LocalDate.of(0, 0 , 0), 0);
    }
    public Student(String ID, String firstName, String lastName, LocalDate birthDate, double GPA) {
        this.ID = ID;
        FirstName = firstName;
        LastName = lastName;
        BirthDate = birthDate;
        this.GPA = GPA;
        // Increment the number of students
        numOfStudents++;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getBirthDate() {
        return (LocalDate.now().getYear() - BirthDate.getYear());
    }

    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
