package lab_basic.day_3.assignment_3;

public class JaggedClass {
    public static void main(String[] args) {
        String studentCourses[][] = {{"Tony","JAVA","c","c++"},{"Thomas","JAVA","UNIX"},{"Dinil","Linux","ORACLE"},{"Delvin","RDBMS","C#","ORACLE"}};
        System.out.println("Displaying details of Delvin : \n");
        for (int i=0;i<studentCourses[3].length;i++)
        {
            System.out.println(studentCourses[3][i]);
        }
    }
}
