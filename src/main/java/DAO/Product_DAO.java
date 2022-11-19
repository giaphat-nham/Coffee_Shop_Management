package DAO;

import DTO.Product_DTO;
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
public class Product_DAO extends dbConnector{
    public ArrayList<Product_DTO> list() {
        ArrayList<Product_DTO> list = new ArrayList();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM product");
            
            while (rs.next()) {
                list.add(new Product_DTO(rs.getInt("ProductID"),rs.getString("ProductName"),rs.getInt("Price"),rs.getString("Category")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public boolean insert(Product_DTO product) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO product(ProductName,Price,Category) VALUES('"+product.getName()+"',"+product.getPrice()+",'"+product.getCategory()+"')");
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("An error has occured at isert method in Product_DAO class");
            return false;
        }
        return true;
    }
    
    public boolean delete(int id) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM product WHERE ProductID = "+id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("An error has occured at isert method in Product_DAO class");
            return false;
        }
        return true;
    }
    
    public boolean update(Product_DTO product) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE product SET ProductName = '"+product.getName()+"', Price = "+
                    product.getPrice()+", Category = '"+product.getCategory()+"' WHERE ProductID = "+product.getId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("An error has occured at isert method in Product_DAO class");
            return false;
        }
        return true;
    }
    
    public ArrayList<Product_DTO> search(String key, String filter) {
        ArrayList<Product_DTO> result = new ArrayList();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs;
            
            switch (filter) {
                case "Mã sản phẩm":
                    rs = stm.executeQuery("SELECT * FROM product WHERE ProductID = "+key);
                    break;
                case "Tên sản phẩm":
                    rs = stm.executeQuery("SELECT * FROM product WHERE ProductName LIKE '%"+key+"%'");
                    break;
                case "Loại sản phẩm":
                    rs = stm.executeQuery("SELECT * FROM product WHERE Category LIKE '%"+key+"%'");
                    break;
                default:
                    rs = stm.executeQuery("SELECT * FROM product");
            }//switch
            
            while (rs.next()) {
                result.add(new Product_DTO(rs.getInt("ProductID"),rs.getString("ProductName"),rs.getInt("Price"),rs.getString("Category")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
