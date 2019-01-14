package lab_basic.day_3.assignment_7;

public class Student {
    private int studentId;
    private String studentName;
    private String residentialStatus;
    private long semesterFees;
    private long hostelFees = 0;
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
    public void setSemesterFees(long semesterFees)
    {
        this.semesterFees = semesterFees;
    }
    public void setHostelFees(long hostelFees)
    {
        this.semesterFees = hostelFees;
    }
    public long getTotalFees()
    {
        return semesterFees+hostelFees;
    }
}
