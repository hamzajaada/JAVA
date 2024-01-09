package DS.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet <String> tr = new TreeSet<>();
        tr.add("zz");
        tr.add("aa");
        tr.add("jj");
        System.out.println(tr.first());
        System.out.println(tr.headSet("jj"));
        System.out.println(tr.tailSet("jj"));
        // Iterator it = tr.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
    }
}
