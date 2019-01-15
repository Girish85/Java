package lab_basic.day_4.assignment_5;

public class Student {
    protected static int studentNumber = 0;
    protected int studentId;
    protected char studentType;
    protected String studentName;
    Student()
    {
        studentNumber++;
    }
    Student(int studentId,char studentType,String studentName)
    {
        this();
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = studentName;
    }
}
