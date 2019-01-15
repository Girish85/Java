package lab_basic.day_4.assignment_7;

public final class DayScholar extends Student {
    private String residentialAddress;
    DayScholar(){}
    DayScholar(int studentId,char studentType,String studentName,double semesterFees,String residentialAddress)
    {
        setStudentId(studentId);
        setStudentType(studentType);
        setStudentName(studentName);
        setResAddress(residentialAddress);
    }
    public void setResAddress(String resAddress)
    {
        this.residentialAddress=resAddress;
    }
    public void displayDayScholarDetails()
    {
        displayDetails();
        System.out.println("Residential Address : "+residentialAddress);
    }
    }
