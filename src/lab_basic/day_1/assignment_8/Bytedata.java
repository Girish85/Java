package lab_basic.day_1.assignment_8;

public class Bytedata {
    public static void main(String[] args) {
        int intval = 100;
        byte byteval = (byte)intval; //type casting
        byte max = 127;
        byte min = -128;
        byte sum = (byte) (max+min); //error if type casting not performed
        System.out.println("sum = "+sum);
    }
}
