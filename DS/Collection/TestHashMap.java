package DS.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap <String ,Integer> etudiant = new HashMap<>();
        etudiant.put("hamza", 18);
         etudiant.put("ayoub", 19);
          etudiant.put("salah", 20);
        //   Set <String> s = etudiant.keySet();
        //   Iterator <String> it = s.iterator();
        //   while (it.hasNext()) {
        //       String key = it.next();
        //       System.out.println("<"+key+","+etudiant.get(key)+">");
        //   }
        Set<Entry<String,Integer>> setEntry = etudiant.entrySet();
        Iterator<Entry<String,Integer>> it = setEntry.iterator();
          while (it.hasNext()) {
              Entry<String,Integer> en = it.next();
              System.out.println("<"+en.getKey()+","+en.getValue()+">");
          }
    }
}
