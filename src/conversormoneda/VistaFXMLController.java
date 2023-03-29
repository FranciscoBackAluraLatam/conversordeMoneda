/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package conversormoneda;

import Model.Moneda;
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
    private ComboBox<Moneda> CboxDivisa;
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
  

    //Metodo para recibe el text area y los covierte en enteros
    @FXML
    private void ConvertirModenaactual(ActionEvent event) {

        try {

            if ("".equals(TextAreaone.getText()) && "".equals(TextAreatwo.getText())) {
                JOptionPane.showMessageDialog(null, "Campos Vacios", "Alerta!", 0);
            } else {

                if (TextAreaone.getText().isEmpty() == false && TextAreatwo.getText().isEmpty() == false) {
                    JOptionPane.showMessageDialog(null, """
                                                  No se puede ingresar
                                                  Los dos datos""", "Alerta!", 0);
                } else {
                    if (TextAreaone.getText().isEmpty() == false) {
                        int Modena1 = Integer.parseInt(TextAreaone.getText());

                        System.out.println("Modena 1" + Modena1);

                    }
                    if (TextAreatwo.getText().isEmpty() == false) {
                        int Modena2 = Integer.parseInt(TextAreatwo.getText());
                        System.out.println("Modena 2" + Modena2);

                    }

                }
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, """
                                                 Dato incorrecto
                                                 Solo Enteros""", "Alerta!", 0);

        }

        TextAreaone.setText("");
        TextAreatwo.setText("");

    }

    @FXML
    private void SalirPrograma(ActionEvent event) {
        int resp = JOptionPane.showConfirmDialog(null, "Desea salir del programa\n" + "¿Esta seguro?",//<- EL MENSAJE
                "Alerta!"/*<- El título de la ventana*/, JOptionPane.YES_NO_OPTION/*Las opciones (si o no)*/, JOptionPane.WARNING_MESSAGE/*El tipo de ventana, en este caso WARNING*/);

        if (resp == 0) {
            JOptionPane.showMessageDialog(null, "Gracias por Utilizar Nuestra App");

            System.exit(0);
        }
    }

    @FXML
    private void TonggleOffline(ActionEvent event) {

        if (BtnTonggle.isSelected() == true) {
            System.out.println(BtnTonggle.isSelected());
            LabelNotifi.setText("Offline");
           CboxDivisa.getItems().addAll(new Moneda());

        } else {
            System.out.println(BtnTonggle.isSelected());
            LabelNotifi.setText("Oline");

        }
    }

}
