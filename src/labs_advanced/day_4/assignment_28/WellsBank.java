package labs_advanced.day_4.assignment_28;

public class WellsBank {
    public static void main(String[] args) {
        Customer john = new Customer();
        john.setCustomerId(1004);
        john.setCustomerName("John");
        john.setCustomerAddress("5304 Harrison Street Kansas City");
        john.setPincode(64110);
        System.out.println("Customer Details :");
        System.out.println("Customer ID : "+john.getCustomerId());
        System.out.println("Customer Name : "+john.getCustomerName());
        System.out.println("Customer Address : "+john.getCustomerAddress());
        System.out.println("Pincode : "+john.getPincode());
    }
}
