package labs_advanced.day_3.assignment_24;

public class Starter {
    public static void main(String[] args) {
        String name = "John";
        int total = 100,count = 10;
        try {
            int average = total/count;
            System.out.println(average);
            System.out.println(name.length());
            System.out.println("End of try block");     //This won't be displayed
        }
        catch (NullPointerException e)
        {
            System.out.println("Object is null : "+e.toString());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Caught :"+e.toString());
        }
        finally {
            System.out.println("Inside Finally block");
        }
        System.out.println("Continuing the Execution");
    }
}
