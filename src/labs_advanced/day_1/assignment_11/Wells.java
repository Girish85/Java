package labs_advanced.day_1.assignment_11;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade employeeGrade[] = new EmployeeGrade[5];
        employeeGrade[0] = new EmployeeGrade(1001,"Girish",4.5f,5.0f,4.75f);
        employeeGrade[1] = new EmployeeGrade(1002,"Ram",4.75f,5.0f,4.45f);
        employeeGrade[2] = new EmployeeGrade(1003,"Priyatham",3.75f,4.25f,3.9f);
        employeeGrade[3] = new EmployeeGrade(1004,"Nikhil",3.5f,5.0f,4.5f);
        employeeGrade[4] = new EmployeeGrade(1005,"Sireesha",4.0f,2.0f,1.5f);
        for (EmployeeGrade employeeGrade1 : employeeGrade) {
            employeeGrade1.calculateAverageFeedback();
            employeeGrade1.calculateGrade();
            employeeGrade1.displayInfo();
        }
    }
}
