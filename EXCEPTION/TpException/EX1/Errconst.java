package EXCEPTION.TpException.EX1;

public class Errconst extends Exception {
    int n;
    public Errconst(int n){
        this.n = n;
        System.out.println("le nombre que vous allez entre est negatif :"+this.n);
    }
    
}
