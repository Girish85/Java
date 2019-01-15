package lab_basic.day_4.assignment_4.problem_2;

public class Student extends CourseRegistration {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected int semesterFees;
    private int feesPerMonth;
    Student(int studentId, String cName)
    {
        super(cName);
        this.studentId=studentId;
    }
    Student(int studentId,char studentType,String studName,int semFees,String cName)
    {
        this(studentId,cName);
        this.studentType=studentType;
        this.studentName=studName;
        this.semesterFees=semFees;
    }
}
