package lab_basic.day_5.assignment_1.package_ex;

import lab_basic.day_5.assignment_1.courseregistration.Student;

public class PackageEx {
    public static void main(String[] args) {
        Student student = new Student();
        //student.studentId = 7;                shows compilation error because studentId has protected access
        student.setStudentId(7);
        student.setStudentType('D');
        student.setStudentName("JamesBond");
        student.getData();
    }
}
