package lab_basic.day_4.assignment_4.problem_2;

public class DayScholar extends Student {
    private String residentialAddress;
    DayScholar(int studentId,char studentType, String studName, int semFees, String residentialAddress, String cName)
    {
        super(studentId,studentType,studName, semFees, cName);
        this.residentialAddress=residentialAddress;
    }
    public void displayDetails()
    {
        //need to display the Details of the Student and
        // DayScholar
        super.displayDetails();
        System.out.println("Student ID : "+studentId);
        System.out.println("Student Type : "+studentType);
        System.out.println("Student Name : "+studentName);
        System.out.println("Semester Fees : "+semesterFees);
        System.out.println("Residential Address : "+residentialAddress);

    }
}
