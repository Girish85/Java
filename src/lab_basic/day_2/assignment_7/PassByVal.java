package lab_basic.day_2.assignment_7;

public class PassByVal {
    public static void main(String[] args) {
        int sId = 25;
        PassByVal val = new PassByVal();
        System.out.println(sId);
        val.passTheValueMethod(sId);
        System.out.println("sId after passing :"+sId);
        Student student = new Student(30);
        System.out.println("studentId of Student :"+student.studentId);
        val.passTheRefMethod(student);
        System.out.println("studentId of Student after passing :"+student.studentId);
    }
    public void passTheValueMethod(int sId)
    {
        sId = 10;
        System.out.println("sId inside method :"+sId);
    }
    public void passTheRefMethod(Student student)
    {
        student.studentId = 10;
        System.out.println("studentId inside method :"+student.studentId);
    }
}
// studentId changes because student object is passed by reference