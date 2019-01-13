package labs_advanced.day_1.assignment_9;

public class Wells {
    public static void main(String[] args) {
        int employeeNo = 1001;
        String employeeName = "Elvis";
        float customer1Feedback = 3.75f;
        float customer2Feedback = 4.55f;
        float customer3Feedback = 4.67f;
        EmployeeGrade employeeGrade = new EmployeeGrade();
        employeeGrade.initializeEmployee(employeeNo,employeeName,customer1Feedback,customer2Feedback,customer3Feedback);
        employeeGrade.calculateAverageFeedback();
        employeeGrade.calculateGrade();
        employeeGrade.displayInfo();
        int employeeNo2 = 1002;
        String employeeName2 = "Martha";
        float customer1Feedback1 = 4.80f;
        float customer2Feedback1 = 4.25f;
        EmployeeGrade employeeGrade2 = new EmployeeGrade();
        employeeGrade2.initializeEmployee(employeeNo2,employeeName2,customer1Feedback1,customer2Feedback1);
        employeeGrade2.calculateAverageFeedback();
        employeeGrade2.calculateGrade();
        employeeGrade2.displayInfo();
    }
}
