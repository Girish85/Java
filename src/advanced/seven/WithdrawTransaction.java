package advanced.seven;

public class WithdrawTransaction extends Security implements Runnable {
    private int transactionId;
    private Account account;
    private double amount;
    private Customer customer;

    public WithdrawTransaction(int transactionId, Account account, double amount, Customer customer) {
        this.transactionId = transactionId;
        this.account = account;
        this.amount = amount;
        this.customer = customer;
    }

    public synchronized double withdraw(Account account, double amount) throws InsufficientBalanceException
    {
        if (account.getBalance()>amount)
            account.setBalance(account.getBalance()-amount);
        else throw new InsufficientBalanceException();
        return account.getBalance();
    }
    @Override
    public void run() {
        try {
            authorization(account,customer);
            double balance = withdraw(account,amount);
            System.out.println("Transaction Completed your balance is : "+balance);
        } catch (UnAuthorizedWithdrawlException e) {
            System.out.println("Transaction Failed "+e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed : Your account has insufficient balance");
        }
    }
}
