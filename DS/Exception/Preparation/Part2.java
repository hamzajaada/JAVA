package DS.Exception.Preparation;

public class Part2 {
    public static float inverse(int n) throws MonException{
        float x =0;
        if (n==0) throw new MonException(n);
        x = 1/n;
        return x;
    }
    public static void main(String[] args) {
        try {
            System.out.println(inverse(1));
        } catch (MonException e) {
          e.getMessage();
        }
        
    }
}
