package Threads.Preparation.Synchronisation;

public class Depot extends Thread {
    Compte c ;
    public Depot(Compte c){
        this.c =c;
    }
    public void run(){
        int i =0;
        while(i<6){
            c.verser(1000);
            i++;
        }
        
    }
}
