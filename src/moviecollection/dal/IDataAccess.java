/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviecollection.dal;

import java.util.List;
import moviecollection.be.Category;
import moviecollection.be.Movie;
import moviecollection.be.MovieFilter;

/**
 *
 * @author Marek
 */
public interface IDataAccess
{
    public List<Movie> getFilteredMovies(String filter);
    public List<Movie> getFilteredMovies(MovieFilter filter);
    public List<Movie> getAllMovies();
    public List<Category> getAllCategories();
    public void addMovie(Movie movie);
    public void removeMovie(Movie movie);
    public void addCategory(Category category);
    public void removeCategory(Category category);
    public void editMovie(Movie movie);
    public void setMovieRating(Movie movie, short rating);
}
