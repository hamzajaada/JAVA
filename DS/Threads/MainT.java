package DS.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MainT {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Utilisez votre propre interface Callable
        Callable<Integer> mycl = new thread1();
        //FutureTask<Integer> ft = new FutureTask<>(mycl);
        // Thread th = new Thread(ft);
        // th.start();
        // int res = ft.get();
        // System.out.println(res);
         Callable<Integer> mycl2 = new thread1();
        // FutureTask<Integer> ft2 = new FutureTask<>(mycl2);
        // Thread th2 = new Thread(ft2);
        // th2.start();
        // int res2 = ft2.get();
        // System.out.println(res2);
        // int s = res +res2;
        // System.out.println(s);
        ExecutorService exe = Executors.newFixedThreadPool(2);
        Future<Integer> e1 = exe.submit(mycl2);
        Future<Integer>  e2= exe.submit(mycl);
        int res1 = e1.get();
        int res2 = e2.get();
        int s = res1+res2;
        System.out.println(s);
        exe.shutdown();
    }
}
