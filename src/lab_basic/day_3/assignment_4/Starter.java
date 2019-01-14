package lab_basic.day_3.assignment_4;

public class Starter {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("Girish","Nagella");
        Student student1 = new Student(11,'L',"Ram","Krishna");
        System.out.println("Students : \n");
        System.out.println("StudentId\tStudentType\tStudentName");
        System.out.println(student.getStudentId()+"\t\t\t"+student.getStudentType()+"\t\t\t"+student.getStudentName());
        System.out.println(student1.getStudentId()+"\t\t\t"+student1.getStudentType()+"\t\t\t"+student1.getStudentName());
    }
}
