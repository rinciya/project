/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rinciya
 */
public class UserMasterDAO extends BaseDAO {
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
     public  boolean checkLogin(User u)
    {
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select * from bbbb.user where EMAIL=? AND PASSWORD= ?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,u.getEmail());
                
                preparedStatement.setString(2,u.getPassword());
            
                rs=preparedStatement.executeQuery();
                while( rs.next())
              {
              return true;
              }
        } catch (SQLException ex) {
            Logger.getLogger(UserMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         return false;
    }
    
}
