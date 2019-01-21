package lab_basic.day_5.assignment_3;

public class Example implements InterOne{

    @Override
    public void methodOne() {
        //  varTwo += 10;           Can't update values of final variables
        System.out.println("Value of varTwo : "+varTwo);
        System.out.println("Good Morning");
    }

    @Override
    public void methodTwo() {
        System.out.println("Good Afternoon");
    }
}
