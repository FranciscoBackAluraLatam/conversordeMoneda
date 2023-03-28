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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ConvertirModenaactual(ActionEvent event) {
    }

    @FXML
    private void SalirPrograma(ActionEvent event) {
        
              JOptionPane.showMessageDialog(null, "Gracias por Utilizar Nuestra App");
        System.exit(0);
    }
    
}
