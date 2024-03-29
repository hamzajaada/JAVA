package Socket.src.Preparation.MTServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ServeurMT extends Thread {
    private boolean isActive = true;
    private int nombreClient = 0 ;
    // private int nombreSecret ;
    // private boolean fin;
    private List<Conversation> Clients = new ArrayList<Conversation>();
    // private String gagnant;
    public static void main(String[] args) {
        // pour demarrer le Threads pour executer la methode run de Server socket:        
        new ServeurMT().start();
    }

    @Override
    public void run() {
        try {
            //creation de server :
             ServerSocket serverSocket = new ServerSocket(1234);
             System.out.println("runnnig !!!");
            //  nombreSecret = 6;
             // toujour Active :
             while (isActive) {
                //attend un client se connecter et return se socket:
                Socket socket = serverSocket.accept();
                //  dans chaque connection le nombre augmenter
                ++nombreClient;
                // creer un nouvelle conversation et appele la methode run (thread de socket )

              Conversation con =new Conversation(socket,nombreClient);
              Clients.add(con);
              con.start();

             }
        } catch (Exception e) {
            e.printStackTrace();
      
        
    }
}
    class Conversation extends Thread {
        protected Socket socketClient;
        protected int num;
        public Conversation(Socket socketClient , int n){
            this.socketClient = socketClient;
            this.num= n;
        }
        
        public void EnvoyerMsgToAllClient(String msg,Socket soc , int num){
            try {
                for(Conversation Client : Clients){
                    if(Client.socketClient!=soc){
                        if (Client.num == num || num == -1) {
                             PrintWriter pw = new PrintWriter(Client.socketClient.getOutputStream(),true);
                             pw.println("envoyer"+msg);
                        }
                       
                    }
                    
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        @Override
        public void run(){
            try {
                // pour lire les chaines de caractere :
                InputStream inputStream = socketClient.getInputStream();
                InputStreamReader isr=new InputStreamReader(inputStream);
                BufferedReader br = new BufferedReader(isr);
                // pour envoyer une chaines de caractere :
                PrintWriter pw = new PrintWriter(socketClient.getOutputStream(),true);
                String ipClient = socketClient.getRemoteSocketAddress().toString();
                pw.println("bienvenue vous etes les client numero ="+num);
                System.out.println("connexion de client numero "+num+" IP = "+ipClient);
                // System.out.println(Clients);
                // pw.println("deviner le nombre secret");
                while (true) {
                        String req = br.readLine();
                        
                        if(req.contains(">")){
                            String [] request = req.split(">");
                            if (request.length==2) {
                                String message = request[1];
                                int nume = Integer.parseInt(request[0]);
                                EnvoyerMsgToAllClient(message,socketClient,nume);
                                
                            }

                        }
                        else{
                        EnvoyerMsgToAllClient(req,socketClient,-1);

                        }
                        



                    // //lire la req envoyer par le client 
                    // String req = br.readLine();
                    // int nombre = Integer.parseInt(req);
                    // //calculer le lenght
                    // // String reponse = "lenght ="+req.length();
                    // // // envoyer la reponse
                    // // pw.println(reponse);
                    // if(fin == false){
                    //         if(nombre>nombreSecret){
                    //             pw.println("votre nombre est superieur au nombre secret");
                    //         }
                    //         else if(nombre<nombreSecret){
                    //             pw.println("votre nombre est inferieur au nombre secret");
                    //         }
                    //         else{
                    //             pw.println("Bravo vous avez gagner");
                    //             gagnant = ipClient;
                    //             System.out.println("bravo eux gagant IP = "+gagnant);
                    //             fin=true;
                    //         }
                    // }
                    // else{
                    //     pw.println("Jeu terminer le gagant est = "+gagnant);
                    // }
                }
            } catch (IOException e) {
               e.printStackTrace(); 
            }
            
            
        }
    }
}


