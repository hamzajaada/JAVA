package TP_EXCEPTION.EX1;

public class ErrConst extends Exception {
    public int x;
    public ErrConst(int X){
        this.x=X;
       System.out.println("le nombre que vous avez entrer est negatif :"+this.x);
    }
}
