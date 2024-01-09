package Collections.TPCollection.EX4;

import java.util.ArrayList;
import java.util.Collections;


import Collections.TPCollection.EX3.Eleve;

public class GroupeEleve {
    private ArrayList<Eleve>ListeEleve= new ArrayList<Eleve>();
    
    public int nombre(){
        return this.ListeEleve.size();
    }
    public ArrayList<Eleve> getListe(){
        return this.ListeEleve;
    }
    public void ajoutEleve(Eleve e){
        this.ListeEleve.add(e);
    }
    public Eleve cherEleve(String nom){
        for(Eleve el : ListeEleve){
            if( el.GetNom().equals(nom)){
                return el;
            }
        }
        return null;
    }
    public void lister(){
       for(Eleve e : ListeEleve){
           System.out.println(e.toString()); 
       }
    } 
     public Eleve meilleurEleve() {
        if (ListeEleve.isEmpty()) {
            return null; // Retourner null si la liste est vide
        }
        return Collections.max(ListeEleve); // Utilisation de Collections.max avec la comparaison des moyennes par la methode comparto(<T> o)
    }

    public void trierEleves() {
        Collections.sort(ListeEleve); // Utilisation de Collections.sort avec la comparaison des moyennes par la methode comparto(<T> o)
    }
}
  

