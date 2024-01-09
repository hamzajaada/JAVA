package DS.Exception.DS;

public class ErrDif extends ErrNat {
    public ErrDif(int n) {
        super(n);
        System.out.println("la valeur de la diffrence est negatif"+this.n);
    }
   }
