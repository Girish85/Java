package lab_basic.day_4.assignment_2;

public class Starter {
    public static void main(String[] args) {
        Hostelite hostelite = new Hostelite(101,'L',"Girish","Nagella",4947.95,"UMKC Dorms",401);
        System.out.println("Here are the details of student : \n");
        System.out.println("StudentId\tStudentType\tStudentName\tFeesperMonth\tHostelName\tRoomNumber");
        System.out.println(hostelite.getStudentId()+"\t\t\t"+hostelite.getStudentType()+"\t\t\t"+hostelite.getStudentName()+
                "\t"+hostelite.getFeesPerMonth()+"\t\t"+hostelite.getHostelName()+"\t"+hostelite.getRoomNumber());
    }
}
