/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseastring;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ranmack
 */
public class ReverseProgramController implements Initializable {

    @FXML
    private TextField InputField;
    @FXML
    private TextField OutputField;
    @FXML
    private Button GoButton;

   /*This method will take the string from the InputField, reverse the string, and
    display it within the OutputField TextField. 
    */
    
    public void reverseButtonPressed(){
        String reversedString = "";
        String inputText = InputField.getText();
        if (InputField.getText() == null)
        {
       
        }
        
        for (int i = inputText.length() - 1; i >= 0; i--){
            reversedString = reversedString + inputText.charAt(i);
           
        }
        OutputField.setText(reversedString);
    
        
    };
       
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
