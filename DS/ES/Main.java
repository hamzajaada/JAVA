package DS.ES;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Etudiant e = new Etudiant("hamza", "jaada", 18);
        Etudiant r = new Etudiant("ayoub", "bahti", 18);
        Salle sl  = new Salle();
        sl.AjouteEtudiant(e);
        sl.AjouteEtudiant(r);
        sl.affichage();
        System.out.println("////DESERIALISATION");
        SerialSalle se = new SerialSalle();
        se.saveSalleToSerialFile("test", sl);
        Salle salleRecuperee =SerialSalle.getSalleFromSerialFile("test");
        salleRecuperee.affichage();
    }
}
