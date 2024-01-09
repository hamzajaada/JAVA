package EXCEPTION.TpException.EX2;

public class ErrDif  extends Exception{
    private int d ;
    public ErrDif(int D){
        this.d = D;
        System.out.println("la diffrence de deux nombre est negetif");
    }
}
