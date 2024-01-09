package DS.Threads;

public class Coureur implements Runnable{
     private String nom;
     int parcourra;
     public Coureur(String n ,int p){
        this.nom =n;
        this.parcourra =p;
     }
    @Override
    public void run() {
         this.parcourra =this.parcourra+200;
         System.out.println("la parcourra est ="+this.parcourra);
    }
    
}
