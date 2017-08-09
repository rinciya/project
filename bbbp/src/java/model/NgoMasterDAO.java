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
public class NgoMasterDAO extends BaseDAO {
    Connection connection;
    PreparedStatement preparedStatement,ps;
    Statement statement;
    ResultSet rs;
     public  boolean checkLogin(Ngo n)
    {
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NgoMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NgoMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select * from bbbb.ngo where email=? AND password= ?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,n.getEmail());
                
                preparedStatement.setString(2,n.getPassword());
            
                rs=preparedStatement.executeQuery();
                while( rs.next())
              {
              return true;
              }
        } catch (SQLException ex) {
            Logger.getLogger(NgoMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         return false;
    }
        public boolean createAccount(Ngo n) 
    {
        try {
            connection = getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NgoMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into bbbb.ngo(ngoid,state,district,regno,noo,email,password,phno,address,acti) values(?,?,?,?,?,?,?,?,?,?)";
       String sq = "insert into bbbb.amount(ngoname,fund) values(?,00000)";
        try {
            preparedStatement= connection.prepareStatement(sql);
             ps= connection.prepareStatement(sq);
            preparedStatement.setInt(1,n.getNgoid());
            preparedStatement.setString(2,n.getState());
            preparedStatement.setString(3,n.getDistrict());
            preparedStatement.setInt(4,n.getRegno());
            preparedStatement.setString(5,n.getNoo());
            preparedStatement.setString(6,n.getEmail());
             preparedStatement.setString(7,n.getPassword());
              preparedStatement.setInt(8,n.getPhno());
              preparedStatement.setString(9,n.getAddress());
               preparedStatement.setString(10,n.getActi());
               ps.setString(1,n.getNoo());
              
        
                int count = preparedStatement.executeUpdate();
                ps.executeUpdate();
                if(count>0)
                {
                    System.out.println("Successfully Inserted");
                    return true;
                }else{
                    System.out.println("Insertion failed");
                    return false;
                }
                } catch (SQLException ex) {
                    Logger.getLogger(NgoMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        return false;
        
    }

}
