package EntreSortie.TP.EX1;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) throws IOException {
        Scanner ss = new Scanner(System.in);
        System.out.println("Nom fichier a creer :");
        String nomF = ss.nextLine();
        FileOutputStream output = new FileOutputStream(nomF);
        DataOutputStream DToutput = new DataOutputStream(output);
        String nom;
         String Prenom;
         int date ;
        int i =1;
        while (i<=2) {
                
              System.out.println("nom "+i+":");
               nom = ss.nextLine();
               DToutput.writeUTF(nom);
              System.out.println("prenom ");
               Prenom = ss.nextLine();
              DToutput.writeUTF(nom);
              System.out.println("Date : ");
               date = ss.nextInt();
              DToutput.writeInt(date);
              i++;
        }
        System.out.println("***fin de creation*****");
    }
}
