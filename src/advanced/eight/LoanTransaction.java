package advanced.eight;

public class LoanTransaction implements Runnable {
    private BankFund bankFund;
    private int customerId;
    private double loanAmount;

    public LoanTransaction(BankFund bankFund, int customerId, double loanAmount) {
        this.bankFund = bankFund;
        this.customerId = customerId;
        this.loanAmount = loanAmount;
    }

    @Override
    public void run() {
        try {
            double fundavailable;
            synchronized(this) {
                bankFund.checkFund(loanAmount);
            }
            Thread.sleep((long)(2000*Math.random()));
            synchronized (this) {
                fundavailable = bankFund.debitFund(loanAmount);
            }
            System.out.println("Hi "+customerId+"Loan is disbursed\nPlease collect cash from the Teller\nFunds remaining : "+fundavailable);
        } catch (InsufficientFundException e) {
            System.out.println("Sorry "+customerId+" We are short of funds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
