package labs_advanced.day_3.assignment_23;

public class Starter {
    public static void main(String[] args) {
        String name = null;
        int total = 100,count = 0;
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
        name = "John";
        System.out.println(name.length());
    }
}
