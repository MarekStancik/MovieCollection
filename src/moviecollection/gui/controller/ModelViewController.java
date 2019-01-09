/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviecollection.gui.controller;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import moviecollection.be.Category;
import moviecollection.be.Movie;
import moviecollection.be.MovieFilter;
import moviecollection.bll.BusinessModel;
import moviecollection.bll.IModel;

/**
 *
 * @author Marek
 */
public class ModelViewController
{
    private ObservableList<Movie> movieList;
    private ObservableList<Category> categoryList;
    private IModel model;
    
    public ModelViewController()
    {
        model = new BusinessModel();
        movieList = FXCollections.observableArrayList(model.getAllMovies());
        categoryList = FXCollections.observableArrayList(model.getAllCategories());
    }
    
    public void setMovieFilter(String filter)
    {
        movieList.setAll(model.getFilteredMovies(filter));
    }
    
    public List<Movie> getFilteredMovies(MovieFilter filter)
    {
        
    }
    
    public List<Movie> getMovieList();
    List<Category> getAllCategories();
    void addMovie(Movie m);
    void removeMovie(Movie m);
    void addCategory(Category c);
    void removeCategory(Category c);
    void setMovieCategories(Movie m,Category[] categories);
    void setMovieRating(Movie m,short rating);
    
    
}
