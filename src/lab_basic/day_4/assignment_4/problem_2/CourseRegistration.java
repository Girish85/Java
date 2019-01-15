package lab_basic.day_4.assignment_4.problem_2;

public class CourseRegistration {
    static protected int regId;
    protected String courseName;
    CourseRegistration()
    {
        regId++;
    }
    CourseRegistration (String cName)
    {
        this();
        courseName=cName;
    }
    public void displayDetails()
    {
        System.out.println("Registration ID :"+regId);
        System.out.println("CourseName :"+courseName);
    }
}
