/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.Product_DAO;
import DTO.Product_DTO;
import java.util.ArrayList;

/**
 *
 * @author DLCH
 */
public class Product_BUS {
    private Product_DAO dao = new Product_DAO();
    
    public ArrayList<Product_DTO> list() {
        return dao.list();
    }
    
    public boolean insert(Product_DTO product) {
        return dao.insert(product);
    }
    
    public boolean update(Product_DTO product) {
        return dao.update(product);
    }
    
    public boolean delete(int id) {
        return dao.delete(id);
    }
    
    public ArrayList<Product_DTO> search(String key, String filter) {
        return dao.search(key, filter);
    }
    
    public ArrayList<Product_DTO> search(String key,ArrayList<Product_DTO> list) {
        ArrayList<Product_DTO> result = new ArrayList();
        
        for (Product_DTO pd : list) {
            if (pd.getName().toLowerCase().contains(key.toLowerCase())) {
                result.add(pd);
            }
        }
        
        return result;
    }
}
