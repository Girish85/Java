package labs_advanced.day_4.assignment_31;

import java.util.ArrayList;
import java.util.Iterator;

public class Employeeinfo {
    public static void main(String[] args) {
        ArrayList<Integer> employeeId = new ArrayList<>();
        employeeId.add(1001);
        employeeId.add(1002);
        employeeId.add(Integer.valueOf("1003"));

        for (int count = 0;count<employeeId.size();count++)
        {
            System.out.println(employeeId.get(count));
        }

    }
}
