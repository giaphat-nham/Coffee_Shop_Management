/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.Staff_DAO;
import DTO.Staff_DTO;
import java.util.ArrayList;

/**
 *
 * @author DLCH
 */
public class Staff_BUS {
    Staff_DAO dao = new Staff_DAO();
    
    public ArrayList<Staff_DTO> list() {
        return dao.list();
    }
    
    public boolean insert(Staff_DTO staff) {
        return dao.insert(staff);
    }
    
    public boolean delete(int id) {
        return dao.delete(id);
    }
    
    public boolean update(Staff_DTO staff) {
        return dao.update(staff);
    }
    
    public ArrayList<Staff_DTO> search(String key, String filter) {
        return dao.search(key, filter);
    }
}
