/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.Statistic_DAO;
import DTO.ProductStatistic_DTO;
import DTO.SaleStatistic_DTO;
import java.util.ArrayList;

/**
 *
 * @author DLCH
 */
public class Statistic_BUS {
    Statistic_DAO dao = new Statistic_DAO();
    
    public ArrayList<SaleStatistic_DTO> sales() {
        return dao.sales();
    }
    
    public ArrayList<ProductStatistic_DTO> productStatistic() {
        return dao.productStatistic();
    }
    
    public int phaCheCount() {
        return dao.phaCheCount();
    }
    
    public int phucVuCount(){
        return dao.phucVuCount();
    }
    
    public int quanLyCount() {
        return dao.quanLyCount();
    }
    
    public int totalSalary() {
        return dao.totalSalary();
    }
}
