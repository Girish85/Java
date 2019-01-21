package labs_advanced.day_2.assignment_15;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private int pincode;
    Customer()
    {

    }
    Customer(int customerId,String customerName,String customerAddress,int pincode)
    {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.pincode = pincode;
    }
    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public void setCustomerAddress(String customerAddress)
    {
        this.customerAddress = customerAddress;
    }
    public void setPincode(int pincode)
    {
        this.pincode = pincode;
    }
    public int getCustomerId()
    {
        return customerId;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public String getCustomerAddress()
    {
        return customerAddress;
    }
    public int getPincode()
    {
        return pincode;
    }
}
