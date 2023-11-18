package EXEMPLE2;
import java.awt.Color;
public class PointGraphique {
    protected float x;
    protected float y;
    protected Color c;
        public PointGraphique (float X , float Y , Color C){
            initialise(X,Y,C);
            System.out.println("Constructeur PointGraphique (float, float,Coleur)");
        }
         public PointGraphique (PointGraphique P){
            initialise(P);
            System.out.println("Constructeur PointGraphique (PointGraphique)");
        }
      private void initialise(PointGraphique p) {
            this.x = p.x;
            this.y = p.y;
            this.c = p.c;
        }
      private void initialise(float x2, float y2, Color c2) {
            this.x = x2;
            this.y = y2;
            this.c = c2;
        }
        public void affiche(){
            System.out.println("les cordonnes sont : "+this.x+" et "+this.y+" et le color = "+this.c);
        }
}
