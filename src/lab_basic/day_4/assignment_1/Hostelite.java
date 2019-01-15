package lab_basic.day_4.assignment_1;

public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;
    Hostelite()
    {
        super();
    }
    Hostelite(int studentId,char studentType,String fName,String lName,double feesPerMonth,String hostelName,int roomNumber)
    {
        super(studentId,studentType,fName,lName);
        setFeesPerMonth(feesPerMonth);
        setHostelName(hostelName);
        setRoomNumber(roomNumber);
    }
    public void setHostelName(String hostelName)
    {
        this.hostelName = hostelName;
    }
    public void setRoomNumber(int roomNumber)
    {
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
