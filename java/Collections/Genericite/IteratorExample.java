package Collections.Genericite;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Créer une liste
        ArrayList<String> liste = new ArrayList<>();
        liste.add("1");
        liste.add("2");
        liste.add("3");

        // Obtenir un itérateur pour la liste
        Iterator<String> iterator = liste.iterator();

        // Utiliser l'itérateur pour parcourir la liste
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("1")) {
                iterator.remove();
            }
            else{
                System.out.println(element);
            }
          

        }
    }
}
