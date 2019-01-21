package labs_advanced.day_2.assignment_15;

public class OverdraftAccount extends Account {
    double overdraftAmount = 5000;
    OverdraftAccount()
    {
        System.out.println("You have Overdraft account");
    }
    OverdraftAccount(int accountNo, double balance, Customer customer)
    {
        super();
        System.out.println("You currently have Overdraft account");
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
        if (money>balance+overdraftAmount)
        {
            System.out.println("Can not perform Transaction due to insufficient balance");
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
        System.out.println("Available Balance in your account : "+(balance+overdraftAmount));
    }
    public double getEligibilityAmount()
    {
        return overdraftAmount;
    }
}
