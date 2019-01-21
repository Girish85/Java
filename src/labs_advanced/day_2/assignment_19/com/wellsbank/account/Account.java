package labs_advanced.day_2.assignment_19.com.wellsbank.account;

import labs_advanced.day_2.assignment_19.com.wellsbank.customer.Customer;

public abstract class Account {
    protected int accountNo;
    protected double balance;
    protected Customer customer;
    public Account()
    {
        System.out.println("Welcome to Account");
    }
    public void deposit(double money){}
    public void withdraw(double money){}
    public void printBalance(){}
}
