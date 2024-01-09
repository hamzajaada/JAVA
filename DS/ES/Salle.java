package DS.ES;

import java.io.Serializable;
import java.util.ArrayList;

public class Salle implements Serializable {
    ArrayList<Etudiant> ListdeEtudiant = new ArrayList<>();
    public void AjouteEtudiant(Etudiant e){
        ListdeEtudiant.add(e);
    }
    public void affichage(){
        for(Etudiant e : ListdeEtudiant){
           System.out.println( e.toString());
        }
    }
}
