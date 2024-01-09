package EXCEPTION.TpException.EX2;

import EXCEPTION.TpException.EX1.Errconst;

public class Main {
    public static void main(String[] args) throws Errconst ,ErrSom, ErrProd, ErrDif {
       try {
            EntNat n = new EntNat(64);
            n.Somme(-7);
            n.Dif(65);
            n.Prod(-4);
       }
        catch (Errconst e) {e.getMessage(); } 
        catch (ErrSom e) {e.getMessage(); } 
         catch (ErrDif e) {e.getMessage(); } 
          catch (ErrProd e) {e.getMessage(); } 
        finally{
            System.out.println("Fin");
        }

    }
}
