package lab_basic.day_1.assignment_6;

public class Operator {
    public static void main(String[] args) {
        int intVal = 10;
        float floatVal = 3.0f;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = true;
        //Arithmetic % Modulus operator
        System.out.println("Arithmetic");
        System.out.println(intVal+"%"+floatVal+"="+(intVal%floatVal));
        System.out.println("\n");
        // String Concatenation : '+' operator observe difference
        System.out.println("String Concatenation");
        System.out.println("Day"+2+"Session");
        System.out.println("\n"+2+3+"\n"+(2+3));//prints 23 (because it encountered string first "\n") and 5 in next line
        System.out.println();
        // Relational '==' Equality operator
        System.out.println("Relational");
        System.out.println(intVal+"=="+floatVal+"="+(intVal==floatVal));
        floatVal=10.0f;
        System.out.println(intVal+"=="+floatVal+"="+(intVal==floatVal));
        System.out.println();
        if (bool1 || (bool1&&(bool2=false)))
        {
            System.out.println("Success");
        }
        else {
            System.out.println("Failure");
        }
        System.out.println("bool2 value is :"+bool2);
    }
}
