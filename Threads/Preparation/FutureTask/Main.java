package Threads.Preparation.FutureTask;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws Exception {
        Callable<String> myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(myCallable);

        // Créer un thread pour exécuter la tâche
        Thread thread = new Thread(futureTask);
        thread.start();

        // Attendre et récupérer le résultat
        String result = futureTask.get();
        System.out.println(result);
    }
}

