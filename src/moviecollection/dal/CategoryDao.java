/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviecollection.dal;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import moviecollection.be.Category;

/**
 *
 * @author Marek
 */
public class CategoryDao
       
{
    private DbProvider conProvider;
    public CategoryDao(){
    conProvider = new DbProvider();
}
    
    private Category CategoryFromRs(ResultSet rs)
    {
        Category retval = null;
        try
        {
            retval = new Category(rs.getInt("ID"),rs.getString("Name"));
        } catch (SQLException ex)
        {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retval;
    }
    public List<Category> getlAllCategories() {
        
        List<Category> Categories = new ArrayList<>();
        try(Connection con = conProvider.getConnection())
        {
            String sqlStatement = "SELECT * FROM Playlists";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sqlStatement);
            while(rs.next())
            {
                Categories.add(CategoryFromRs(rs));
            }
        } catch (SQLServerException ex)
        {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Categories;
    
    }

    public void removeCategory(Category c){
        try (Connection con = conProvider.getConnection()){
            String sql = "DELETE FROM Playlists WHERE ID=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, c.getID());
            stmt.execute();
        }
        catch(SQLServerException ex){
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addCategory(Category c) {
        try (Connection con = conProvider.getConnection()){
            String sql = "INSERT INTO Categories (Name) VALUES (?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getName());
            stmt.execute();
        }
        catch(SQLServerException ex){
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
