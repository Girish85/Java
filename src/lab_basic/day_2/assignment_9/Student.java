package lab_basic.day_2.assignment_9;

public class Student {
    private static int studentId = 550;
    private char studentType;
    private String studentName;
    Student()
    {
        studentId++;
    }
    Student(char sType,String fname,String lname)
    {
        this(); //Required to update studentId for every object created
        studentType = sType;
        studentName = fname+lname;
    }
    public void displayDetails(Student student)
    {
        System.out.println("Student ID :"+student.studentId+"  Student Name :"+student.studentName+"  Student Type"+student.studentType);
    }

    public static void main(String[] args) {
        Student studentOne = new Student('D',"Bony","Thomas");
        studentOne.displayDetails(studentOne);
        Student studentTwo = new Student('H',"Dinil","Bose");
        studentTwo.displayDetails(studentTwo);
    }
}
