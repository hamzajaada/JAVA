import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

public class CalculatorGUI {

    private JFrame frame;
    private JTextField inputField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorGUI calculatorGUI = new CalculatorGUI();
            calculatorGUI.createAndShowGUI();
        });
    }

    public void createAndShowGUI() {
        frame = new JFrame("Calculatrice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputField = new JTextField(20);
        inputField.setEditable(false); // Le champ d'entrée est uniquement pour l'affichage du résultat

        // Création des boutons pour les chiffres et les opérations
        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "=", "+"};
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new CalculatorButtonListener());
            buttonPanel.add(button);
        }

        // Agencement de l'interface
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(inputField, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private class CalculatorButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.equals("=")) {
                try {
                    // Récupérer l'opération à partir de l'interface graphique
                    String operation = inputField.getText();

                    // Envoyer l'opération au serveur
                    sendOperationToServer(operation);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                // Ajouter le texte du bouton à l'opération en cours
                inputField.setText(inputField.getText() + buttonText);
            }
        }
    }

    private void sendOperationToServer(String operation) {
        try {
            // Établir une connexion avec le serveur sur le port 12345
            Socket socket = new Socket("localhost", 12345);

            // Mise en place des flux d'entrée/sortie
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Envoyer l'opération au serveur
            output.println(operation);

            // Fermer les flux et la connexion
            output.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

