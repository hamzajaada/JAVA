package EntreSortie.preparationDS.Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFluxOctet {
    public static void main(String[] args) throws IOException {
        int oct;
        //ecrire Pour lire un fichier d'octet ;
        FileInputStream input = new FileInputStream("file.txt");
        //Ecrire pour ecrire un fichier d'octet :
        FileOutputStream  output = new FileOutputStream("DS.txt");

        oct=input.read();
                output.write(oct);
        }


    }

