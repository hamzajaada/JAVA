package Collections.Genericite;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EnrtySet {
    public static void main(String[] args) {
        // Créer une instance de HashMap
        Map<String, Integer> map = new HashMap<>();

        // Ajouter des paires clé-valeur à la map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Obtenir l'ensemble d'objets Map.Entry
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // Obtenir un objet Iterator à partir de l'ensemble
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        // Parcourir l'ensemble d'objets Map.Entry avec Iterator
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
