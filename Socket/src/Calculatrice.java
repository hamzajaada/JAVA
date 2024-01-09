package Socket.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculatrice extends JFrame {

    private JTextField textField;
    private double premierNombre, secondNombre, resultat;
    private String operateur;

    public Calculatrice() {
        super("Calculatrice");
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.PLAIN, 24)); // Ajustez la taille de la police
        textField.setPreferredSize(new Dimension(400, 70)); // Ajustez la taille de la zone de saisie
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10)); // Ajoutez des marges entre les boutons

        String[] boutonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : boutonLabels) {
            JButton bouton = new JButton(label);
            bouton.addActionListener(new BoutonListener());
            bouton.setFont(new Font("Arial", Font.PLAIN, 20)); // Ajustez la taille de la police des boutons
            bouton.setPreferredSize(new Dimension(80, 80)); // Ajustez la taille des boutons
            panel.add(bouton);
        }

        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600); // Ajustez la taille de la fenêtre
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class BoutonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String texteBouton = event.getActionCommand();

            if (texteBouton.matches("[0-9.]")) {
                textField.setText(textField.getText() + texteBouton);
            } else if (texteBouton.matches("[/*\\-+]")) {
                premierNombre = Double.parseDouble(textField.getText());
                operateur = texteBouton;
                textField.setText("");
            } else if (texteBouton.equals("=")) {
                secondNombre = Double.parseDouble(textField.getText());

                switch (operateur) {
                    case "+":
                        resultat = premierNombre + secondNombre;
                        break;
                    case "-":
                        resultat = premierNombre - secondNombre;
                        break;
                    case "*":
                        resultat = premierNombre * secondNombre;
                        break;
                    case "/":
                        if (secondNombre != 0) {
                            resultat = premierNombre / secondNombre;
                        } else {
                            textField.setText("Erreur");
                            return;
                        }
                        break;
                }

                textField.setText(String.valueOf(resultat));
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculatrice());
    }
}


