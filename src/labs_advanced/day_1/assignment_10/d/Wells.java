package labs_advanced.day_1.assignment_10.d;

public class Wells {
    public static void main(String[] args) {
        //Error because compiler provide default constructor only when you don't have any constructors
        /*EmployeeGrade employeeGrade = new EmployeeGrade();
        employeeGrade.calculateAverageFeedback();
        employeeGrade.calculateGrade();
        employeeGrade.displayInfo();*/
        EmployeeGrade girish = new EmployeeGrade(102,"Girish",4.2f,4.1f,4.4f);
        girish.calculateAverageFeedback();
        girish.calculateGrade();
        girish.displayInfo();
    }
}
