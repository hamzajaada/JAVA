package DS.Exception.DS;

public class EntNat {
    private int n ;
    public EntNat(int n) throws Errconst{
        if(n<0) throw new Errconst(n);
        this.n=n;
    }
    public static int Somme(EntNat a, EntNat b)throws ErrSom{
        int s=0;
        s= a.getN()+b.getN();
        if (s<0)throw new ErrSom(s);
        return s;
    }
    public static int Dif(EntNat a, EntNat b)throws ErrDif{
        int d=0;
        d= a.getN()-b.getN();
        if (d<0)throw new ErrDif(d);
        return d;
    }
    public int getN() {
        return n;
    }
  
    
}
