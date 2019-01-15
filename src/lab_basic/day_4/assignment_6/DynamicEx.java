package lab_basic.day_4.assignment_6;

public class DynamicEx {
    public static void main(String args[])
    {
        DayScholar dayScholar=new DayScholar(); // Student reference can't access setResAddress method as its new and belongs only to DayScholar
        dayScholar.setStudentId(1001);
        dayScholar.setStudentType('D');
        dayScholar.setStudentName("Thomas");
        dayScholar.setResAddress("No 32/3 Vijayanagar");
        dayScholar.getDetails();
    }
}
