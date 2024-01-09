package EXCEPTION.TpException.EX2;

import EXCEPTION.TpException.EX1.Errconst;

public class EntNat {
    private int nombre ;
    public EntNat(int n) throws Errconst{
        if(n<0)throw new Errconst(n);
        else this.nombre=n; 
    }

    public  void Somme(int nb) throws ErrSom{
        int s = 0 ;
        s = this.nombre + nb ;
        if(s<0)throw new ErrSom(s);
        else System.out.println("la resultat de somme de "+this.nombre+" + "+nb+"= "+s);
    }
    public  void Prod(int nb) throws ErrProd{
        int p = 0 ;
        p = this.nombre * nb ;
        if(p<0)throw new ErrProd(p);
        else System.out.println("la resultat de produits de "+this.nombre+" * "+nb+"= "+p);
    }
    public  void Dif(int nb) throws ErrDif{
        int d = 0 ;
        d = this.nombre - nb ;
        if(d<0)throw new ErrDif(d);
        else System.out.println("la resultat de difference de "+this.nombre+" - "+nb+"= "+d);
    }
    public int getN(){
        return this.nombre;
    }
}
