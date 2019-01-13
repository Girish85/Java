package lab_basic.day_2.assignment_4;

public class CourseManagement {
    public static void main(String[] args) {
        int id = 101;
        char type = 'F';
        Student student = new Student();
        student.setStudentId(id);
        student.setStudentType(type);
        System.out.println("Student id is : "+student.getStudentId());
        if (student.getStudentType()=='F')
        System.out.println("Student is Fresher");
        else if (student.getStudentType()=='L')
        System.out.println("Student is Lateral");
        else System.out.println("Invalid type selected");
    }
}
