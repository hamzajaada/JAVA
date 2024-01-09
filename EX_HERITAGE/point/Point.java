package EX_HERITAGE.point;
public class Point {
    protected double X;
    protected double Y;
  // constructeur :
        public Point(double X , double Y){
            this.X=X;
            this.Y=Y;
            }
            
            public double distance() {
                // Logique de calcul de la distance, remplacez cela par votre propre implémentation
                return Math.sqrt(X * X + Y * Y);
            }

}
