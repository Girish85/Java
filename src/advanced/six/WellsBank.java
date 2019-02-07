package advanced.six;

public class WellsBank {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1001,"Girish");
        Account account1 = new Account(2001,customer1,20000);
        Customer customer2 = new Customer(1002,"Gary");
        Account account2 = new Account(2001,customer2,20000);
        DepositTransaction firstDeposit = new DepositTransaction(9001,account2,4000,5001);
        firstDeposit.start();
        DepositTransaction secondDeposit = new DepositTransaction(9002,account1,7000,5002);
        secondDeposit.start();
        WithdrawTransaction withdrawTransaction1 = new WithdrawTransaction(9003,account1,500,customer2);
        Thread withdraw1 = new Thread(withdrawTransaction1);
        withdraw1.start();
        WithdrawTransaction withdrawTransaction2 = new WithdrawTransaction(9004,account1,500,customer1);
        Thread withdraw2 = new Thread(withdrawTransaction2);
        withdraw2.start();
    }
}
