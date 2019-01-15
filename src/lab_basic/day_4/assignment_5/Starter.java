package lab_basic.day_4.assignment_5;

public class Starter {
    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(5,"OOP",16000,1001,'D',"Manu","No 32/3 Vijayanagar");
        dayScholar.calculateFees();
        System.out.println("DayScholar Student details are : ");
        System.out.println("StudentID : "+dayScholar.studentId);
        System.out.println("StudentType : "+dayScholar.studentType);
        System.out.println("StudentName : "+dayScholar.studentName);
        System.out.println("PostGraduate Course ID : "+dayScholar.getPostCourseId());
        System.out.println("PostGraduate Course Name : "+dayScholar.getPostCourseName());
        System.out.println("Fees per Month : "+dayScholar.getFeesPerMonth());
        System.out.println("Residential Address : "+dayScholar.residentialAddress);
        System.out.println("Total Number Of Students : "+Student.studentNumber);
    }
}
