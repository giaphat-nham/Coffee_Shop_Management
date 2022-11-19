/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.Category_DAO;
import java.util.ArrayList;

/**
 *
 * @author DLCH
 */
public class Category_BUS {
    Category_DAO dao = new Category_DAO();
    
    public ArrayList<String> list() {
        return dao.list();
    }
}
