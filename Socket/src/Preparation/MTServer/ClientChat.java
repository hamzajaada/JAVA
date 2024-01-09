package Socket.src.Preparation.MTServer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ClientChat extends Application {
    PrintWriter pw;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Client Chat");
        BorderPane borderpane = new BorderPane();
        Label LabelHost = new Label("HOST :");
        TextField TextFieldHost = new TextField("Localhost");
        Label LabelPort = new Label("PORT :");
        TextField TextFieldPORT = new TextField("1234");
        Button btnConnecter = new Button("Connecter");
        HBox hBox = new HBox();
        
        // Set the background color to orange
        hBox.setBackground(new Background(new BackgroundFill(Color.ORANGE, null, null)));

        // Set spacing and padding
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(10));
        hBox.getChildren().addAll(LabelHost, TextFieldHost, LabelPort, TextFieldPORT, btnConnecter);
        borderpane.setTop(hBox);
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10));
        ObservableList<String> ListModel = FXCollections.observableArrayList();
        ListView<String> listView = new ListView<String>(ListModel);
        vBox.getChildren().add(listView);
        borderpane.setCenter(vBox);
        Label LabelMesage = new Label("Votre Message :");
        TextField TextFieldMessage = new TextField();
        Button btnEnvoyer = new Button("Envoyer");
        HBox hbox2 = new HBox();
        hbox2.getChildren().addAll(LabelMesage,TextFieldMessage,btnEnvoyer);
        borderpane.setBottom(hbox2);
        hbox2.setSpacing(10);
        hbox2.setPadding(new Insets(10));
        Scene scene = new Scene(borderpane, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        btnConnecter.setOnAction((evt)->{
            String Host = TextFieldHost.getText();
            int Port = Integer.parseInt(TextFieldPORT.getText());
            try {
                //creer un nouveau Socket :
                Socket socket = new Socket(Host,Port);
                // preparer les outils pour Lire les donner recevoire :
                InputStream is = socket.getInputStream();
                InputStreamReader isr  = new InputStreamReader(is);
                BufferedReader bfr = new BufferedReader(isr);
                //preparer les outils pour envoyer les donner :
                 pw = new PrintWriter(socket.getOutputStream(),true);
                new Thread(
                        ()->{
                            try {
                                while(true){
                                     String Reponse = bfr.readLine();
                                     ListModel.add(Reponse);
                                }
                                
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                                               
                        }).start();
                
            } catch (Exception e) {
                e.getMessage();
            }
        });
        btnEnvoyer.setOnAction((evt)->{
            String Message = TextFieldMessage.getText();
            pw.println(Message);
        });
    }
}
