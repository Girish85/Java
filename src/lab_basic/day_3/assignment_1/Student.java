package lab_basic.day_3.assignment_1;

public class Student {
    private static int studentId = 550;
    private char studentType;
    private String studentName;
    private static int studentCount = 10;       //static variable to get number of students
    Student()
    {
        studentCount++;
        studentId++;
    }
    Student(char sType, String fname, String lname)
    {
        this(); //Required to update studentId for every object created
        studentType = sType;
        studentName = fname+lname;
    }
    public void displayDetails(Student student)
    {
        System.out.println("Student ID :"+student.studentId+"  Student Name :"+student.studentName+"  Student Type"+student.studentType);
    }
    public static int getStudentCount()             //Static method
    {
        return studentCount;
    }

    public static void main(String[] args) {
        Student studentOne = new Student('D',"Bony","Thomas");
        studentOne.displayDetails(studentOne);
        System.out.println("Number of students : "+getStudentCount());
        Student studentTwo = new Student('H',"Dinil","Bose");
        studentTwo.displayDetails(studentTwo);
        System.out.println("Number of students : "+getStudentCount());
    }
}
