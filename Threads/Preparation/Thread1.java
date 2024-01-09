package Threads.Preparation;

public class Thread1 extends Thread {
    public Thread1(String nom){
        super(nom);
    }
    public void run(){
        for(int i =0 ;i<10;i++){
            System.out.println(i); 
            //execute un ligne est donner la main al'autre thread :
           // Thread.yield();
            // try {
            //     Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // };
        }
    }
}
