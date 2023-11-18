package EXEMPLE2;
import java.awt.Color;

import EXEMPLE2.PointGraphique;
public class Test1 {
    public static void main(String[] args) {
        PointGraphique p = new PointGraphique(2, 5, Color.red);
        p.affiche();
        System.out.println("____________________");
        PointGraphique p2 = new PointGraphique(p);
        p2.affiche();
        PointGraphique [] pts = new PointGraphique[3];
        pts [0] = new PointGraphique(2, 5, Color.black) ;
        pts [1] = new PointGraphique(-1, -3, Color.red);
        pts [2] =  new PointGraphique(2, -5, Color.orange) ;
        for (PointGraphique PT : pts){
            PT.affiche();
        }
                
    }
}
