/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviecollection.bll;

import java.util.List;
import moviecollection.be.Category;
import moviecollection.be.Movie;
import moviecollection.be.MovieFilter;

/**
 *
 * @author Marek
 */
public interface IModel
{
    List<Movie> getFilteredMovies(String filter);
    List<Movie> getFilteredMovies(MovieFilter filter);
    List<Movie> getAllMovies();
    List<Category> getAllCategories();
    void addMovie(Movie m);
    void removeMovie(Movie m);
    void addCategory(Category c);
    void removeCategory(Category c);
    void editMovie(Movie m);
    void setMovieRating(Movie m,short rating);
}
