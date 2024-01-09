package EXCEPTION.TpException.EX2;

public class ErrProd  extends Exception{
    private int p ;
    public ErrProd(int P){
        this.p = P;
        System.out.println("la Produis de deux nombre est negetif");
    }
}
