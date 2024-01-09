package Collections.TPCollection.EX2;

import java.util.ArrayList;

import Collections.TPCollection.EX1.*;
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
}
