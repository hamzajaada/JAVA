package Threads.Preparation.SHARED_SUB_TOTAL;

public class AdderTest {
    public static void main(String[] args) throws InterruptedException {
        Adder t1 = new Adder(10);
        Adder t2 = new Adder(4);
        System.out.println("Avant : "+Adder.SHARED_SUB_TOTAL);
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println("Apres : "+Adder.SHARED_SUB_TOTAL);
    }
}
