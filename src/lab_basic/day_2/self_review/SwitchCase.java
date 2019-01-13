package lab_basic.day_2.self_review;

public class SwitchCase {
    public static void main(String[] args) {
        String comment;
        int val = (int)(4*3);
        switch (val)
        {
            case 0 : comment = "case 0";
                     break;
            case 1 : comment = "case 1";
                     break;
            case 2 : comment = "case 2";
                     break;
            default : comment = "OOPS!! Something is wrong";
                     break;
        }
        System.out.println(comment);
    }
}
