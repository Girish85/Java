package lab_basic.day_5.assignment_1.courseregistration;

public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }
    public void setStudentType(char studentType)
    {
        this.studentType = studentType;
    }
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    public void getData()
    {
        System.out.println("Student ID : "+studentId);
        System.out.println("Student Type : "+studentType);
        System.out.println("Student Name : "+studentName);
    }
}
