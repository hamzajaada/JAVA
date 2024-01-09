package Collections.PreparationDS;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class TreeSt {
    public static void main(String[] args) {
        Set<Integer> tree = new TreeSet<Integer>();
        tree.add(19);
        tree.add(14);
        tree.add(15);
        tree.add(17);
        Iterator<Integer> it = tree.iterator();
            while (it.hasNext()) {
            System.out.println(it.next());
          }
    }
}
