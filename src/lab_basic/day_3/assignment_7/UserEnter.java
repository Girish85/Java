package lab_basic.day_3.assignment_7;

import java.util.Scanner;

public class UserEnter {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Enter the Student Details : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Student ID : ");
        student.setStudentId(scanner.nextInt());
        System.out.println("Please Enter Student First Name : ");
        String fName = scanner.next();
        System.out.println("Please Enter Student Last Name : ");
        String lName = scanner.next();
        student.setStudentName(fName,lName);
        System.out.println("Please Enter Residential Status : ");
        student.setResidentialStatus(scanner.next());
        System.out.println("Please Enter Semester Fees : ");
        student.setSemesterFees(scanner.nextLong());
        if (student.getResidentialStatus().equalsIgnoreCase("Hostelite"))
        {
            System.out.println("Please Enter Hostel fees : ");
            student.setHostelFees(scanner.nextLong());
        }
        System.out.println("\n");
        System.out.println("Here are the details of Student : ");
        System.out.println("StudentID\tStudentName\tResidentialStatus\tTotalFees");
        System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getResidentialStatus()+"\t"+student.getTotalFees());
    }
}
