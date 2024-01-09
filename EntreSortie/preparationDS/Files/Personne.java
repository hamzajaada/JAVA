package EntreSortie.preparationDS.Files;

import java.io.Serializable;

public class Personne implements Serializable{
    int code ;
    String nom;
    public Personne(int code, String nom) {
        this.code = code;
        this.nom = nom;
    }
    public int getCode() {
        return code;
    }
    public String getNom() {
        return nom;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    

}
