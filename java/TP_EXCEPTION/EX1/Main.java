package TP_EXCEPTION.EX1;

public class Main {
    public static void main(String[] args) {
        try{
            EntNat a = new EntNat(4);
            System.out.println("le nombre entrer est = " +a.GetX());
            EntNat b = new EntNat(-4);
            System.out.println("le nombre entrer est = " +b.GetX());

        }catch(ErrConst e){
                e.getMessage();
        }
    }
}
