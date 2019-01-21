package labs_advanced.day_3.assignment_25.com.exception;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("ExceptionDemo");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception : "+e.toString());
        }
    }
}
