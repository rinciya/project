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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PAVILION
 */
public class EventRegMasterDAO extends BaseDAO {
  Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
   
    
    
    
    
    
    public boolean createAccount(EventRegister f) 
    {
         
        try {
            connection = getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EventRegMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into bbbb.register values(?,?,?,?,?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,f.getVname());
            preparedStatement.setString(2,f.getVemail());
            preparedStatement.setString(3,f.getCampaign());
            preparedStatement.setInt(4,f.getVmno());
            preparedStatement.setString(5,f.getNgoname());
               
        
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
                    Logger.getLogger(EventRegMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        return false;
        
    }
    public List<EventRegister> displaylist(String email)
     {      ArrayList<EventRegister> addlist=new ArrayList<EventRegister>();
           // String sql="select * from bbbb.register where ngoemail= ? ";
     String sql="select * from bbbb.register r inner join ngo n on r.ngoemail=n.noo where n.email= ? ";
             try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EventRegMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EventRegMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             try {
               
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            rs=preparedStatement.executeQuery();    //For select query.To find no of rows affected use executeUpdate() ie return type string
            while(rs.next())
            {  EventRegister e  = new EventRegister();
                System.out.println("test");
                 
            e.setVname(rs.getString(1));
            e.setVemail(rs.getString(2));
            e.setCampaign(rs.getString(3));
            e.setVmno(rs.getInt(4));
            e.setNgoname(rs.getString(5));
                addlist.add(e);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EventRegMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             return addlist;
     }

    
}
