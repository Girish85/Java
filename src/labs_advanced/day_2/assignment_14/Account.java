package labs_advanced.day_2.assignment_14;

public abstract class Account {
    protected int accountNo;
    protected double balance;
    protected Customer customer;
    Account()
    {
        System.out.println("Welcome to Account");
    }
    public void deposit(double money){}
    public void withdraw(double money){}
    public void printBalance(){}
}
