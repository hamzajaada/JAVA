package Threads.Preparation.Synchronisation;

public class Compte {
    float solde ;
    public Compte(float s){
        this.solde = s;
    }
    public synchronized void retirer(float somme){
        if (somme>solde) {
            System.out.println("Solde insufisant");
            try {
                wait(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        solde = solde - somme ;
        System.out.println("solde apres le Retrait :"+this.solde);
    }
    public synchronized void verser(float somme){
        solde = solde + somme;
        try {
                wait(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        System.out.println("solde apres le versage :"+this.solde);

    }
}
