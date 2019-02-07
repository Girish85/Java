package advanced.six;

public class Security {
    public void authorization(Account account,Customer customer) throws UnAuthorizedWithdrawlException
    {
        if (account.getCustomer().getCustomerId()!=customer.getCustomerId())
            throw new UnAuthorizedWithdrawlException();
    }
}
