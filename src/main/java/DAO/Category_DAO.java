package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DLCH
 */
public class Category_DAO extends dbConnector{
    public ArrayList<String> list() {
        ArrayList<String> list = new ArrayList();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM category");
            
            while (rs.next()) {
                list.add(rs.getString("CategoryName"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Category_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public boolean insert(String cateName) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO category(CategoryName) VALUES ('"+cateName+"')");
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Category_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean delete(String cateName) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM category WHERE CategoryName = '"+cateName+"'");
            pst.executeUpdate();
            
            PreparedStatement pst1 = conn.prepareStatement("UPDATE product SET Category = 'none' WHERE Category = '"+cateName+"'");
            pst1.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Category_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
