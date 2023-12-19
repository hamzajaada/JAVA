package Socket.src.Preparation;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("Localhost",1234);
            System.out.println("je suis connecter au server !!!!!");
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            Scanner ss = new Scanner(System.in);
            System.out.println("donner le nombre :");
            int nb = ss.nextInt();
            os.write(nb);
            int rep = is.read();
            System.out.println("la resultat envoyer par le server est = "+rep);
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
