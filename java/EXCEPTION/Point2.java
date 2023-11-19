// Point2.java
package EXCEPTION;

class ErrPoint extends Exception{};
class ErrConst extends ErrPoint{};
class ErrDepl extends ErrPoint{};

public class Point2 {
    private int x;
    private int y;

    public Point2(int x, int y) throws ErrConst {
        if (x < 0 || y < 0) throw new ErrConst();
        this.x = x;
        this.y = y;
    }

    public void deplacer(int dx , int dy) throws ErrDepl {
        if ((x + dx) < 0 || (y + dy) < 0) throw new ErrDepl();
        x += dx;
        y += dy;
    }

    public void affiche(){
        System.out.println("<" + x + "," + y + ">");
    }
}
