package labs_advanced.day_1.assignment_6;

public class AddCustomer {
    public static void main(String[] args) {
        System.out.println("First Customer");
        Name name = new Name();
        name.fName = "Paul";
        name.mName = "J";
        name.lName = "Anderson";
        String emailId = "Paul@Wellsfargo.com";
        AccountType accountType = AccountType.Salary;
        String dateOfBirth = "3rdJan,1985";
        char gender = 'M';
        String martialStatus = "Single";
        BankCustomer bankCustomer = new BankCustomer(name,emailId,accountType,dateOfBirth,gender,martialStatus);
        System.out.println("Second Customer");
        Name name1 = new Name();
        name.fName = "John";
        name.mName = "";
        name.lName = "Jacob";
        String emailId1 = "John@Wellsfargo.com";
        AccountType accountType1 = AccountType.NonSalary;
        String dateOfBirth1 = "6thMar,1985";
        char gender1 = 'M';
        String martialStatus1 = "Married";
        BankCustomer bankCustomer1 = new BankCustomer(name1,emailId1,accountType1,dateOfBirth1,gender1,martialStatus1);
    }
}
