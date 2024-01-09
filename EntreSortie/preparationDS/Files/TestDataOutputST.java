package EntreSortie.preparationDS.Files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputST {
    public static void main(String[] args) throws IOException {
        int p;

        // Écriture dans le fichier
        try (FileOutputStream fr = new FileOutputStream("exe.txt");
             DataOutputStream dataOutputStream = new DataOutputStream(fr)) {
            dataOutputStream.writeInt(3);
        }

        // Lecture depuis le fichier
        try (FileInputStream fr1 = new FileInputStream("exe.txt");
             DataInputStream in = new DataInputStream(fr1)) {

            // Utilisez un bloc try-catch pour détecter la fin du fichier
            try {
                while ((p = in.readInt()) != -1) {
                    System.out.println(p);
                }
            } catch (EOFException e) {
                // Fin du fichier atteinte, rien à faire ici
            }
        }
    }
}
