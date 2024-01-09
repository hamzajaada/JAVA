package EntreSortie.preparationDS.serialisation;

import java.io.Serializable;

class Personne implements Serializable {
    private static final long serialVersionUID = 1L; // serialVersionUID pour la gestion de version
    private String nom;
    private  String motDePasse; // Utilisation du mot clé transient pour exclure le mot de passe de la sérialisation

    // Constructeur de la classe Personne
    public Personne(String nom, String motDePasse) {
        this.nom = nom;
        this.motDePasse = motDePasse;
    }

    // Méthode pour obtenir le nom de la personne
    public String getNom() {
        return nom;
    }

    // Méthode pour obtenir le mot de passe de la personne
    public String getMotDePasse() {
        return motDePasse;
    }

    // Méthode toString pour afficher la représentation de la personne sous forme de chaîne
    @Override
    public String toString() {
        return "Personne{nom='" + nom + "', motDePasse='" + motDePasse + "'}";
    }
}

