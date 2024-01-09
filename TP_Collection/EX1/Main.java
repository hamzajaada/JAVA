package TP_Collection.EX1;

public class Main {
    public static void main(String[] args) {
    //     // Créer un élève avec le nom "Alice"
        Eleve eleve1 = new Eleve("Alice");

            // Ajouter des notes à l'élève
            eleve1.ajouterNote(80);
            eleve1.ajouterNote(90);
            eleve1.ajouterNote(75);
            eleve1.calculerMoyenne();

            // Afficher les informations de l'élève
            String Affichage = eleve1.toString();
            System.out.println(Affichage);

//     //     // Créer un autre élève avec le nom "Bob"
            Eleve eleve2 = new Eleve("Bob");
   
            // Ajouter des notes à l'autre élève
            eleve2.ajouterNote(65);
            eleve2.ajouterNote(70);
            eleve2.ajouterNote(85);
            eleve2.calculerMoyenne();
        // Afficher les informations de l'autre élève
            String Affichage2 = eleve2.toString();
            System.out.println(Affichage2);
    
          

            // Comparaison des élèves
            int resultatComparaison = eleve1.compareTo(eleve2);

            // Affichage du résultat
            if (resultatComparaison < 0) {
                System.out.println(eleve1.getNom() + " est inférieur à " + eleve2.getNom());
            } else if (resultatComparaison > 0) {
                System.out.println(eleve1.getNom() + " est supérieur à " + eleve2.getNom());
            } else {
                System.out.println(eleve1.getNom() + " est égal à " + eleve2.getNom());
            }
}

   
}
