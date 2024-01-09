package DS.ES;

import java.io.Serializable;

public class Etudiant implements Serializable {
    private String name ;
    private String prenom;
    private int age;
    
    public Etudiant(String name, String prenom, int age) {
        this.name = name;
        this.prenom = prenom;
        this.age = age;
    }
    public Etudiant() {
    }
    public String getName() {
        return name;
    }
    public String getPrenom() {
        return prenom;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Etudiant [name=" + name + ", prenom=" + prenom + ", age=" + age + "]";
    }
    
}
