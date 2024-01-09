package EXCEPTION;

public class TestException {
    public static void affectation (int i , int[]tab ){
        int x = 1/ (tab[i+2] -  tab[i]);
        int y = tab[i+4];
    }
    public static void main(String[] args) {
        int [] t = {6,2,7,9,7};
        try{ 
             System.out.println("debut");
            affectation(2, t);
        System.out.println("affectation reussite");
        }
         catch(ArithmeticException e){
            System.out.println("ArithmeticException");
            System.out.println("fin1");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("fin");
        } 
     //une fois il trouve un exception va il ne voire pas les autres exeception il continue ,
      
    }
}
