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
public class AdoptMasterDAO extends BaseDAO{
     Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
   
    public boolean register(Adopt u) 
    {
        try{
        connection = getConnection();}
        catch (ClassNotFoundException ex) {
            Logger.getLogger(AdoptMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
        catch(SQLException ex)
        {
        Logger.getLogger(AdoptMasterDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        String sql = "insert into bbbb.adopt values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,u.getMale());
            preparedStatement.setInt(2,u.getMage());
            preparedStatement.setString(3,u.getFemale());
            preparedStatement.setInt(4,u.getFage());
            preparedStatement.setString(5,u.getAddress());
            preparedStatement.setString(6,u.getEmail());
            preparedStatement.setInt(7,u.getTno());
            preparedStatement.setInt(8,u.getMno());
            preparedStatement.setString(9,u.getMprofession());
            preparedStatement.setInt(10,u.getMm());
            preparedStatement.setString(11,u.getFprofession());
            preparedStatement.setInt(12,u.getFm());
            preparedStatement.setString(13,u.getReason());
            preparedStatement.setString(14,u.getGirlname());
            preparedStatement.setString(15,u.getNgoname());
        
                int count = preparedStatement.executeUpdate();
                
                if(count>0)
                {
                    System.out.println("Successfully Inserted");
                    return true;
                }else{
                    System.out.println("insertion failed");
                }
                } catch (SQLException ex) {
                    Logger.getLogger(AdoptMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        return false;
        
        
    }
    
}
