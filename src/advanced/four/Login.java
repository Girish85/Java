package advanced.four;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<Integer,String> map = new HashMap<>();
    public void addLogin(int customerId,String password)
    {
        map.put(customerId,password);
    }
}
