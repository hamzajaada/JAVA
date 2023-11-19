package EXCEPTION;
class ErrConst extends Exception{}
class ErrDepl extends Exception{}
public class Point {
    private int x;
    private int y;
    public Point (int x, int y) throws ErrConst{
        if(x<0 || y<0) throw new ErrConst();
        this.x = x;
        this.y = y;
    }
    public void deplacer(int dx , int dy) throws ErrDepl{
         if((x + dx) <0 || (y+ dy)<0) throw new ErrDepl();
         x += dx;
         y += dy;
    }
    public void affiche(){
        System.out.println("<"+x+ ","+y+">");
    }
   }
