package EXCEPTION.TpException.EX1;


public class EntNat {
    private int nombre ;
    public EntNat(int n) throws Errconst{
        if(n<0)throw new Errconst(n);
        else this.nombre=n; 
    }
    public int getN(){
        return this.nombre;
    }
}
