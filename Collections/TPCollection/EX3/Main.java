package Collections.TPCollection.EX3;

import Collections.TPCollection.EX2.GroupeEleve;

public class Main {
    public static void main(String[] args) {
        Eleve E1 = new Eleve("hamza");
        E1.ajouterNote(13);
        E1.calculerMoyenne(); 
        System.out.println(E1.toString());
        Eleve E2 = new Eleve("khalid");
        E2.ajouterNote(14);
        E2.calculerMoyenne();
        Eleve E3 = new Eleve("ayoub");
        E3.ajouterNote(15);
        E3.calculerMoyenne();
        int resultat  = E1.compareTo(E3);
        if (resultat < 0) {
            System.out.println(E1.GetNom() + " est inférieur à " + E3.GetNom());
        } else if (resultat > 0) {
            System.out.println(E1.GetNom() + " est supérieur à " + E3.GetNom());
        } else {
            System.out.println(E1.GetNom() + " est égal à " + E3.GetNom());
        }
    }
}
