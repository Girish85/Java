package labs_advanced.day_1.assignment_05;

public class AddCustomer {
    public static void main(String[] args) {
        Name name = new Name();
        name.fName = "Girish Kumar";
        name.mName = "Reddy";
        name.lName = "Nagella";
        String emailId = "usgirishnagella@gmail.com";
        AccountType accountType = AccountType.Salary;
        String dateOfBirth = "27March1995";
        char gender = 'M';
        String martialStatus = "Single";
        BankCustomer bankCustomer = new BankCustomer(name,emailId,accountType,dateOfBirth,gender,martialStatus);
    }
}
