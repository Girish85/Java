package lab_basic.day_5.assignment_2.package_registration;

import lab_basic.day_5.assignment_2.course_registration.Student;

public class DayScholar extends Student {
    private String residentialAddress;
    public void setResAddress(String resAddress)
    {
        this.residentialAddress=resAddress;
    }
    public void getDetails()
    {
        System.out.println("Student Id:"+studentId);
        System.out.println("Student Type:"+studentType);
        System.out.println("Student Name:"+studentName);
    }
}
