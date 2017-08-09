package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BaseDAO;
import model.Ngogirl;

public class NgogirlMasterDAO extends BaseDAO {
  
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
   
    
public boolean createAccount(Ngogirl n) 
    {
        try {
            connection = getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NgogirlMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into bbbb.girlsdetails values(?,?,?,?,?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,n.getGname());
            preparedStatement.setInt(2,n.getGage());
            preparedStatement.setString(3,n.getPursuing());
            preparedStatement.setString(4,n.getAbout());
            preparedStatement.setString(5,n.getNoo());
               
        
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
                    Logger.getLogger(NgogirlMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        return false;
        
    }}