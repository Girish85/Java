package advanced.seven;

public class DepositTransaction extends Thread {
    private int transactionId;
    private Account account;
    private double amount;
    private int customerId;

    public DepositTransaction(int transactionId, Account account, double amount, int customerId) {
        this.transactionId = transactionId;
        this.account = account;
        this.amount = amount;
        this.customerId = customerId;
    }

    public synchronized void deposit(Account account, double amount)
    {
        account.setBalance(account.getBalance()+amount);
    }
    @Override
    public void run() {
        deposit(account,amount);
        System.out.println("Transaction "+transactionId+"Completed"+customerId+" thankyou for depositing to the Account "+account.getAccountNo());
    }
}
