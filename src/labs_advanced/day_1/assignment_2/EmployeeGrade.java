package labs_advanced.day_1.assignment_2;

public class EmployeeGrade {
    public static void main(String[] args) {
        //Calculating average feedback of 5 employees and determining their grade
        int employeeId[] = {1001,1002,1003,1004,1005};
        float customer1Feedback[] = {3.95f,2.5f,4.25f,4.75f,3.05f};
        float customer2Feedback[] = {4.5f,3.5f,4.95f,4.45f,5.0f};
        float customer3Feedback[] = {4.95f,2.75f,4.55f,4.25f,4.24f};
        float averageFeedback[] = new float[10];//Average feedbacks
        char grade[] = new char[10];            //grades
        System.out.println("Average feedback and Grades for employees :");
        System.out.println("\nEmployeeID\tAverageFeedback\tGrade\n");
        for (int i=0;i<employeeId.length;i++)
        {
            float totalFeedback = customer1Feedback[i]+customer2Feedback[i]+customer3Feedback[i];//total feedback
            averageFeedback[i] = totalFeedback/3;
            if (averageFeedback[i]>=4.5)
                grade[i]='A';
            else if (averageFeedback[i]>=4)
                grade[i]='B';
            else if (averageFeedback[i]>=3.25)
                grade[i]='C';
            else if (averageFeedback[i]>=2.5)
                grade[i]='D';
            else
                grade[i]='E';
            System.out.println(employeeId[i]+"\t"+averageFeedback[i]+"\t"+grade[i]);
        }

    }
}
