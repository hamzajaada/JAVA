package TP_EXCEPTION.EX1;

public class EntNat {
    private int x;
    public EntNat(int X) throws ErrConst{
       if (X<0) throw new  ErrConst(X);
       this.x = X;
    }
    public int GetX(){
        return this.x;
    }
    
}
