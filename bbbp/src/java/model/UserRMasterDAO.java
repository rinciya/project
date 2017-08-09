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
 * @author PAVILION
 */
public class UserRMasterDAO extends BaseDAO {
    
Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
   
    public boolean createAccount(UserR n) 
    {
        try {
            connection = getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserRMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into bbbb.userr values(?,?,?,?,?,?,?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,n.getNAME());
            preparedStatement.setString(2,n.getADDRESS());
            preparedStatement.setString(3,n.getGENDER());
            preparedStatement.setString(4,n.getEMAILID());
           
            preparedStatement.setString(5,n.getPASSWORD());
             preparedStatement.setInt(6,n.getAGE());
              preparedStatement.setInt(7,n.getCONTACTNO());
               
        
                int count = preparedStatement.executeUpdate();
                
                if(count>0)
                {
                    System.out.println("Successfully Inserted");
                    return true;
                }else{
                    System.out.println("Insertion failed");
                    return false;
                }
                } catch (SQLException ex) {
                    Logger.getLogger(UserRMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        return false;
        
    }
    public  boolean checkLogin(UserR u)
    {
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select * from bbbb.userr where EMAILID=? AND PASSWORD= ?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,u.getEMAILID());
                
                preparedStatement.setString(2,u.getPASSWORD());
            
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

