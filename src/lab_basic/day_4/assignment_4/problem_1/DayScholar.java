package lab_basic.day_4.assignment_4.problem_1;

public class DayScholar extends Student {
    private String residentialAddress;
    DayScholar(int studentId,char studentType ,String studName,int semFees,String residentialAddress)
    {
        super(studentId,studentType,studName,semFees);
        this.residentialAddress=residentialAddress;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Residential Address : "+residentialAddress);
    };
}
