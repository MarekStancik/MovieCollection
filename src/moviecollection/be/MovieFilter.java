/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviecollection.be;

import java.util.List;

/**
 *
 * @author Marek
 */
public class MovieFilter
{
    public enum SortType { Title, Category, Rating , ID};
    private String title;
    private short rating;
    private List<Category> categories;
    private SortType order;
    
    
}
