package labs_advanced.day_4.assignment_30;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        employee1.setEmployeeId(1001);
        employee2.setEmployeeId(1002);
        employee3.setEmployeeId(1003);
        employee4.setEmployeeId(1004);
        employee1.setEmployeeName("Girish");
        employee2.setEmployeeName("Johhn");
        employee3.setEmployeeName("Snow");
        employee4.setEmployeeName("Casey");
        List<Employee> list = new ArrayList();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext())
        {
            Employee employee = iterator.next();
            System.out.println("Employee ID : "+employee.getEmployeeId());
            System.out.println("Employee Name : "+employee.getEmployeeName());
        }
    }
}
