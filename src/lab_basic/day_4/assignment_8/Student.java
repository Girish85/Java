package lab_basic.day_4.assignment_8;

public abstract class Student {
    protected int studentId;
    protected String studentName;
    protected char studentType;
    protected double feesPerMonth;
    Student(){}//Default Constructor
    Student(int studentId,char studentType,String fName,String lName)
    {
        setStudentId(studentId);
        setStudentType(studentType);
        setStudentName(fName,lName);
    }
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentName(String firstName,String lastName)
    {
        studentName = firstName+lastName;
    }
    public String getStudentName()
    {
        return studentName;
    }
    public void setStudentType(char studentType)
    {
        this.studentType = studentType;
    }
    public char getStudentType()
    {
        return studentType;
    }
    public void setFeesPerMonth(double semesterFees)
    {
        this.feesPerMonth = Math.round(1000*(semesterFees/6))/1000.0;
    }
    public String getFeesPerMonth()
    {
        Double fees = feesPerMonth;
        return fees.toString();
    }
    public void displayStudentDetails()
    {
        System.out.println("\n Student Details : \n");
        System.out.println("StudentId\tStudentType\tStudentName\tFeesperMonth");
        System.out.println(studentId+"\t\t"+studentType+"\t\t"+studentName+"\t"+feesPerMonth);
    }
    public abstract void calculateFees(double fees);
}
