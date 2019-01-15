package lab_basic.day_4.assignment_7;

public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected final double semesterFees = 12000;
    protected double feesPerMonth;
    Student() {}
    public void setStudentId(int sId)
    {
        this.studentId=sId;
    }
    public void setStudentType(char sType)
    {
        this.studentType=sType;
    }
    public void setStudentName(String sName)
    {
        this.studentName=sName;
    }
    public void calculateFees()
    {
        feesPerMonth = semesterFees/6;
    }
    public final void displayDetails()
    {
        System.out.println("Student ID : "+studentId);
        System.out.println("Student Type : "+studentType);
        System.out.println("Student Name : "+studentName);
        System.out.println("Fees per Month : "+feesPerMonth);
    }
    }
