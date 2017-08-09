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
 * @author Rajasi
 */
public class CamMasterDAO extends BaseDAO{
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
    
     public boolean createAccount(Campaigns e)
    {
        try {
            connection=getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CamMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into bbbb.campaigns values(?,?,?,?)";
        
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,e.getName());
            preparedStatement.setString(2,e.getContact());
            preparedStatement.setString(3,e.getEmail());
            preparedStatement.setString(4,e.getCampaigns());
           
            
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
            Logger.getLogger(CamMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;  
    }

    public List<Campaigns> displaylist() {
        
        ArrayList<Campaigns> addlist=new ArrayList<>();
        
        String sql;
        sql = "select * from bbbb.campaigns";
        try {
            connection = getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CamMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preparedStatement=connection.prepareStatement(sql);
          
            rs=preparedStatement.executeQuery();
            while(rs.next())
            {   Campaigns c  = new Campaigns();
                System.out.println("test");
                
                c.setName(rs.getString(1));
                c.setContact(rs.getString(2));
                c.setEmail(rs.getString(3));
                c.setCampaigns(rs.getString(4));
                addlist.add(c);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CamMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return addlist;
        

    } 

 
     
}
