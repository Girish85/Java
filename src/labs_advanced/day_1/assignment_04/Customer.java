package labs_advanced.day_1.assignment_04;

public class Customer {
    private String customerId;
    private String customerName;
    private String address;
    private int zipcode;

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.customerId = "14290798";
        customer.customerName = "Girish Nagella";
        customer.address = "5304 Harrison street, Kansas City, Mo";
        customer.zipcode = 64110;
        System.out.println("Customer ID : "+customer.customerId);
        System.out.println("Customer Name : "+customer.customerName);
        System.out.println("Address : "+customer.address);
        System.out.println("Zipcode : "+customer.zipcode);
    }
// when the class is public the file name and class name should be same
}
