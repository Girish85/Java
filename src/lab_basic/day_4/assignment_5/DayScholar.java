package lab_basic.day_4.assignment_5;

public class DayScholar extends PostGradStudent {
    protected String residentialAddress;
    private double feesPerMonth;
    DayScholar(int postCourseId,String postCourseName,int postCourseFees,int studentId,char studentType,String studentName,String residentialAddress)
    {
        super(postCourseId,postCourseName,postCourseFees,studentId,studentType,studentName);
        this.residentialAddress = residentialAddress;
    }
    public void calculateFees()
    {
        feesPerMonth = postCourseFees/6;
    }
    public double getFeesPerMonth()
    {
        return feesPerMonth;
    }
}
