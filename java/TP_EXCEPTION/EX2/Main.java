package TP_EXCEPTION.EX2;

public class Main {
    public static void main(String[] args) {
        try{
            int S,P,D;
          EntNat a = new EntNat(3);
          EntNat b = new EntNat(4);
          S = EntNat.Somme(a,b);
          System.out.println("la somme de " +a.GetX()+ " + " +b.GetX()+ " = " +S);
          P = EntNat.Prod(a,b);
          System.out.println("la produits de " +a.GetX()+ " * " +b.GetX()+ " = " +P);
          D = EntNat.Diff(a,b);
          System.out.println("la difference de " +a.GetX()+ " - " +b.GetX()+ " = " +D);
        } catch(ErrNat e){
            System.out.println("erreur de ErrNat de cet valleur "+ e.n);
        }
    }
    
}
