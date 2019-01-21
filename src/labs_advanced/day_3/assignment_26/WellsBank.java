package labs_advanced.day_3.assignment_26;

public class WellsBank {
    public static void main(String[] args) {
        Customer john = new Customer(1001,"John","5304 Harrison Street Kansas City",64110);
        Account johnSA = new SavingsAccount(101,1000,john);
        WellsBank wellsBank = new WellsBank();
        wellsBank.transaction(johnSA,1000);
        johnSA.printBalance();
        try {
            johnSA.withdraw(1600);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        johnSA.printBalance();
        Customer jenny = new Customer(2883,"jenny","5411 Harrison Street Kansas City",64110);
        Account jennyOA = new OverdraftAccount(201,500,jenny);
        wellsBank.transaction(jennyOA,1500);
        jennyOA.printBalance();
        try {
            jennyOA.withdraw(1000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        jennyOA.printBalance();
        try {
            jennyOA.withdraw(4000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        jennyOA.printBalance();
        try {
            jennyOA.withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        jennyOA.printBalance();
    }
    public void transaction(Account account, double amount)
    {
        account.deposit(amount);
        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
