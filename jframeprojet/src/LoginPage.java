import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginPage() {
        setTitle("Login Page");
        setSize(600, 400);  // Augmentation de la taille de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        // Augmentation de la taille de la police pour les composants texte
        Font textFont = new Font("Arial", Font.PLAIN, 40);
        usernameLabel.setFont(textFont);
        passwordLabel.setFont(textFont);
        usernameField.setFont(textFont);
        passwordField.setFont(textFont);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onLogin();
            }
        });

        // Augmentation de la taille de la police pour le bouton
        Font buttonFont = new Font("Arial", Font.BOLD, 40);
        loginButton.setFont(buttonFont);

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // placeholder
        panel.add(loginButton);

        add(panel);

        setVisible(true);
    }

    private void onLogin() {
        String username = usernameField.getText();
        char[] password = passwordField.getPassword();
        // Perform authentication logic here
        // For simplicity, let's just display the entered username and password
        JOptionPane.showMessageDialog(this, "Username: " + username + "\nPassword: " + new String(password));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginPage();
            }
        });
    }
}


