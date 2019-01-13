package lab_basic.day_2.assignment_5;

public class Student {
    private int studentId;
    private char studentType;
    Student()//Default Constructor
    {
        studentId = 10;
        studentType = 'F';
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
}
