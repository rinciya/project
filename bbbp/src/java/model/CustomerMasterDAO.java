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
 * @author universe
 */
public class CustomerMasterDAO extends BaseDAO {
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
   
    public boolean createAccount(Customer c) 
    {
        try{
        connection = getConnection();}
        catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
        catch(SQLException ex)
        {
        Logger.getLogger(CustomerMasterDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        String sql = "insert into bbbb.volunteer values(?,?,?,?,?,?,?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,c.getName());
            preparedStatement.setString(2,c.getPassword());
            preparedStatement.setString(3,c.getAddress());
            preparedStatement.setString(4,c.getGender());
            preparedStatement.setInt(5,c.getAge());
            preparedStatement.setInt(6,c.getMno());
            preparedStatement.setString(7,c.getEmail());
        
                int count = preparedStatement.executeUpdate();
                
                if(count>0)
                {
                    System.out.println("Successfully Inserted");
                    return true;
                }else{
                    System.out.println("insertion failed");
                    return false;
                }
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        return false;
        
        
    }
    public  boolean checkLogin(Customer c)
    {
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select * from bbbb.volunteer where vemail=? AND vpassword= ?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,c.getEmail());
                
                preparedStatement.setString(2,c.getPassword());
            
                rs=preparedStatement.executeQuery();
                while( rs.next())
              {
              return true;
              }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         return false;
    }

  
   
}
