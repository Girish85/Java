package labs_advanced.day_2.assignment_12.c;

public class Loan {
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private float loanDuration;
    private float interest;
    private static int loanCounter = 0;
    private Loan()
    {
        loanCounter++;
    }
    private Loan(int loanNo,int accountNo,int customerNo,float loanAmount,float loanDuration,float interest)
    {
        loanCounter++;
        this.loanNo = loanNo;
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanDuration = loanDuration;
        this.interest = interest;
        this.loanAmount = loanAmount;
    }
    public static Loan getInstance()
    {
        return new Loan(1881,80100522,1235489,100000,24,12.5f);
    }
    public static int getNumberOfObjects()
    {
        return loanCounter;
    }
    public static void setLoanCounter(int loanCounter1)
    {
        loanCounter = loanCounter1;
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
