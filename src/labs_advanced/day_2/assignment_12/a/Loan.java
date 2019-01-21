package labs_advanced.day_2.assignment_12.a;

public class Loan {
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private float loanDuration;
    private float interest;
    static int loanCounter = 0;
    public Loan()
    {
        loanCounter++;
    }
    public Loan(int loanNo,int accountNo,int customerNo,float loanAmount,float loanDuration,float interest)
    {
        loanCounter++;
        this.loanNo = loanNo;
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanDuration = loanDuration;
        this.interest = interest;
        this.loanAmount = loanAmount;
    }
    public float calculateInstallments()
    {
        return (loanAmount*(1+interest/100))/loanDuration;
    }
    public void setLoanNo(int loanNo)
    {
        this.loanNo = loanNo;
    }
    public void setAccountNo(int accountNo)
    {
        this.accountNo = accountNo;
    }
    public void setCustomerNo(int customerNo)
    {
        this.customerNo = customerNo;
    }
    public void setLoanAmount(float loanAmount)
    {
        this.loanAmount = loanAmount;
    }
    public void setLoanDuration(float loanDuration)
    {
        this.loanDuration = loanDuration;
    }
    public void setInterest(float interest)
    {
        this.interest = interest;
    }
    public int getLoanNo()
    {
        return loanNo;
    }
    public int getAccountNo()
    {
        return accountNo;
    }
    public int getCustomerNo()
    {
        return customerNo;
    }
    public float getLoanAmount()
    {
        return loanAmount;
    }
    public float getLoanDuration()
    {
        return loanDuration;
    }
    public float getInterest()
    {
        return interest;
    }
}
