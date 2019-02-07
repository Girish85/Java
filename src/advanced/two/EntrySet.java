package advanced.two;

import java.util.HashSet;
import java.util.Set;

public class EntrySet {
    public void printSet(Set<String> stringSet)
    {
        if (stringSet.isEmpty())
        {
            System.out.println("Empty Set");
        }
        else System.out.println("Elements in set are : "+stringSet);
    }

    public static void main(String[] args) {
        EntrySet entrySet = new EntrySet();
        EntrySet entrySet1 = new EntrySet();
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("First");
        stringHashSet.add("Second");
        stringHashSet.add("Third");
        stringHashSet.add("Second");
        entrySet.printSet(stringHashSet);
        HashSet<String> stringHashSet1 = new HashSet<>();
        entrySet1.printSet(stringHashSet1);
    }
}
