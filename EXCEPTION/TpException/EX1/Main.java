package EXCEPTION.TpException.EX1;

public class Main {
    public static void main(String[] args) throws Errconst {
        try {
             EntNat n = new EntNat(-7);
             int nb = n.getN();
             System.out.println(nb);
        } catch (Exception e) {
               e.getMessage();
        }
       
    }
}
