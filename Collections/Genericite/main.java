package Collections.Genericite;

public class main {
    public static void main(String[] args) {
        Solo <Integer> soloI = new Solo <Integer>();
        Solo <String> soloS = new Solo <String>("hamza jaada");
        System.out.println(soloS.getValeur());
        Solo <Float> soloF = new Solo <Float>(12.2f);
        System.out.println(soloF.getValeur());
        Solo <Double> soloD = new Solo <Double>(12.34324);
        System.out.println(soloD.getValeur());
    }
}
