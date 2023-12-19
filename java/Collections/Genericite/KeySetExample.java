package Collections.Genericite;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class KeySetExample {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<String ,Integer>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        System.out.println("parcourir le map avec keyset");
        for (String key : keySet) {
            System.out.println("Key: " + key+ " , Value "+map.get(key));
        }
        System.out.println("--------------");
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key+"="+map.get(key));
            
        }

    }
    
    
}
