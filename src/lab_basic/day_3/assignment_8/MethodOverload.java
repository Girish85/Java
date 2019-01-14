package lab_basic.day_3.assignment_8;

import java.util.Scanner;

public class MethodOverload {
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
        double semesterFees = scanner.nextDouble();
        if (student.getResidentialStatus().equalsIgnoreCase("Hostelite"))
        {
            System.out.println("Please Enter Hostel fees : ");
            double hostelFees = scanner.nextDouble();
            student.calculateFees(semesterFees,hostelFees);
        }
        else student.calculateFees(semesterFees);
        System.out.println("\n");
        System.out.println("Here are the details of Student : ");
        System.out.println("StudentID\tStudentName\tResidentialStatus\tTotalFees\n");
        System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getResidentialStatus()+"\t"+student.getFees());
    }
}
