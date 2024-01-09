package DS.Collection.GestionDeParticipant;

import java.util.ArrayList;

public class Participant implements Comparable<Participant> {
    private String name ;
    private ArrayList<Integer>ListeDeNotes;
    private double moyenne = 0;
    public Participant(String n){
        this.name =n;
        ListeDeNotes= new ArrayList<>();
    }
    public Participant() {
    }
    public void ajouterNote(int Note){
        ListeDeNotes.add(Note);
    }
    public double calculerMoyenne(){
          if (ListeDeNotes.isEmpty()) {
            return this.moyenne;
          }
          else{
            double s =0;
            for(int n : ListeDeNotes){
             s=s+n;
                }
            this.moyenne = (double)s/ListeDeNotes.size();

            return this.moyenne;
          }
       
    }
    @Override
    public String toString() {
        return "Participant [name=" + name + ", ListeDeNotes=" + ListeDeNotes + ", moyenne=" + moyenne + "]";
    }
    public String getName() {
        return name;
    }
    public ArrayList<Integer> getListeDeNotes() {
        return ListeDeNotes;
    }
    public double getMoyenne() {
        return moyenne;
    }
    @Override
    public int compareTo(Participant o) {
       if (this.moyenne>o.moyenne) {
            return 1;
       }
       else if(this.moyenne<o.moyenne){
        return -1;
       }
       else{
        return 0;
       }
    }

    
}
