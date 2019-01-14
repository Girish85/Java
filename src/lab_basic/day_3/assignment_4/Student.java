package lab_basic.day_3.assignment_4;

public class Student {
    private int studentId;
    private char studentType;
    private String studentName;
    Student()//Default Constructor
    {
        studentId = 10;
        studentType = 'F';
    }
    Student(int studentId,char studentType,String firstName,String lastName)
    {
        this.studentId = studentId;
        this.studentType = studentType;
        setStudentName(firstName,lastName);
    }
    public void setStudentId(int id)
    {
        studentId = id;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentType(char type)
    {
        studentType = type;
    }
    public char getStudentType()
    {
        return studentType;
    }
    public void setStudentName(String firstName,String lastName)
    {
        studentName = firstName+lastName;
    }
    public String getStudentName()
    {
        return studentName;
    }
}
