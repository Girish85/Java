package advanced.five;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Debug {

    public void showRecords(Set<String> set)
    {
        if (set.isEmpty())
            System.out.println("Empty Set");
        else
        {
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
        }
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Girish");
        set.add("Rajesh");
        set.add("Mortal");
        Debug debug = new Debug();
        System.out.println("Printing the records__ _ _");
        debug.showRecords(set);
    }

}
