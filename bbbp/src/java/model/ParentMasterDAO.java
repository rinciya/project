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
public class ParentMasterDAO extends BaseDAO{
     Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
public List<Parent> displaylist(String email)
     {      ArrayList<Parent> addlist=new ArrayList<Parent>();
           // String sql="select * from bbbb.adopt where ngoemail= ? ";
            String sql="select * from bbbb.adopt r inner join ngo n on r.ngoemail=n.noo where n.email= ? ";
             try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ParentMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ParentMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             try {
               
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            rs=preparedStatement.executeQuery();    //For select query.To find no of rows affected use executeUpdate() ie return type string
            while(rs.next())
            {   Parent p  = new Parent();
                System.out.println("test");
                 
            p.setMale(rs.getString(1));
            p.setMage(rs.getInt(2));
            p.setFemale(rs.getString(3));
            p.setFage(rs.getInt(4));
            p.setAddress(rs.getString(5));
            p.setEmail(rs.getString(6));
            p.setTno(rs.getInt(7));
            p.setMno(rs.getInt(8));
            p.setMprofession(rs.getString(9));
            p.setMm(rs.getInt(10));
            p.setFprofession(rs.getString(11));
            p.setFm(rs.getInt(12));
            p.setReason(rs.getString(13));
            p.setGirlname(rs.getString(14));
            p.setNgoname(rs.getString(15));
                
              
                addlist.add(p);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ParentMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             return addlist;
     }
     
    
}
