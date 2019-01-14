package lab_basic.day_3.assignment_5;

import java.util.Scanner;

/**
 * The main function of this class is to take username as input from user and print the <h1>length</h1>
 * of the name and display Hi <Username>
 *     later converts Username to Upper and Lower cases
 *     it also checks whether the username starts with 'a' and then
 *     modifies Username to "KRISHNA"
 *
 * @author Girish Nagella
 */
public class JavaDoc {
    private String userName;
    private int length;
    private String upperCase;
    private String lowerCase;
    public static void main(String[] args) {
        JavaDoc javaDoc = new JavaDoc();
        System.out.println("Enter user name : ");
        Scanner scanner = new Scanner(System.in);
        javaDoc.userName = scanner.next();
        javaDoc.length = javaDoc.userName.length();
        javaDoc.upperCase = javaDoc.userName.toUpperCase();
        javaDoc.lowerCase = javaDoc.userName.toLowerCase();
        System.out.println("Hi "+javaDoc.userName);
        System.out.println("Your name has "+javaDoc.length+" Characters");
        System.out.println("Uppercase : "+javaDoc.upperCase);
        System.out.println("Lowercase : "+javaDoc.lowerCase);
        javaDoc.userName = "KRISHNA";
        System.out.println("Username after modification : "+javaDoc.userName);
    }
}
