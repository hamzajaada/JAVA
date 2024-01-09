package DS.ES;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialSalle {
    public void saveSalleToSerialFile(String nf, Salle e) throws IOException{
        FileOutputStream fs = new FileOutputStream(nf);
        ObjectOutputStream ous = new ObjectOutputStream(new BufferedOutputStream(fs));
        ous.writeObject(e); 
        ous.close(); 
    }
      public static Salle getSalleFromSerialFile(String fileName) {
        Salle salle = null;
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(fileName)))) {
            salle = (Salle) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return salle;
    }


}
