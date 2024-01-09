package EntreSortie.preparationDS.Files;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException,EOFException {
        Personne p =null;
        FileInputStream input = new FileInputStream("object.dat");
        ObjectInputStream inputob = new ObjectInputStream(input);
        p=(Personne) inputob.readObject();
            System.out.println(p.code);
            System.out.println(p.nom);
        }

    }

