package Collections.Genericite;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
public class TrieColSorte {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<Integer>();
        List.add(24);
          List.add(10);
            List.add(52);
              List.add(2);
              Collections.sort(List);
              Iterator<Integer> it = List.iterator();
              while(it.hasNext())System.out.println(it.next());
              

    }
}
