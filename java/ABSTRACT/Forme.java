package ABSTRACT;

public abstract class Forme {
    protected double x,y;


    public void deplacer(double dx , double dy){
        x+=dx;
        y+=dy;
        System.out.println(x);
        System.out.println(y);
    }
    // les fonction abstrait non pas un corp 
    public abstract void perimetre();
        public abstract double surface();

}
