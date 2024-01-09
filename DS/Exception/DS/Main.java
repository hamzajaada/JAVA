package DS.Exception.DS;
public class Main {
public static void main(String[] args){

    try {
        EntNat a = new EntNat(4);
        EntNat b = new EntNat(6);
        EntNat.Somme(a, b);
        EntNat.Dif(a, b);
    } 
    catch (Errconst e){ e.getMessage(); }
    catch (ErrSom e){ e.getMessage(); }
    catch (ErrDif e){ e.getMessage(); }
    finally{
        System.out.println("fin de programme");
    }
}
}
