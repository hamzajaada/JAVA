package TP_Collection.EX1;

import java.util.ArrayList;
import java.util.Collections;

public class GroupeEleves  {
    private ArrayList<Eleve> ListEleves = new ArrayList<>();

    public int nombre(){
        int nmbr = ListEleves.size();
        return nmbr;
    }
    public ArrayList<Eleve> getListe(){
        return new ArrayList<>(ListEleves);
    }
    public void ajouterEleve(Eleve eleve){
        ListEleves.add(eleve);
    }
    public Eleve chercher(String nom) {
        for (Eleve eleve : ListEleves) {
            if (eleve.getNom().equals(nom)) {
                return eleve;
            }
        }
        return null;
    }
    //EX4 :
    public void lister() {
        for (Eleve eleve : ListEleves) {
            System.out.println(eleve);
        }
    }
    public Eleve meilleurEleve() {
        if (ListEleves.isEmpty()) {
            return null; // Retourner null si la liste est vide
        }
        return Collections.max(ListEleves); // Utilisation de Collections.max avec la comparaison des moyennes
    }

    public void trierEleves() {
        Collections.sort(ListEleves); // Utilisation de Collections.sort avec la comparaison des moyennes
    }


}
