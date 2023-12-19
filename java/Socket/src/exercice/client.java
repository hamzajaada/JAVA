package Socket.src.exercice;
import java.io.*;
import java.net.*;

public class client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Entrez une opération mathématique (par exemple, 2 + 2) ou 'exit' pour quitter :");

            while (true) {
                String operation = in.readLine();
                out.println(operation);

                if (operation.equals("exit")) {
                    break;
                }

                // Recevoir et afficher la réponse du serveur
                String reponse = serverIn.readLine();
                System.out.println("Réponse du serveur : " + reponse);
            }

            // Fermer les flux et la socket
            in.close();
            serverIn.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

