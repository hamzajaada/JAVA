package DS.Collection.GestionDeParticipant;

import java.util.ArrayList;
import java.util.Collections;

public class GroupeParticipants {
    ArrayList<Participant> ListeDeParticipant = new ArrayList<>();
    public int nombre(){
        return ListeDeParticipant.size();
    }
    public ArrayList<Participant> getList(){
        return this.ListeDeParticipant;
    }
    public void ajouterParticipant(Participant p){
        ListeDeParticipant.add(p);
    }
    public void chercher(String nom){
            for(Participant p : ListeDeParticipant){
                if(p.getName() == nom){
                    System.out.println(p); 
                }
            }
    }
    public void lister(){
       for(Participant p : ListeDeParticipant){
            System.out.println(p);
       }
    }
    public Participant mielleurParticipant(){
        return Collections.max(ListeDeParticipant);
    }
    public void trierPaticipants(){
        Collections.sort(ListeDeParticipant,Collections.reverseOrder());
    }


}
