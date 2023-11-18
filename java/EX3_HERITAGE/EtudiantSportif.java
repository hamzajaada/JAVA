package EX3_HERITAGE;

public class EtudiantSportif extends Etudiant {
    String sportPratique ;
    public EtudiantSportif(String n, String p, int a , String SP){
        super(n, p, a);
        this.sportPratique=SP;
    }
    public void affiche(){
        super.affiche(); 
        System.out.println(" Sport pratique :" +sportPratique);
       
    }
    
}
