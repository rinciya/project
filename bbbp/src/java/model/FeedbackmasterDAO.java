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
public class FeedbackmasterDAO extends BaseDAO{
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
   
    public boolean register(Feedback f) 
    {
        try{
        connection = getConnection();}
        catch (ClassNotFoundException ex) {
            Logger.getLogger(FeedbackmasterDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
        catch(SQLException ex)
        {
        Logger.getLogger(FeedbackmasterDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        String sql = "insert into bbbb.feedback values(?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,f.getFeedback());
           
        
                int count = preparedStatement.executeUpdate();
                
                if(count>0)
                {
                    System.out.println("Successfully Inserted");
                    return true;
                }else{
                    System.out.println("insertion failed");
                }
                } catch (SQLException ex) {
                    Logger.getLogger(FeedbackmasterDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        return false;
        
        
    }
}
