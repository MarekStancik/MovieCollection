/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviecollection.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import moviecollection.be.Category;

/**
 * FXML Controller class
 *
 * @author mads_
 */
public class AddEditViewController implements Initializable {

    @FXML
    private TextField movieTitle;
    @FXML
    private TextField movieYear;
    @FXML
    private ListView<Category> movieCat;
    @FXML
    private Button saveButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pressCancel(ActionEvent event) {
        Stage st = (Stage) saveButton.getScene().getWindow();
        st.close();
    }

    @FXML
    private void pressSave(ActionEvent event) {
        
        //add shit
        
        
        Stage st = (Stage) saveButton.getScene().getWindow();
        st.close();
    }
    
}
