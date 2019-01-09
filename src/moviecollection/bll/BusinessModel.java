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
import moviecollection.dal.DataAccess;
import moviecollection.dal.IDataAccess;

/**
 *
 * @author Marek
 */
public class BusinessModel implements IModel
{

    private IDataAccess dao;
    
    //Change for GITHUB
    public BusinessModel()
    {
        dao = new DataAccess();
    }
    
    @Override
    public List<Movie> getFilteredMovies(String filter)
    {
        return dao.getFilteredMovies(filter);
    }

    @Override
    public List<Movie> getFilteredMovies(MovieFilter filter)
    {
        return dao.getFilteredMovies(filter);
    }

    @Override
    public List<Movie> getAllMovies()
    {
        return dao.getAllMovies();
    }

    @Override
    public List<Category> getAllCategories()
    {
        return dao.getAllCategories();
    }

    @Override
    public void addMovie(Movie m)
    {
        dao.addMovie(m);
    }

    @Override
    public void removeMovie(Movie m)
    {
        dao.removeMovie(m);
    }

    @Override
    public void addCategory(Category c)
    {
        dao.addCategory(c);
    }

    @Override
    public void removeCategory(Category c)
    {
        dao.removeCategory(c);
    }

    @Override
    public void editMovie(Movie m)
    {
        dao.editMovie(m);
    }

    @Override
    public void setMovieRating(Movie m, short rating)
    {
        dao.setMovieRating(m,rating);
    }
    
}
