package EntreSortie.preparationDS.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffered {
    public static void main(String[] args) throws IOException {
        try {
            //Ecrire un fichier :
            FileWriter wr = new FileWriter("file.txt");
            BufferedWriter BufferW = new BufferedWriter(wr);
            BufferW.write("Ensa ");
            BufferW.newLine();
            BufferW.write("Essaouira");
            BufferW.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s =null;
        FileReader fr = new FileReader("file.txt") ;
        BufferedReader BRR = new BufferedReader(fr);
        while ((s=BRR.readLine())!=null) {
            System.out.println(s);
        }

    }}

