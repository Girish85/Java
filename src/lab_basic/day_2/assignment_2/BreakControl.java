package lab_basic.day_2.assignment_2;

public class BreakControl {
    public static void main(String[] args) {
        boolean bool = true;
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<10;j++)
            {
                System.out.println(j+"\t");
                if (j>5)
                {
                    break;
                }
            }
            System.out.println("Outer loop");
        }
        System.out.println("End");
    }
}
