package lab_basic.day_4.assignment_4.problem_1;

public class Student
{
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected int semesterFees;
    //protected int feesPerMonth;
    Student(int studentId)
    {
        this.studentId=studentId;
    }
    Student(int studentId,char studentType,String studName,int semFees)
    {
        this(studentId);
        this.studentType=studentType;
        this.studentName=studName;
        this.semesterFees=semFees;
    }
    void displayDetails()
    {
        System.out.println("Student Details are : \n");
        System.out.println("Student ID : "+studentId);
        System.out.println("Student Type : "+studentType);
        System.out.println("Student Name : "+studentName);
        System.out.println("Semester Fees : "+semesterFees);
    }
}
