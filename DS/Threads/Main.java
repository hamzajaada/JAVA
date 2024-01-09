package DS.Threads;

public class Main {
    public static void main(String[] args) {
        Coureur a = new Coureur("hamza", 200);
        Coureur b = new Coureur("ayoub", 200);
        Coureur c = new Coureur("khalid", 200);
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);
        System.out.println("t1");
        t1.start();
        System.out.println("t2");
        t2.start();
        System.out.println("t3");
        t3.start();
    }
}
