package EXCEPTION;
public class Except6 {
    public static void main(String[] args) {
        try{
            TestPoint();
        }
        catch(ErrPoint a){System.out.println("erreur sur un point");}
    }
    static void TestPoint() throws ErrConst , ErrDepl {
         Point2 a = new Point2 (1,4);
         a.affiche();
         a.deplacer(3, 5);
         a.affiche();
    } 
}

