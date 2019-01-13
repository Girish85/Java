package lab_basic.day_2.assignment_6;

public class UserType {
    String userName;
    UserType()
    {
        this("Admin");
    }
    UserType(String name)
    {
        userName = name;
    }

    public static void main(String[] args) {
        UserType userType = new UserType();
        UserType userType1 = new UserType("Faculty");
        System.out.println(userType.userName);
        System.out.println(userType1.userName);
    }
}

