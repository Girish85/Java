package advanced.eight;

public class WellsBank {
    public static void main(String[] args) {
        BankFund bankFund = new BankFund(9000000);
        LoanTransaction []loanTransactions = new LoanTransaction[100];
        for (int i = 0; i < loanTransactions.length; i++) {
            loanTransactions[i] = new LoanTransaction(bankFund,1000+i,250000);
        }
        for (int i = 0; i < loanTransactions.length; i++) {
            loanTransactions[i].run();
        }
    }
}
