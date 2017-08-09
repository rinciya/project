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
public class FundMasterDAO extends BaseDAO{

     Connection connection;
    PreparedStatement preparedStatement,stmt;
    Statement statement;
    ResultSet rs;
   
    
    
    
    
    
    public boolean createAccount(Fund f) 
    {
         
        try {
            connection = getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FundMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into bbbb.donation(email,name,phno,amt,ngoname) values(?,?,?,?,?)";
        String sq = "update bbbb.amount set fund = ( fund + ? ) where ngoname= ? ";
   
        try {
            preparedStatement= connection.prepareStatement(sql);
            stmt = connection.prepareStatement(sq);
         preparedStatement.setString(1,f.getEmail());
            preparedStatement.setString(2,f.getName());
            preparedStatement.setInt(3,f.getPhno());
            preparedStatement.setInt(4,f.getAmt());
            preparedStatement.setString(5,f.getNgoname());
            stmt.setInt(1,f.getAmt());
            stmt.setString(2,f.getNgoname());
               stmt.executeUpdate();
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
                    Logger.getLogger(FundMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        return false;
       }
       public List<Fund> displaylist(String email)
     {      ArrayList<Fund> addlist=new ArrayList<Fund>();
           // String sql="select * from bbbb.donation where ngoname= ? ";
     String sql="select * from bbbb.donation r inner join ngo n on r.ngoname=n.noo where n.email= ? ";
             try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FundMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FundMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             try {
               
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            rs=preparedStatement.executeQuery();    //For select query.To find no of rows affected use executeUpdate() ie return type string
            while(rs.next())
            {  Fund f  = new Fund();
                System.out.println("test");
                 
           
            f.setEmail(rs.getString(1));
             f.setName(rs.getString(2));
             f.setPhno(rs.getInt(3));
            f.setAmt(rs.getInt(4));
            f.setNgoname(rs.getString(5));
                addlist.add(f);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EventRegMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             return addlist;
     }
} 
