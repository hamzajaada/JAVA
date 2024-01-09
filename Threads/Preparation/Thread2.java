package Threads.Preparation;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        for(char i = 'A';i<'K';i++){
            
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            };
        }
    }


    
}