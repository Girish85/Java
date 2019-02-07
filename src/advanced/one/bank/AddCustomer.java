package advanced.one.bank;

import java.util.ArrayList;
import java.util.Iterator;

public class AddCustomer {
    public void printCustomers(ArrayList<String> arrayList)
    {
        Iterator<String> stringIterator = arrayList.listIterator();
        while (stringIterator.hasNext())
        {
            System.out.println(stringIterator.next());
        }
    }

    public static void main(String[] args) {
        AddCustomer addCustomer = new AddCustomer();
        ArrayList<String> customerList = new ArrayList<>();
        customerList.add("Jack");
        customerList.add("Sparrow");
        customerList.add("Girish");
        customerList.add("Leonardo");
        addCustomer.printCustomers(customerList);
    }
}
