package labs_advanced.day_2.assignment_15;

public class WellsBank {
    public static void main(String[] args) {
        Customer john = new Customer(1001,"John","5304 Harrison Street Kansas City",64110);
        Account johnSA = new SavingsAccount(101,1000,john);
        WellsBank wellsBank = new WellsBank();
        wellsBank.transaction(johnSA,1000);
        johnSA.printBalance();
        johnSA.withdraw(1600);
        johnSA.printBalance();
        Customer jenny = new Customer(2883,"jenny","5411 Harrison Street Kansas City",64110);
        Account jennyOA = new OverdraftAccount(201,500,jenny);
        wellsBank.transaction(jennyOA,1500);
        jennyOA.printBalance();
        jennyOA.withdraw(1000);
        jennyOA.printBalance();
        jennyOA.withdraw(4000);
        jennyOA.printBalance();
        jennyOA.withdraw(3000);
        jennyOA.printBalance();
    }
    public void transaction(Account account,double amount)
    {
        account.deposit(amount);
    }
}
