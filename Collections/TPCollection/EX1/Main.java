package Collections.TPCollection.EX1;

public class Main {
    public static void main(String[] args) {
        Eleve E1 = new Eleve("hamza");
        E1.ajouterNote(16);
        E1.ajouterNote(16);
        E1.ajouterNote(15);
        E1.calculerMoyenne(); 
        System.out.println(E1.toString());
       
       

    }
}
