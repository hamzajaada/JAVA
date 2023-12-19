package Socket.src.Preparation;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) { 
        
        try{
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("server runngin");
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            int nb = is.read();
            System.out.println("le nombre envoyer par le client est ="+nb);
            int rep = nb*2;
            os.write(rep);
            s.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        

    }
    


}
