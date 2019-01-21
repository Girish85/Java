package labs_advanced.day_4.assignment_33;

public class TestStringMock {
    public static void main(String[] args) {
        String msg = "Hey Siri Open YouTube";
        StringMock stringMock = new StringMock();
        int result = stringMock.search(msg,'S');
        String presence = (result>=0)?"Exists in the msg":"Doesn't Exist";
        System.out.println("Item "+presence);
        int result1 = stringMock.search(msg,'A');
        String presence1 = (result1>=0)?"Exists in the msg":"Doesn't Exist";
        System.out.println("Item "+presence1);
    }
}
