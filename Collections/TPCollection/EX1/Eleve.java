package Collections.TPCollection.EX1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Eleve {
    String name;
    ArrayList<Integer>List= new ArrayList<Integer>();
    Double moyenne= 0.0;
    public Eleve(){
        
    }
    public Eleve(String n){
        this.name =n;
        this.moyenne = 0.0;
        this.List = new ArrayList<Integer>();
    }
    
    public void ajouterNote(int note){
        this.List.add(note);
    }
    public ArrayList<Integer>getListeNote(){
        return this.List;
    }
    public void calculerMoyenne(){
        if(List.isEmpty()){
            this.moyenne =0.0;
        }
        else{
            int Somme =0 ;
            for(int note :List){
                Somme +=note;
            }
            this.moyenne = (double)Somme/List.size();
        }

     }
    public String GetNom(){
        return this.name;
    }
    public double getMoyenne(){
        return this.moyenne;
    }

    @Override
    public String toString() {
        return "Eleve [name=" + this.name + ", List=" + this.List + ", moyenne=" + this.moyenne + "]";
    }
    
}
