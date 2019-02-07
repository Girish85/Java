package advanced.four;

import java.util.*;

public class CustomerDB {
    private List<Customer> customerList = new ArrayList<>();

    public boolean saveCustomer(Customer customer)
    {
        boolean status = false;
        status = customerList.add(customer);
        return status;
    }

    public List<Customer> getAllCustomer()
    {
        return customerList;
    }

    public Set<Integer> getLoanAvailedCustomers()
    {
        Set<Integer> set = new TreeSet<>();
        Iterator<Customer> iterator = customerList.iterator();
        while (iterator.hasNext())
        {
            Customer customer = iterator.next();
            if (customer.isLoanAvailed())
            {
                set.add(customer.getCustomerId());
            }
        }
        return set;
    }
}
