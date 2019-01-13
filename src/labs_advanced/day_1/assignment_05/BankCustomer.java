package labs_advanced.day_1.assignment_05;

import java.util.Random;

class Name
{
    String fName;
    String mName;
    String lName;
}
enum AccountType {Salary,NonSalary};
public class BankCustomer {
    Name name;
    String emailId;
    AccountType accountType;
    String dateOfBirth;
    char gender;
    String martialStatus;
    boolean isAvailChequeBook;
    boolean isAvailDiscount;
    boolean isAvailATMcard;
    private int customerId;
    private int accountNumber;
    BankCustomer(Name name,String emailId,AccountType accountType,String dateOfBirth,char gender,String martialStatus)
    {
        this.name = name;
        this.emailId = emailId;
        this.accountType = accountType;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.martialStatus = martialStatus;
        priviliges();
        getCustomerId();
        getAccountNumber();
        System.out.println("Customer Successfully Created the account");
        System.out.println("Customer ID : "+customerId);
        System.out.println("Account Number : "+accountNumber);
    }
    private void priviliges()
    {
        switch (accountType)
        {
            case Salary:
                isAvailChequeBook = false;
                isAvailDiscount = false;
                isAvailATMcard = true;
                break;
            case NonSalary:
                isAvailChequeBook = false;
                isAvailDiscount = true;
                isAvailATMcard = true;
        }
    }
    private int getCustomerId()
    {
        customerId = 10000+new Random().nextInt(9999);
        return customerId;
    }
    private int getAccountNumber()
    {
        accountNumber = 10000000+new Random().nextInt(9999999);
        return accountNumber;
    }
}
