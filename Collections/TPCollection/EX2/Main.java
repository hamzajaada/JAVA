package Collections.TPCollection.EX2;
import Collections.TPCollection.EX1.*;

public class Main {
    public static void main(String[] args) {
        Eleve E1 = new Eleve("hamza");
        E1.ajouterNote(13);
        E1.calculerMoyenne();
        Eleve E2 = new Eleve("khalid");
        E2.ajouterNote(14);
        E2.calculerMoyenne();
        Eleve E3 = new Eleve("ayoub");
        E3.ajouterNote(15);
        E3.calculerMoyenne();
        GroupeEleve e = new GroupeEleve();
        e.ajoutEleve(E1);
        e.ajoutEleve(E2);
        e.ajoutEleve(E3);
        e.lister();

    }
}
