package EXCEPTION;

public class Main {
    public static void main(String[] args) {
        try {
            Point p = new Point(3, 4);
            p.affiche();
            p.deplacer(5, 5);
            p = new Point(-3, 5);
            p.affiche();
        } catch (ErrConst e) {
            // Gérer l'exception ici, par exemple, afficher un message d'erreur
            System.err.println("Erreur de construction du point : " + e.getMessage());
        }
        catch (ErrDepl e) {
            // Gérer l'exception ici, par exemple, afficher un message d'erreur
            System.err.println("Erreurde deplacement " + e.getMessage());
        }
    }
}

