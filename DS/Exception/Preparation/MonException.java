package DS.Exception.Preparation;

public class MonException extends Exception {
    int n ;
    public MonException (int n){
        this.n =n;
        System.out.println("Erreur dans le division  tu donne la valeur de ="+this.n);
    }

}
