package TP_EXCEPTION.EX2;
public class EntNat {
    private int x;
    public EntNat(int X) throws ErrConst{
       if (X<0) throw new  ErrConst(X);
       this.x = X;
    }
    public int GetX(){
        return this.x;
    }
    public static int Somme(EntNat a, EntNat b) throws ErrSom {
       int Res ;
       Res = a.GetX() + b.GetX() ;
       if( Res < 0) throw new ErrSom(Res);
       return Res ;
    }
     public static int Prod(EntNat a, EntNat b) throws ErrProd {
       int Prod ;
       Prod = a.GetX()  * b.GetX() ;
       if( Prod < 0) throw new ErrProd(Prod);
       return Prod ;
    }
     public static int Diff(EntNat a, EntNat b) throws ErrDiff {
       int Diff ;
       Diff = a.GetX()  - b.GetX() ;
       if( Diff < 0) throw new ErrDiff(Diff);
       return Diff ;
    }
    
}
