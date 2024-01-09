package EXCEPTION;

public class TESTEXCEPTION1 {
    public static void main (String [] args) {
        int[] tab={6,2,7,9,7};
        try{
            try {
                System.out.println("début ");
                int x=1/(tab[4]-tab[2]);
                int y=tab[6];
                System.out.println("affectations terminees!");
                }
                catch(ArrayIndexOutOfBoundsException e )  {
                    System.out.println ("indice incorrect "); 
                                            }
                finally {
                    System.out.println ("Fin de affectuer"); }
                    }
                catch (ArithmeticException e) {
                System.out.println ("Operation impossible "); 
                 }
            System.out.println("Fin") ;
        } }

