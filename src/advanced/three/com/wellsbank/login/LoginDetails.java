package advanced.three.com.wellsbank.login;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoginDetails {
    public void addSameKey(Map<Integer,String> map)
    {
        if (map.containsKey(1003))
        {
            System.out.println("Key is already present and being replaced");
        }
        map.put(1003,"John");
    }

    public void printLoginDetails(Map<Integer,String> map)
    {
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        LoginDetails loginDetails = new LoginDetails();
        Map<Integer,String> map = new HashMap<>();
        map.put(1001,"Gary");
        map.put(1002,"Vicky");
        map.put(1003,"Jamie");
        map.put(1004,"Jessie");
        System.out.println("Map before adding same key 1003 : "+map);
        loginDetails.addSameKey(map);
        System.out.println("Value for 1003 after adding same key 1003 : "+map.get(1003));
        System.out.println("Map after adding same key : ");
        loginDetails.printLoginDetails(map);
        System.out.println(map);
    }
}
