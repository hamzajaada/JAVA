package EntreSortie.preparationDS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fichierOUT {

      
public static void main (String args[]) throws IOException{
        Scanner clavier = new Scanner(System.in); 
            String ligne ;
            String nomfich ;
            int n ;
            System.out.print ("Donnez le nom du fichier a creer : ") ;
            nomfich = clavier.nextLine() ;
                PrintWriter sortie = new PrintWriter (new FileWriter (nomfich)) ;
                    do{
                        System.out.print ("donnez un entier : ") ;
                        n = clavier.nextInt() ;
                        if (n != 0){
                            //la comade qui staock dans le fichier
                        sortie.println (n + " a pour carre " + n*n) ;
                             }
                    }while (n != 0) ;
            sortie.close () ;
            System.out.println ("*** fin creation fichier ***");
            BufferedReader entree = new BufferedReader (new FileReader(nomfich)) ;
                    do {
                        ligne=entree.readLine();
                        if(ligne!=null) System.out.println(ligne);
                    }
                    while(ligne != null);
                entree.close();
                System.out.println("fin liste fichier");            
            
}
}
 
