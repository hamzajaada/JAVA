package DS.Threads;

import java.util.concurrent.Callable;

public class thread1 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int s =0;
        for(int x =1 ; x<=500000;x++){
            s=s+x;
        }
      return s;
    }
    
}
