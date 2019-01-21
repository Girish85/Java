package labs_advanced.day_2.assignment_17;

public class SavingsAccount extends Account {
double minimumBalance = 500;
double interestrate = 12;
SavingsAccount()
{
    super();
    System.out.println("You have Savings account");
}
SavingsAccount(int accountNo, double balance, Customer customer)
{
    super();
    System.out.println("You currently have Savings account");
    this.accountNo = accountNo;
    this.balance = balance;
    this.customer = customer;
}
    public void deposit(double money)
    {
        balance += money;
    }
    public void withdraw(double money)
    {
        if (balance-money<minimumBalance)
        {
            System.out.println("Can not perform Transaction due to minimum balance");
        }
        else
        {
            System.out.println("Withdraw Successfull");
            balance -= money;
            System.out.println("Remaining Balane : "+balance);
        }
    }
    public void printBalance()
    {
        System.out.println("Balance in your account : "+balance);
    }
    public void calculateInterest()
    {
        System.out.println("Total interest : "+(balance*(interestrate/100)));
    }
}
