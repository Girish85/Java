package labs_advanced.day_2.assignment_13;

public class WellsBank {
    public static void main(String[] args) {
        Customer customer = new Customer(1001,"Girish","5304 Harrison Street Kansas City",64110);
        Account account = new SavingsAccount(18420416,145465.85,customer);
        account.printBalance();
        ((SavingsAccount) account).calculateInterest();
        account.deposit(22500.00);
        account.withdraw(15000);
        account.printBalance();
        Customer customer1 = new Customer(2883,"Priyatham","5411 Harrison Street Kansas City",64110);
        Account account1 = new OverdraftAccount(18645452,65465.85,customer1);
        account1.printBalance();
        double overDraftAmount = ((OverdraftAccount) account1).getEligibilityAmount();
        System.out.println("Overdraft Amount : "+overDraftAmount);
        account1.deposit(42500.00);
        account1.withdraw(12000);
        account1.printBalance();
    }
}
