/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rinciya
 */
public class ExpMasterDAO extends BaseDAO {
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
    
     public boolean createAccount(Experiences e)
    {
        try {
            connection=getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ExpMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into bbbb.experiences values(?,?,?)";
        
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,e.getName());
            preparedStatement.setString(2,e.getEmail());
            preparedStatement.setString(3,e.getComments());
           
            
            int count = preparedStatement.executeUpdate();
            if(count>0)
            {
                System.out.println("Successfully Inserted");
                return true;
            }
            else
            {
                System.out.println("Insertion failed");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExpMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;  
    }

    public List<Experiences> printComments() {
        
        ArrayList<Experiences> addlist=new ArrayList<>();
        
        String sql;
        sql = "select * from bbbb.experiences";
        try {
            connection = getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ExpMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preparedStatement=connection.prepareStatement(sql);
          
            rs=preparedStatement.executeQuery();
            while(rs.next())
            {   Experiences c  = new Experiences();
                System.out.println("test");
                
                c.setName(rs.getString(1));
                c.setEmail(rs.getString(2));
                c.setComments(rs.getString(3));
                addlist.add(c);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExpMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return addlist;
        

    } 

 
}
