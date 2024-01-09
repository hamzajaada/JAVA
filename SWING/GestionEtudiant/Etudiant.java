package SWING.GestionEtudiant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Etudiant extends JFrame {
    JPanel pane1;
    JPanel pane2;
    JPanel pane3;
    JPanel pane; 
    JLabel titre;
    JLabel Lblcode;
    JLabel Lblnom;
    JLabel Lblprenom;
    JLabel Lblage ;
    JLabel Lblfilier;
    JLabel Lblanne ;
    JTextField Textcode;
    JTextField Textnom;
    JTextField Textprenom;
    JTextField Textage;
    JComboBox Filier;
    JRadioButton Premier;
    JRadioButton Deuxieme;
    JRadioButton troisieme ;
    JButton AjouteEtudiant ;
    public Etudiant(){
        titre = new JLabel("Gestion des etudiant :");
        
        Lblcode = new JLabel("Code :");
        Lblnom = new JLabel("Nom :");
        Lblprenom = new JLabel("Prenom :");
        Lblage = new JLabel("Age :");
        Lblfilier = new JLabel("Filier :");
        Lblanne = new JLabel("Anne univesitaire:");
        Textcode = new JTextField(20);
         Textnom = new JTextField(20);
          Textprenom = new JTextField(20);
           Textage = new JTextField(20);
           Filier = new JComboBox();
           Filier.addItem("GI");
           Filier.addItem("IDSD");
           Filier.addItem("ERR");
           Filier.addItem("GE");
           Premier = new JRadioButton("1ere anne");
           Deuxieme = new JRadioButton("2ere anne");
           troisieme = new JRadioButton("3ere anne");
           ButtonGroup group = new ButtonGroup();
           group.add(Premier);
           group.add(Deuxieme);
           group.add(troisieme);
           pane1 = new JPanel();
           pane1.add(titre);
           pane2 = new JPanel(new GridLayout(5,2));
           pane2.setBackground(Color.orange);
           pane2.add(Lblcode);
           pane2.add(Textcode);
           pane2.add(Lblnom);
           pane2.add(Textnom);
           pane2.add(Lblprenom);
           pane2.add(Textprenom);
           pane2.add(Lblage);
           pane2.add(Textage);
           pane2.add(Lblfilier);
           pane2.add(Filier);
           AjouteEtudiant = new JButton("ajoute");
           AjouteEtudiant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  System.out.println("code : "+Textcode.getText());
                  System.out.println("nom : "+Textnom.getText());
                  System.out.println("prenom : "+Textprenom.getText());
                  System.out.println("age : "+Textage.getText());
                  System.out.println("Filiere : "+Filier.getSelectedItem());
                
            }
           });
           pane3=new JPanel();
           pane3.add(Lblanne);
           pane3.add(Premier);
           pane3.add(Deuxieme);
           pane3.add(troisieme);
           pane3.add(AjouteEtudiant);
           pane  = new JPanel(new BorderLayout());
           pane.add(pane1,BorderLayout.NORTH);
           pane.add(pane2,BorderLayout.CENTER);
           pane.add(pane3,BorderLayout.SOUTH);
           JTabbedPane tpane = new JTabbedPane();
           tpane.add("Ajouter etudiant",pane);
           JPanel pane4 = new JPanel();
           pane4.setBackground(Color.gray);
           tpane.add("List des Etudiant ",pane4);
           //ajoute pane a JFrame (Fenetre)
           getContentPane().add(tpane);
           setVisible(true);
           //setSize(500,500);
           pack();
           setBackground(Color.GREEN);
           setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }
   
}
