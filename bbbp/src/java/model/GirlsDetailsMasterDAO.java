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
public class GirlsDetailsMasterDAO extends BaseDAO{
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
public List<GirlsDetails> displaylist()
     {      ArrayList<GirlsDetails> addlist=new ArrayList<GirlsDetails>();
            String sql="select * from bbbb.girlsdetails";
             try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GirlsDetailsMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GirlsDetailsMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             try {
            preparedStatement=connection.prepareStatement(sql);
          
            rs=preparedStatement.executeQuery();    //For select query.To find no of rows affected use executeUpdate() ie return type string
            while(rs.next())
            {   GirlsDetails g  = new GirlsDetails();
                System.out.println("test");
                
                g.setGname(rs.getString(1));
                g.setGage(rs.getInt(2));
                g.setPersuring(rs.getString(3));
                g.setAbout(rs.getString(4));
                g.setNgoname(rs.getString(5));
                addlist.add(g);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GirlsDetailsMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             return addlist;
     }
     
    
}
