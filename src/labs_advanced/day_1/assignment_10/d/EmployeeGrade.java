package labs_advanced.day_1.assignment_10.d;

public class EmployeeGrade {
    private int employeeNo;
    private String employeeName;
    private float customer1Feedback;
    private float customer2Feedback;
    private float customer3Feedback;
    private float averageFeedback;
    private char grade;
    private int numberOfFeedbacks;
    /*EmployeeGrade()
    {
        numberOfFeedbacks = 3;
        this.employeeNo = 101;
        this.employeeName = "Ram";
        this.customer1Feedback = 4.1f;
        this.customer2Feedback = 4.0f;
        this.customer3Feedback = 4.3f;
    }*/
    EmployeeGrade(int employeeNo,String employeeName,float customer1Feedback,float customer2Feedback,float customer3Feedback)
    {
        numberOfFeedbacks = 3;
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;
        this.customer3Feedback = customer3Feedback;
    }
    public void calculateAverageFeedback()
    {
        if (numberOfFeedbacks==3)
            averageFeedback = (customer1Feedback+customer2Feedback+customer3Feedback)/3;
        if (numberOfFeedbacks==2)
            averageFeedback = (customer1Feedback+customer2Feedback)/2;
    }
    public void calculateGrade()
    {
        if (averageFeedback>=4.5)
            grade = 'A';
        else if (averageFeedback>=4)
            grade = 'B';
        else if (averageFeedback>=3.25)
            grade = 'C';
        else if (averageFeedback>=2.5)
            grade = 'D';
        else grade = 'E';
    }
    public void displayInfo()
    {
        System.out.println("Employee No : "+employeeNo);
        System.out.println("Employee Name : "+employeeName);
        System.out.println("Average Feedback : "+averageFeedback);
        System.out.println("Grade : "+grade);
    }
}
