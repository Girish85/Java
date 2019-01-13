package labs_advanced.day_1.assignment_8;

public class Wells {
    public static void main(String[] args) {
        int employeeNo = 1001;
        String employeeName = "Girish";
        float customer1Feedback = 3.75f;
        float customer2Feedback = 4.55f;
        float customer3Feedback = 4.67f;
        EmployeeGrade employeeGrade = new EmployeeGrade();
        employeeGrade.initializeEmployee(employeeNo,employeeName,customer1Feedback,customer2Feedback,customer3Feedback);
        employeeGrade.calculateAverageFeedback();
        employeeGrade.calculateGrade();
        employeeGrade.displayInfo();
    }
}
