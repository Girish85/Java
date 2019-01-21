package labs_advanced.day_2.assignment_12.a;

public class Starter {
    public static void main(String[] args) {
        Loan loan = new Loan(1881,80100522,1235489,100000,24,12.5f);
        System.out.println("Number of instances : "+Loan.loanCounter);
        Loan loan1 = new Loan();
        loan1.setLoanNo(1991);
        loan1.setAccountNo(80100698);
        loan1.setCustomerNo(1456582);
        loan1.setLoanAmount(120000);
        loan1.setLoanDuration(36);
        loan1.setInterest(12.95f);
        System.out.println("Number of instances : "+Loan.loanCounter);
    }
}
