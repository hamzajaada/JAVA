package EntreSortie.preparationDS;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class output {
    public static void main(String[] args) throws IOException {
        //ecrire dans le fichier  :
        Scanner clavier = new Scanner(System.in); 
        FileOutputStream f = new FileOutputStream("ichier.dat");
        DataOutputStream sortie = new DataOutputStream(f);
        int n ;
        do{
            System.out.println("donner le nombre que vous voullez entrer :");
            n= clavier.nextInt();
            sortie.writeInt(n);
        }while(n!=0);
        System.out.println("fin de creation");
        //lire le fichiers :
        FileInputStream FE = new FileInputStream("ichier.dat");
        DataInputStream entree = new DataInputStream(FE);
        boolean EOF = false;
        int ne=0;
        while (!EOF) {//EOF FALSE
            
            try{
            ne = entree.readInt();

            }catch(EOFException e){//Si n'exixte aucun elelemnt a lire dans fichier
                EOF =true;
            }
            if(!EOF) System.out.println(ne);

            
        }
        entree.close();
        System.out.println("fin");
    }
    
    
}
