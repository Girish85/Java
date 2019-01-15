package lab_basic.day_4.assignment_8;

public class DayScholar extends Student {
    private String residentialAddress;
    DayScholar()
    {
        super();
    }
    DayScholar(int studentId,char studentType,String fName,String lName,double feesPerMonth,String residentialAddress)
    {
        //super(studentId,studentType,fName,lName);     Not needed as we can directly access protected members from derived class
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = fName+lName;
        this.residentialAddress = residentialAddress;
        calculateFees(feesPerMonth);
    }
    public String getResidentialAddress()
    {
        return residentialAddress;
    }
    public void displayStudentDetails()
    {
        System.out.println("\n Student Details : \n");
        System.out.println("StudentId\tStudentType\tStudentName\tFeesperMonth\tResidentialAddress");
        System.out.println(studentId+"\t\t\t"+studentType+"\t\t\t"+studentName+"\t"+feesPerMonth+"\t"+residentialAddress);
    }
    public void calculateFees(double semesterFees)
    {
        feesPerMonth = semesterFees / 6.0;
    }
}
