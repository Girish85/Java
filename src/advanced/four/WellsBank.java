package advanced.four;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WellsBank {
    private static final CustomerDB customerDB = new CustomerDB();
    private static final Login login = new Login();

    public static void main(String[] args) {
        Customer customer = new Customer(1001,"Girish",true);
        customerDB.saveCustomer(customer);
        login.addLogin(1001,"Giri$h99");
        Customer customer1 = new Customer(1002,"Joseph",false);
        customerDB.saveCustomer(customer1);
        login.addLogin(1002,"J0$eph7");
        Customer customer2 = new Customer(1003,"Raghav",true);
        customerDB.saveCustomer(customer2);
        login.addLogin(1003,"R@gh@v9");
        Customer customer3 = new Customer(1004,"Anil",false);
        customerDB.saveCustomer(customer3);
        login.addLogin(1004,"A@nil99");
        List<Customer> customerList = customerDB.getAllCustomer();
        if (customerList.isEmpty())
        {
            System.out.println("No Customers");
        }
        else printCustomerList(customerList);
        Set<Integer> loanAvailedCustomer = customerDB.getLoanAvailedCustomers();
        System.out.println("Customers who have availed the loan : ");
        for(int customerId:loanAvailedCustomer)
        {
            System.out.println(customerId);
        }
    }

    public static void printCustomerList(List<Customer> customerList)
    {
        System.out.println("\tCustomer Details");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("CustomerID\tCustomerName\tLoanAvailed");
        Iterator<Customer> iterator = customerList.iterator();
        while (iterator.hasNext())
        {
            Customer customer = iterator.next();
            System.out.println(customer.getCustomerId()+"\t\t"+customer.getCustomerName()+"\t\t\t"+((customer.isLoanAvailed())?"Yes":"No"));
        }
    }
}
