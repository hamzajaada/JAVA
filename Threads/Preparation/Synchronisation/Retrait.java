package Threads.Preparation.Synchronisation;

public class Retrait extends Thread {
    Compte c ;
    public Retrait(Compte c){
        this.c =c;
    }
    public void run(){
        int i =0;
        while(i<4){
            c.retirer(1500);
            i++;
        }
    }
}
