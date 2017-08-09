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
public class amountDAO extends BaseDAO {
      Connection connection;
    PreparedStatement preparedStatement,stmt;
    Statement statement;
    ResultSet rs;
    
    public amount displaylist(String email)
     {      amount a=new amount();
           // String sql="select * from bbbb.donation where ngoname= ? ";
     String sql="select fund from bbbb.amount r inner join ngo n on r.ngoname=n.noo where n.email= ? ";
             try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(amountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(amountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             try {
               
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            rs=preparedStatement.executeQuery();    //For select query.To find no of rows affected use executeUpdate() ie return type string
            while(rs.next())
            {  amount an  = new amount();
                System.out.println("test");
                 
           
            
            a.setFund(rs.getInt(1));
           
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EventRegMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             return a;
     }
    
}
