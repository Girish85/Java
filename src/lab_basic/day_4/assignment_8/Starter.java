package lab_basic.day_4.assignment_8;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Student student;
        String residentialStatus;
        System.out.println("Enter the Residential status of Student : ");
        residentialStatus = new Scanner(System.in).next();
        if (residentialStatus.equalsIgnoreCase("Hostelite"))
        {
            student = new Hostelite(101,'L',"Girish","Nagella",9582.25,"UMKC Dorms",401);
        }
        else
        {
            student = new DayScholar(102,'F',"Ramesh","Reddy",6485.25,"5304 Harrison Street Kansas City MO 64110");
        }
        student.displayStudentDetails();
    }
}
