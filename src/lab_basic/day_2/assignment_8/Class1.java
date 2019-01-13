package lab_basic.day_2.assignment_8;

public class Class1 {
    int i = 22;
    int j = 14000;
    boolean k;
    boolean l;

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.k = class1.method1(class1.i);
        class1.l = class1.method2(class1.j);
        if (class1.k && class1.l)
            System.out.println("Is a new employee");
        else
            System.out.println("Is not a new employee");
    }

    public boolean method1(int i)
    {
        return (this.i>20 && this.i<30);
    }
    public boolean method2(int j)
    {
        return  (this.j>=14000 && this.j<20000);
    }
}
