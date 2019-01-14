package lab_basic.day_3.assignment_8;

public class Student {
    private int studentId;
    private String studentName;
    private String residentialStatus;
    private double feesPerMonth;
    Student(){}                                                                 //Default Constructor
    public void setStudentId(int id)
    {
        studentId = id;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentName(String firstName,String lastName)
    {
        studentName = firstName+lastName;
    }
    public String getStudentName()
    {
        return studentName;
    }
    public void setResidentialStatus(String residentialStatus)
    {
        this.residentialStatus = residentialStatus;
    }
    public String getResidentialStatus()
    {
        return residentialStatus;
    }
    public void calculateFees(double semesterFees)
    {
        this.feesPerMonth = semesterFees/6;
    }
    public void calculateFees(double semesterFees,double hostelFees)
    {
        this.feesPerMonth = (semesterFees/6)+hostelFees;
    }
    public String getFees()
    {
        Double fees = feesPerMonth;
        return fees.toString();
    }
}
