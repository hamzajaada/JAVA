package EX3_HERITAGE;

public class Etudiant {
    String nom;
    String prenom;
    int age;
    public Etudiant(String n , String p , int a){
        this.nom = n;
        this.prenom = p;
        this.age = a;
    }
    public void affiche(){
        System.out.println("Nom :" +nom+ "  Prenom :"+prenom);
        System.out.println("Age :"+age);
    }
}
