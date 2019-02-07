package advanced.seven;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException() {
        super("Insufficient balance in the account");
    }
}
