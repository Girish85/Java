package labs_advanced.day_2.assignment_12.c;

public class Starter {
    static {
        Loan.setLoanCounter(500);
    }
    public static void main(String[] args) {
        Loan loan = Loan.getInstance();
        System.out.println("Number of instances : "+ Loan.getNumberOfObjects());
        Loan loan1 = Loan.getInstance();
        System.out.println("Number of instances : "+ Loan.getNumberOfObjects());
    }
}
