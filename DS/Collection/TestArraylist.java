package DS.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestArraylist {
    public static void main(String[] args) {
           ArrayList <String> liste1 = new ArrayList<String>();
          liste1.add("ENSA TANGER");
          liste1.add("Ensa essaouira");
          //ajouter un element dans une position precise :
          liste1.add(1, "ensa marrkech");
           System.out.println(liste1);
           //recuperer un element difiniee par une position 
           System.out.println(liste1.get(1));
           //modifier un element difinier par une position :
           //liste1.set(1, "Ensa talmest");
            //System.out.println(liste1);
            //supprimer un element difinie par l'indice :
            //liste1.remove(1);
            //System.out.println(liste1);
            //supprimer un element difinie par l'objet :
            liste1.remove("Ensa essaouira");
             System.out.println(liste1);
             System.out.println(liste1.contains("ENSA TANGER"));
            //trie les element de la liste :
            Collections.sort(liste1);
            System.out.println(liste1);
            //changer l'ordre aleatoire :
            //    Collections.shuffle(liste1);
            //    System.out.println(liste1);
               Collections.reverse(liste1);
                System.out.println(liste1);
                

            }
 

}
