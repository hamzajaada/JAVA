package Socket.src;

import java.net.Socket;
import java.io.PrintWriter;

public class clientSocket {

    public static void main(String[] args) {
        try {
            // Connexion au serveur sur le port 12345
            Socket socket = new Socket("localhost", 12345);

            // Obtention du flux de sortie du client
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // Envoi d'un message au serveur
            writer.println("Hello, serveur!");

            // Fermeture des ressources
            writer.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
