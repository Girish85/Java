package lab_basic.day_5.assignment_2.package_registration;

public class Registration {
    public static void main(String args[]) {
        DayScholar dayScholar = new DayScholar();
        dayScholar.setStudentId(401);
        dayScholar.setStudentType('G');
        dayScholar.setStudentName("Girish");
        dayScholar.getDetails();
    }
}
