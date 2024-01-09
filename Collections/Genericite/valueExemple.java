package Collections.Genericite;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class valueExemple {
    public static void main(String[] args) {
        // Créer une instance de HashMap
        Map<String, Integer> map = new HashMap<>();

        // Ajouter des paires clé-valeur à la map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Utiliser values() pour obtenir la collection de valeurs
        Collection<Integer> values = map.values();

        // Parcourir les valeurs
        for (Integer value : values) {
            System.out.println("Value: " + value);
        }
    }
}

