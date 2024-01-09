package Socket.src;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurSocket {
    public static void main(String[] args) {
        try {
            // Création d'un serveur écoutant sur le port 12345
            ServerSocket serverSocket = new ServerSocket(12345);

            System.out.println("Serveur en attente de connexions...");

            // Attente de la connexion d'un client
            Socket clientSocket = serverSocket.accept();

            System.out.println("Client connecté.");

            // Flux de lecture du client
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Flux d'écriture vers le client
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            // Lecture du message du client
            String clientMessage = reader.readLine();
            System.out.println("Message reçu du client : " + clientMessage);

            // Réponse au client
            writer.println("Message reçu par le serveur : " + clientMessage);

            // Fermeture des ressources
            reader.close();
            writer.close();
            clientSocket.close();
            serverSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}