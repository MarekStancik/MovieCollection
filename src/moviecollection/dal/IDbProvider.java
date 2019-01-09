/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviecollection.dal;

import java.sql.Connection;

/**
 *
 * @author Marek
 */
public interface IDbProvider
{
    public Connection getConnection();
}
