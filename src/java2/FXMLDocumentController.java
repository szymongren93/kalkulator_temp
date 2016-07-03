/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField x;
    
    @FXML
    private RadioButton fahz;
    @FXML
    private RadioButton celz;
    @FXML
    private RadioButton kelz;
    
    
    @FXML
    private RadioButton fahna;
    @FXML
    private RadioButton celna;
    @FXML
    private RadioButton kelna;
            
      
    
    
    @FXML
    @SuppressWarnings("empty-statement")
    private void handleButtonAction(ActionEvent event) {
        
        
        String y = x.getText();
        //int war = Integer.parseInt(y);
       // int exit = 0;
        
        double war = Double.parseDouble(y);
        double exit = 0;
        
        if(fahz.isSelected()) {          
        if(fahna.isSelected()) {exit=war;} 
        else if(celna.isSelected()) {exit=((war-32)*5)/9;}
        else if(kelna.isSelected()) {exit=(((war-32)*5)/9)+273.15;}
            }
        
                if(celz.isSelected()) {          
        if(fahna.isSelected()) {exit=(war*1.8)+32;} 
        else if(celna.isSelected()) {exit=war;}
        else if(kelna.isSelected()) {exit=war+273.15;}
            }
        
        
                if(kelz.isSelected()) {          
        if(fahna.isSelected()) {exit=(war*1.8)-459.67;} 
        else if(celna.isSelected()) {exit=war-273.15;}
        else if(kelna.isSelected()) {exit=war;}
            }
        
        
        
        exit *= 100;
        exit = Math.round(exit);
        exit /= 100;
        
        
     String wynik = Double.toString(exit);
        label.setText(wynik);
        
        
        
    }
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
