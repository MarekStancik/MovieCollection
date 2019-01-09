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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import moviecollection.be.Category;
import moviecollection.be.Movie;

/**
 *
 * @author Marek
 */
public class MainViewController implements Initializable
{
    
    private Label label;
    @FXML
    private ToggleGroup filter;
    @FXML
    private ListView<Category> catList;
    @FXML
    private ListView<Movie> movieList;
    @FXML
    private Label movieTitle;
    @FXML
    private Text movieDesc;
    @FXML
    private ProgressBar ratingBar;
    @FXML
    private Label rating;
    
    private ModelViewController model;
    
    private void handleButtonAction(ActionEvent event)
    {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        model = new ModelViewController();
        // TODO
    }    

    @FXML
    private void radioAll(ActionEvent event)
    {
    }

    @FXML
    private void radioOne(ActionEvent event)
    {
    }

    @FXML
    private void orderByTitle(ActionEvent event)
    {
    }

    @FXML
    private void orderByCat(ActionEvent event)
    {
    }

    @FXML
    private void orderByRating(ActionEvent event)
    {
    }

    @FXML
    private void searchCat(KeyEvent event)
    {
    }

    @FXML
    private void addCat(ActionEvent event)
    {
    }

    @FXML
    private void removeCat(ActionEvent event)
    {
    }

    @FXML
    private void searchMovies(KeyEvent event)
    {
    }

    @FXML
    private void addMovie(ActionEvent event)
    {
    }

    @FXML
    private void removeMovie(ActionEvent event)
    {
    }

    @FXML
    private void editMovie(ActionEvent event)
    {
    }

    @FXML
    private void pressPlay(ActionEvent event)
    {
    }
    
}
