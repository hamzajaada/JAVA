package Threads;

public class Compte implements Runnable  {
     int valeur;

     Compte (int val){
        valeur = val;
     }
     public void run(){
        try{
            for( ; ; ){
                System.out.println(valeur + " ");
                Thread.sleep(100);
            }
        }  catch(InterruptedException e){
            return;
        }
     }
   
   public static void main(String[] args) {
    Runnable compte1 = new Compte(1);
    Runnable compte2 = new Compte(2000);
    new Thread(compte1).start();
    new Thread(compte2).start();

        // new Compte(1).start();
        // new Compte(2000).start();
        
    }









    // public static void main(String[] args) {
    //     Thread t = new Thread(){
    //         public void run(){
    //             System.out.println("un traitement");
    //         }
    //     };     
    //     t.start();
    
    // }
}
