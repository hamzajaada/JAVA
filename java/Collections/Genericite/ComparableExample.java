package Collections.Genericite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


    public class ComparableExample { 
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 22));

        // Tri de la liste de personnes basé sur l'âge
        Collections.sort(people);

        // Affichage de la liste triée
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

