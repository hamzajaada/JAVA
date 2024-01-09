package Threads.Preparation;

public class TestThread {
    public static void main(String[] args) {
        Thread t = new Thread(new Thread2());
        System.out.println(t.getName());
        t.start();
        // la thread T1 ne commnce que le treahd t est terminer sans travailler
        try {
            t.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Thread1 t1 = new Thread1("num");
        System.out.println(t1.getName()); 
         t1.start();
       
        
    }
}
