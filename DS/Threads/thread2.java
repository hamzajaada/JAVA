package DS.Threads;

import java.util.concurrent.Callable;

public class thread2 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int s =0;
        for(int x =500001 ; x<=1000000;x++){
            s=s+x;
        }
      return s;
    }
    
}
