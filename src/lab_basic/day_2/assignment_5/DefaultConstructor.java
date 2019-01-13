package lab_basic.day_2.assignment_5;

public class DefaultConstructor {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student id is : "+student.getStudentId());
        if (student.getStudentType()=='F')
            System.out.println("Student is Fresher");
        else if (student.getStudentType()=='L')
            System.out.println("Student is Lateral");
        else System.out.println("Invalid type selected");
    }
}
