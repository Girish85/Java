package advanced.seven;

public class UnAuthorizedWithdrawlException extends Exception {
    public UnAuthorizedWithdrawlException() {
        super("User is unauthorized for withdrawl");
    }
}
