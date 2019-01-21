package labs_advanced.day_3.assignment_22;

import java.util.Iterator;
import java.util.Vector;

public class EmployeeInfo {
    public static void main(String[] args) {
        Vector<Integer> empList = new Vector<Integer>();
        int empNo = 1000;
        for (int i = 0; i < 5; i++)
        {
            empNo++;
            Integer number = empNo;
            empList.add(number);
        }
        Iterator iterator = empList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
