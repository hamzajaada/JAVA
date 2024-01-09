package SWING;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Mafenetre extends JFrame implements ActionListener  {
    JLabel jL1 = new JLabel("Nom =");
    JTextField jT1 = new JTextField(12);
    JButton jB1 = new JButton("ADD");
    JButton jB2 = new JButton("DELLETE");
    List liste1 = new List();
    List liste2 = new List();
    //Constructeur :
    public Mafenetre(){
        //Ecrans deviser a 5 partei nord ;;
      this.setLayout(new BorderLayout());
      JPanel jp1 = new JPanel();
      jp1.setLayout(new FlowLayout());
      jp1.add(jL1);
      jp1.add(jT1);
      jp1.add(jB1);
      jp1.add(jB2);
      this.add(jp1 , BorderLayout.NORTH);
      jB1.addActionListener(this);
      jB2.addActionListener(this);
      JPanel jP2 = new JPanel();
      jP2.setLayout(new GridLayout());
      jP2.add(liste1);
      jP2.add(liste2);
      this.add(jP2,BorderLayout.CENTER);
      //this.setBounds(10,10,500,500);
      this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
      this.setVisible(true);
    }

    public static void main(String[] args) {
       new  Mafenetre();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //ajouter un element :
       if(e.getSource()==jB1){
        String s = jT1.getText();
        liste1.add(s);
        jT1.setText(" ");
       }
       //supprimer un element :
       else if(e.getSource()==jB2){
        //retourner l'index de  l'element  selectionner :
        int num = liste1.getSelectedIndex();
        liste1.remove(num);
       }
    }
}
