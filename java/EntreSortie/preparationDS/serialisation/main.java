package EntreSortie.preparationDS.serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {
    public static void main(String[] args) {
        // Sérialisation
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personne.ser"))) {
            Personne personne = new Personne("Alice", "1212");
            oos.writeObject(personne);
            oos.flush(); // Forcer la vidange du tampon
            System.out.println("Personne sérialisée avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Désérialisation
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personne.ser"))) {
            Personne personneDeserialisee = (Personne) ois.readObject();
            System.out.println("Personne désérialisée : " + personneDeserialisee);
            System.out.println("Le mot de passe n'est pas disponible après la désérialisation : " + personneDeserialisee.getMotDePasse());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
