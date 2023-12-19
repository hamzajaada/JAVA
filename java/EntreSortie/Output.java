package EntreSortie;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner; // Importez la classe Scanner pour la lecture au clavier

public class Output {
    public static void main(String[] args) throws IOException {
        String nomFich;
        int n ;
       int A=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Donner le nom du fichier à créer : ");
        nomFich = scanner.nextLine();
        DataOutputStream sortie = new DataOutputStream(new FileOutputStream(nomFich));
        do{
        System.out.print("Donner un entier: ");
        n = scanner.nextInt();
        sortie.writeInt(n);
        }while(n !=0);
        sortie.close();
        System.out.println("****fin de creation*****");
        DataInputStream entree = new DataInputStream(new FileInputStream(nomFich)) ;
        boolean eof = false;
        
        while(!eof){
            
            try {
                A = entree.readInt();
            } catch (EOFException e) {
                  eof = true;
            }
            
            if(!eof) System.out.println(A);
        }
        entree.close();
        System.out.println("****fin de creation*****");

    }
}