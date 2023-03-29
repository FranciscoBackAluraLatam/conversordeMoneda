/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package conversormoneda;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author fbacks
 */
public class VistaFXMLController implements Initializable {

    @FXML
    private ComboBox<?> CboxDivisa;
    @FXML
    private Label LabelMone;
    @FXML
    private Label LabelMtwo;
    @FXML
    private TextField TextAreaone;
    @FXML
    private TextField TextAreatwo;
    @FXML
    private ToggleButton BtnTonggle;
    @FXML
    private Label LabelNotifi;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     LabelNotifi.setText("Online");
    }    
    
   

    @FXML
    private void ConvertirModenaactual(ActionEvent event) {
        try {
        
                 if(TextAreaone.getText()=="" && TextAreatwo.getText()==""){
        JOptionPane.showMessageDialog(null, "Campos Vacios",  "Alerta!", 0);
        }else{ 
            
          if(TextAreaone.getText().isEmpty()==false && TextAreatwo.getText().isEmpty()==false){
              JOptionPane.showMessageDialog(null, "No se puede ingresar\n"+"Los dos datos",  "Alerta!", 0);  
          }else{
              
               int Modena1=Integer.parseInt( TextAreaone.getText());
             int Modena2=Integer.parseInt(TextAreatwo.getText());
        if(Modena1!=-1){
            System.out.println("Modena 1"+Modena1);
            
        }if(Modena2!=-1){
                System.out.println("Modena 2"+Modena2);
                 JOptionPane.showMessageDialog(null, "Dato incorrecto\n"+"Solo Enteros",  "Alerta!", 0); 
         }}
            
       
    }
        } catch (Exception e) {
            System.out.println(e);
            
        }
 
       
    
        TextAreaone.setText("");
        TextAreatwo.setText("");
        
    }

    @FXML
    private void SalirPrograma(ActionEvent event) {
        int resp = JOptionPane.showConfirmDialog(null, "Desea salir del programa\n"+"¿Esta seguro?",//<- EL MENSAJE
            "Alerta!"/*<- El título de la ventana*/, JOptionPane.YES_NO_OPTION/*Las opciones (si o no)*/, JOptionPane.WARNING_MESSAGE/*El tipo de ventana, en este caso WARNING*/);
           
       if(resp==0){
               JOptionPane.showMessageDialog(null, "Gracias por Utilizar Nuestra App");
            
        System.exit(0);
        }
    }

    @FXML
    private void TonggleOffline(ActionEvent event) {
       
         if(BtnTonggle.isSelected()==true){
             System.out.println( BtnTonggle.isSelected());
                LabelNotifi.setText("Offline");
          
               
         }else{
                  System.out.println( BtnTonggle.isSelected());
               LabelNotifi.setText("Oline");
               
         }
    }
    
}
