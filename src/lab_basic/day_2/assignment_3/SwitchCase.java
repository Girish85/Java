package lab_basic.day_2.assignment_3;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        char grade = 'B';
        boolean loop;
        do
            {
                System.out.println("Please choose your Grade from the following grades :");
                System.out.println("A  B  C  D  E");
                Scanner scanner = new Scanner(System.in); // Reading input from user
                grade = scanner.next().charAt(0);
                switch (grade)
                {
                    case 'A' : System.out.println("Your score range is 80-100");
                               break;
                    case 'B' : System.out.println("Your score range is 73-79");
                        break;
                    case 'C' : System.out.println("Your score range is 65-72");
                        break;
                    case 'D' : System.out.println("Your score range is 55-64");
                        break;
                    case 'E' : System.out.println("Your score range is <55");
                        break;
                    default  : System.out.println("Invalid Grade : Grade doesn't exist");

                }
                System.out.println("Do you want to continue? Y or N"); // User can check for other grades or can quit the program
                if (scanner.next().toUpperCase().charAt(0)=='Y')
                    loop = true;
                else loop = false;
            }while (loop);
    }
}
