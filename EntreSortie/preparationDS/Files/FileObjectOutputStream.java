package EntreSortie.preparationDS.Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileObjectOutputStream {
    public static void main(String[] args) throws IOException {
        Personne p1 = new Personne(3, "hamza");
        Personne p2 = new Personne(2, "Ayoub");
        FileOutputStream out  = new FileOutputStream("object.dat");
        ObjectOutputStream outObjet = new ObjectOutputStream(out);
        outObjet.writeObject(p1);
        outObjet.writeObject(p2);
        outObjet.close();
    }
}
//readObject - writeObject