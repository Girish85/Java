package lab_basic.day_2.self_review;

public class ExampleOne {
    public static void main(String[] args)
    {
        int intvalOne = 0;
        int intvalTwo = 0;
        for (short index=0;index < 5;index++)
        {
            if ((++intvalOne>2)||(++intvalTwo>2))
            {
                intvalOne++;
            }
        }
        System.out.println(intvalOne+""+intvalTwo);//doesn't print the sum but instead concatenate
    }
}
