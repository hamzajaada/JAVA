package TP_Collection.EX1;

import java.util.ArrayList;
import java.util.Iterator;

public class Eleve implements Comparable<Eleve> {
    private String name;
    private ArrayList<Integer> listeNotes;
    private double moyenne;
    public Eleve(String n){
        this.name= n;
        this.listeNotes = new ArrayList<>();
        this.moyenne = 0.0;
    }
    public Eleve(String string, double d) {
    }
    public void ajouterNote(int note){
               listeNotes.add(note);
    }
    public String getNom(){
        return this.name;
    }

    public ArrayList<Integer> getListeNotes(){
      return new ArrayList<>(listeNotes);
    }
    public double calculerMoyenne(){
        if(listeNotes.isEmpty()){
             moyenne = 0.0;
        }
        else{
            int SommeNote = 0;
            for( int note : listeNotes){
                SommeNote += note;
            }
            moyenne = (double) SommeNote/listeNotes.size();
        }
        return moyenne;
       
    }
    public double getMoyenne(){
        
        return moyenne;

    }
    public String toString(){
        return "Eleve{" +
                "nom='" + name + '\'' +
                ", listeNotes=" + listeNotes +
                ", moyenne=" + this.getMoyenne()+
                '}';
    }
    @Override
    public int compareTo(Eleve autreEleve) {
          // Comparaison des moyennes
          if (this.moyenne < autreEleve.moyenne) {
            return -1; // L'objet actuel est plus petit que l'objet comparé
        } else if (this.moyenne > autreEleve.moyenne) {
            return 1; // L'objet actuel est plus grand que l'objet comparé
        } else {
            return 0; // Les moyennes sont égales
        }
    }
}
