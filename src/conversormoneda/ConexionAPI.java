/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversormoneda;

import Model.Moneda;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author fbacks
 */
public class ConexionAPI {
     ObservableList<Moneda> options = FXCollections.observableArrayList();
    
    //Contructor Vacio
    public  ConexionAPI(){
        
    }
    
    
    //metodo de para llenado Combobox
    public ObservableList ListaAPI(){
           
    
            return options;
    }
}
