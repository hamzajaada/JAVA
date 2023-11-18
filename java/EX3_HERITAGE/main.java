package EX3_HERITAGE;

public class main {
    public static void main(String[] args) {
       Etudiant A = new Etudiant("hamza","jaada",20);
       A.affiche();
       EtudiantSportif B = new EtudiantSportif("abdilah","jaada",29,"footballe");
       B.affiche();
       System.out.println("::::::::::::::::::::::::::::::::");
       Etudiant e;
       e = new EtudiantSportif("hhh", "hhhh", 22, "hhhh");
       e.affiche();

    }
}
