package lab_basic.day_4.assignment_3;

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
        this.feesPerMonth = Math.round(1000*(feesPerMonth/6))/1000.0;
        this.residentialAddress = residentialAddress;
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
}
