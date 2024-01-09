package Threads.Preparation.SHARED_SUB_TOTAL;

public class Adder extends Thread {
    static int SHARED_SUB_TOTAL = 0;
    private int valueToAdd;
    public Adder(int v){
        this.valueToAdd=v;
    }
    @Override
    public 
     void run() {
        int previousTotal = SHARED_SUB_TOTAL;
        int newTotal;
        synchronized(Adder.class){
            try {
            sleep(2);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
         newTotal = previousTotal + valueToAdd;
        SHARED_SUB_TOTAL = newTotal;
        System.out.println(this.currentThread().getName()+" : "+SHARED_SUB_TOTAL);
        }
        
    }
}
