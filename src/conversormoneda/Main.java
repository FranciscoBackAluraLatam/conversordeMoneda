/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversormoneda;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author fbacks
 */
public class Main extends Application{

   
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
       FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("/View/VistaFXML.fxml"));
        Pane ventana=(Pane) loader.load();
          stage.setTitle("Conversor de Moneda");
         Scene scene = new Scene(ventana);
         stage.setScene(scene);
         
         stage.show();
}
}
