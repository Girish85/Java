package lab_basic.day_4.assignment_2;

public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;
    Hostelite()
    {
        super();
    }
    Hostelite(int studentId,char studentType,String fName,String lName,double feesPerMonth,String hostelName,int roomNumber)
    {
        //super(studentId,studentType,fName,lName);     Not needed as we can directly access protected members from derived class
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = fName+lName;
        this.feesPerMonth = Math.round(1000*(feesPerMonth/6))/1000.0;
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }
    public String getHostelName()
    {
        return hostelName;
    }
    public int getRoomNumber()
    {
        return roomNumber;
    }

}
