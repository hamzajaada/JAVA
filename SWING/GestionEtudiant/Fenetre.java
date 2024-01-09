package SWING.GestionEtudiant;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class Fenetre extends JFrame implements ActionListener{
    JMenuItem nouveuE;
    public Fenetre(){
        JMenuBar barre = new JMenuBar();
        JMenu Etudiant = new JMenu("Etudiant");
         nouveuE = new JMenuItem("Nouveau");
         nouveuE.addActionListener(this);
        JMenuItem ChercherE = new JMenuItem("Chercher");
        JMenuItem SupprimerE = new JMenuItem("Supprimmer");
        JMenu Professeur = new JMenu("Professeur");
         JMenuItem nouveuP= new JMenuItem("Nouveau");
        JMenuItem ChercherP = new JMenuItem("Chercher");
        JMenuItem SupprimerP = new JMenuItem("Supprimmer");
        Etudiant.add(nouveuE);
        Etudiant.add(ChercherE);
        Etudiant.add(SupprimerE);
        Professeur.add(nouveuP);
        Professeur.add(ChercherP);
        Professeur.add(SupprimerP);
        barre.add(Etudiant);
        barre.add(Professeur);
        setJMenuBar(barre);
        setVisible(true);
        setBackground(Color.gray);
        setSize(800,400);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == nouveuE ) {
        new Etudiant();
        
       }
    }
    
}
