package EXCEPTION.TpException.EX2;

public class ErrSom  extends Exception{
    private int s ;
    public ErrSom(int S){
        this.s = S;
        System.out.println("la somme de deux nombre est negetif");
    }
}
