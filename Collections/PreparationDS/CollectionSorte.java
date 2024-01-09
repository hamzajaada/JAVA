package Collections.PreparationDS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSorte {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<Integer>();
        List.add(19);
        List.add(14);
        List.add(15);
        List.add(17);
        Collections.sort(List);
        Iterator<Integer> it = List.iterator();
            while (it.hasNext()) {
            System.out.println(it.next());
          }
    }
     
}
