package TP_Collection.EX1;

public class Main1 {
    public static void main(String[] args) {
        GroupeEleves groupe = new GroupeEleves();

        // Ajouter des élèves au groupe
        groupe.ajouterEleve(new Eleve("Alice"));
        groupe.ajouterEleve(new Eleve("Bob"));

        // Chercher un élève par son nom
        Eleve eleveTrouve = groupe.chercher("Alice");
        eleveTrouve.ajouterNote(14);
        eleveTrouve.calculerMoyenne();
        Eleve eleveTrouve1 = groupe.chercher("Bob");
        eleveTrouve1.ajouterNote(16);
        eleveTrouve1.calculerMoyenne();
        // Afficher le nombre d'élèves
        System.out.println("Nombre d'élèves dans le groupe : " + groupe.nombre());

        // Afficher la liste des élèves
        System.out.println("Liste des élèves :");
        groupe.lister();
        groupe.trierEleves();

        System.out.println("\nListe d'élèves après le tri :");
        groupe.lister();
        //////////////aff
        Eleve meilleur = groupe.meilleurEleve();
        if (meilleur != null) {
            System.out.println("Meilleur élève : " + meilleur.getNom());
        } else {
            System.out.println("Aucun élève dans le groupe.");
        }
       
            }
}
