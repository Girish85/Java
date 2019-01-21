package labs_advanced.day_2.assignment_20.package2;

import labs_advanced.day_2.assignment_20.package1.Base;

public class Child2 extends Base {
    public void getValues()
    {
        Base base = new Base();
        System.out.println(variable3);
        //System.out.println(base.variable3);           doesn't work
        System.out.println(variable4);
    }

    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.getValues();
    }
}
