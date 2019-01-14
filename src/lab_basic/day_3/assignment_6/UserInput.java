package lab_basic.day_3.assignment_6;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int number;
        int iterations;
        System.out.println("Enter the number for Multiplication table : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("Enter the range for your Multiplication table :");
        iterations = scanner.nextInt();
        System.out.println("\tMultiplication Table for "+number+" : \n");
        for (int i=0;i<iterations;i++)
        {
            System.out.println("\t"+number+" * "+i+" = "+(number*i));
        }
    }
}
