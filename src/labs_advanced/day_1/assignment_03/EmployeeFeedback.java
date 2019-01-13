package labs_advanced.day_1.assignment_03;

public class EmployeeFeedback {
    public static void main(String[] args) {
        double empInfo[][] = {{1001,4.25,3.5,5.0,4.5},{1002,3.75,4.5,4.75},{1003,4.5,4.75,4.5,4.25}};
        System.out.println("Feedbacks of employees from their customers :\n");
        System.out.println("EmployeeID\tFeedbacks");
        for (int i=0;i<empInfo.length;i++)
        {
            int employeeId = (int)empInfo[i][0];
            System.out.println("\n");
            System.out.print(employeeId+"\t");
            for (int j=1;j<empInfo[i].length;j++)
            {
                System.out.print(empInfo[i][j]+"  ");
            }
        }
    }
}
