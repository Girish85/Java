package labs_advanced.day_4.assignment_32;

import java.util.Calendar;

public class Employee {
    public int employeeId;
    public String employeeName;
    Calendar dateofBirth;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Calendar getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Calendar dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
}
