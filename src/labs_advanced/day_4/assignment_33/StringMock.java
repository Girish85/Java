package labs_advanced.day_4.assignment_33;

public class StringMock {
    String capacity;
    public StringMock()
    {

    }
    public StringMock(String capacity)
    {
        this.capacity = capacity;
    }

    @Deprecated
    public static int search(String string,char searchitem)
    {
        int index;
        char searcharray[] = string.toCharArray();
        for (index = 0; index < searcharray.length; index++) {
            if (searcharray[index]==searchitem)
            {
                return index;
            }
        }
        return -1;
    }
}
