package labs_advanced.day_2.assignment_16;

public abstract class Account {
    protected int accountNo;
    protected double balance;
    protected Customer customer;
    Account()
    {
        System.out.println("Welcome to Account");
    }
    public abstract void deposit(double money);
    public abstract void withdraw(double money);
    public abstract void printBalance();
}
