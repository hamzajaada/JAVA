package Threads.Preparation.Synchronisation;

public class TEST {
    public static void main(String[] args) {
        Compte c = new Compte(1000);
        Depot D = new Depot(c);
        Retrait R = new Retrait(c); 
        D.start();
        R.start();
       
        }
}
