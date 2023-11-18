package EX_HERITAGE.point;
import java.awt.Color;
import java.awt.Graphics;
public class PointGraphique extends Point{
    Color coul ;
    //constructeur :
        public PointGraphique(double X , double Y , Color C){
            super(X,Y);
            this.coul=C;
        }
   
    // affiche le point materialise par un rectangle de 3 pixels de cote :
            public void dessine(Graphics g){
                g.setColor(coul);
                g.fillRect((int)X-1,(int)Y-1,3,3);
            }
           
            public void affiche() {
                System.out.println("les coordonnes de point: (" + this.X + " , " + this.Y + ")" );
                System.out.println("le couleur de point: " + this.coul);
            }
}
