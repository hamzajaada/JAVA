import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            // Créer un serveur écoutant sur le port 12345
            ServerSocket serverSocket = new ServerSocket(12345);

            System.out.println("Serveur en attente de connexions...");

            // Accepter la connexion du client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connecté.");

            // Mise en place des flux d'entrée/sortie
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

            // Attendre les opérations du client
            while (true) {
                String operation = input.readLine();
                if (operation == null || operation.equals("bye")) {
                    break; // Sortir de la boucle si le client se déconnecte
                }

                // Analyser l'opération, effectuer le calcul et renvoyer le résultat
                String result = calculateResult(operation);
                output.println(result);
            }

            // Fermer les flux et la connexion
            input.close();
            output.close();
            clientSocket.close();
            serverSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String calculateResult(String operation) {
        try {
            // Analyser l'opération
            String[] operands = operation.split("\\s+");
            double operand1 = Double.parseDouble(operands[0]);
            String operator = operands[1];
            double operand2 = Double.parseDouble(operands[2]);

            // Effectuer le calcul en fonction de l'opérateur
            double result;
            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                default:
                    return "Opérateur non valide";
            }

            // Renvoyer le résultat
            return String.valueOf(result);

        } catch (Exception e) {
            return "Erreur de calcul";
        }
    }
}

