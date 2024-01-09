package Collections.PreparationDS;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class KeySet {
    public static void main(String[] args) {
        Map<String,Integer> List = new HashMap<String,Integer>();
        List.put("hamza",18);
         List.put("ayoub",17);
          List.put("ayoub",15);
          List.put("khalid",16);
          //keySet
          Set<String>setString=List.keySet();
          Iterator<String> it = setString.iterator();
          System.out.println("parrcourir la map avec keyset");
          while (it.hasNext()) {
            String key = it.next();
            System.out.println("la note pour l'eleve "+key+ "="+List.get(key));
          }
          //EntrySet :
          System.out.println("EntrySet :");
          Set<Entry<String,Integer>> setEntry = List.entrySet();
          Iterator<Entry<String,Integer>> t = setEntry.iterator();
           while (t.hasNext()) {
            Entry<String,Integer> entry = t.next();
            System.out.println("la note pour l'eleve "+entry.getKey()+ "="+entry.getValue());
          }
          //values :
          System.out.println("values :");
          Collection <Integer> col = List.values();
          Iterator<Integer> colinteger = col.iterator();
          while (colinteger.hasNext()) {
           int value = colinteger.next();
           System.out.println("la note est "+value);
          }

    }
    
}
