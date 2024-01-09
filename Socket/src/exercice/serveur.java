package Socket.src.exercice;

import java.io.*;
import java.net.*;

public class serveur {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Serveur en attente de connexion...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connecté depuis " + clientSocket.getInetAddress());

                // Créer un thread pour gérer chaque client
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {
        private final Socket clientSocket;

        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                while (true) {
                    // Attendre l'entrée du client
                    String operation = in.readLine();
                    if (operation == null || operation.equals("exit")) {
                        break;
                    }

                    // Effectuer le calcul
                    try {
                        double resultat = evaluerOperation(operation);
                        out.println("Résultat : " + resultat);
                    } catch (ArithmeticException | NumberFormatException ex) {
                        out.println("Erreur : " + ex.getMessage());
                    }
                }

                // Fermer les flux et la socket
                in.close();
                out.close();
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private double evaluerOperation(String operation) {
            // Diviser la chaîne en parties (nombre1 opérateur nombre2)
            String[] parties = operation.split(" ");
            double nombre1 = Double.parseDouble(parties[0]);
            String operateur = parties[1];
            double nombre2 = Double.parseDouble(parties[2]);

            // Effectuer le calcul
            switch (operateur) {
                case "+":
                    return nombre1 + nombre2;
                case "-":
                    return nombre1 - nombre2;
                case "*":
                    return nombre1 * nombre2;
                case "/":
                    if (nombre2 == 0) {
                        throw new ArithmeticException("Division par zéro");
                    }
                    return nombre1 / nombre2;
                default:
                    throw new IllegalArgumentException("Opérateur non valide");
            }
        }
    }
}

