package Threads;
public class somme implements Runnable {
    private int val1;
    private int val2;
    private int somme = 0;

    somme(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public void run() {
        try {
            for (int i = val1; i <= val2; i++) {
                somme += i;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getSomme() {
        return somme;
    }

    public static void main(String[] args) {
        somme somme1 = new somme(1, 10);
        somme somme2 = new somme(11, 20);

        Thread thread1 = new Thread(somme1);
        Thread thread2 = new Thread(somme2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int resultatFinal = somme1.getSomme() + somme2.getSomme();
        System.out.println("La somme totale est : " + resultatFinal);
    }
}



















































// public class somme extends Thread  {
//     int val1;
//     int val2;
//     int somme=0;
//     somme(int val1, int val2){
//         this.val1 = val1;
//         this.val2= val2;
//     }
//     public  void run(){
//         try{
//             for(int i = val1; i<val2; i++){
//             somme += i;
//             sleep(100);
//           }
//         } catch( InterruptedException e){
//             return;

//         }
      
//     }
    
// }
