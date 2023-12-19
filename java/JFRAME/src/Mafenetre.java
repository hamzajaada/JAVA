import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mafenetre extends JFrame implements MouseListener {

    private JButton monBouton;

    public Mafenetre() {
        setSize(600, 400);
        setTitle("Gestion de clics");

        getContentPane().setLayout(new FlowLayout());

        monBouton = new JButton("ESSAI");
        getContentPane().add(monBouton);

        monBouton.addMouseListener(this); // Ajout de l'écouteur sur le bouton

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent ev) {
        int x = ev.getX();
        int y = ev.getY();
        System.out.println("Clic au point de coordonnées " + x + ", " + y);
    }

    // Les autres méthodes de l'interface MouseListener
    public void mousePressed(MouseEvent ev) {}
    public void mouseReleased(MouseEvent ev) {}
    public void mouseEntered(MouseEvent ev) {}
    public void mouseExited(MouseEvent ev) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Mafenetre());
        
    }
}
