package labs_advanced.day_3.assignment_26;

public abstract class Account {
    protected int accountNo;
    protected double balance;
    protected Customer customer;
    Account()
    {
        System.out.println("Welcome to Account");
    }
    public abstract void deposit(double money);
    public abstract void withdraw(double money) throws InsufficientBalanceException;
    public abstract void printBalance();
}
