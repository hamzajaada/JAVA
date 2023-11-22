package Collections.Genericite;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        // Utilisez un nom différent pour éviter le conflit avec java.util.TreeSet
        Set<String> tree = new TreeSet<String>();
        tree.add("Nadia");
        tree.add("Hamza");
        tree.add("Khalid");
        tree.add("Ayoub");
        Iterator<String> it = tree.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
