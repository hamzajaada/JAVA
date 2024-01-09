package Threads.Preparation.FutureTask;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>, Callable<Integer> {
    @Override
    public String call() throws Exception {
        // Code de la tâche
        return "Résultat de la tâche";
    }
}

// FutureTask(Callable<V> callable) : Le constructeur qui prend une instance de Callable en paramètre pour créer une nouvelle tâche asynchrone.

// cancel(boolean mayInterruptIfRunning) : Permet d'annuler la tâche en cours d'exécution. Si mayInterruptIfRunning est true, cela peut tenter d'interrompre l'exécution de la tâche.

// isCancelled() : Renvoie true si la tâche a été annulée avant son achèvement.

// isDone() : Renvoie true si la tâche a été complètement terminée, qu'elle a réussi, échoué ou a été annulée.

// run() : La méthode run de l'interface Runnable, qui est appelée lorsque la tâche est exécutée par un thread.

// set(V value) : Définit la valeur résultante de la tâche et marque la tâche comme terminée normalement.

// get() : Attend que la tâche soit terminée et renvoie le résultat. Cette méthode bloque jusqu'à ce que la tâche soit terminée.

// get(long timeout, TimeUnit unit) : Attend que la tâche soit terminée pendant une période spécifiée et renvoie le résultat. Si la période d'attente est dépassée, une TimeoutException est levée.