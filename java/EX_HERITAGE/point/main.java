package EX_HERITAGE.point;
import java.awt.Color;
import java.awt.Graphics;

import javafx.scene.paint.Stop;
public class main {

	

    public static void main(String[] args) {
		    Color coul = new Color(255,0,0);
            PointGraphique p = new PointGraphique(15,11, coul);
            System.out.println("les cordonnes de la point :");
            p.affiche();
            System.out.println("la distance");
            double dist = p.distance();
            System.out.println(dist);
           
	}
}
