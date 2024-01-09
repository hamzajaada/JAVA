package TP_EXCEPTION.EX2;

public class Main2 {
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
        } catch(ErrConst e){
            System.out.println("erreur de ErrConst de cet valleur "+ e.n);
        }
        catch(ErrSom e){
            System.out.println("erreur de ErrSom de cet valleur "+ e.n);
        }
        catch(ErrProd e){
            System.out.println("erreur de ErrProf de cet valleur "+ e.n);
        }
        catch(ErrDiff e){
            System.out.println("erreur de ErrDiff de cet valleur "+ e.n);
        }
        
    }
}
