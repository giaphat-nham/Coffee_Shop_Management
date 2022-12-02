/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ProductStatistic_DTO;
import DTO.SaleStatistic_DTO;
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
public class Statistic_DAO extends dbConnector{
    public ArrayList<SaleStatistic_DTO> sales() {
        ArrayList<SaleStatistic_DTO> list = new ArrayList();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT bill.Date, SUM(bill.Total) AS 'Sales' FROM bill GROUP BY bill.Date");
            
            while (rs.next()) {
                java.util.Date date = new java.util.Date(rs.getDate("Date").getTime());
                list.add(new SaleStatistic_DTO(date,rs.getInt("Sales")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistic_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
    public ArrayList<ProductStatistic_DTO> productStatistic() {
        ArrayList<ProductStatistic_DTO> list = new ArrayList();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT dt.ProductID, p.ProductName, SUM(dt.Quantity) AS 'SaleCount' FROM product p, billdetails dt WHERE p.ProductID = dt.ProductID GROUP BY dt.ProductID, p.ProductName");
            
            while (rs.next()) {
                list.add(new ProductStatistic_DTO(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("SaleCount")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistic_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public int phaCheCount() {
        int count = 0;
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT COUNT(StaffID) as 'Count' FROM staff WHERE Type = 'Pha chế'");
            
            if (rs.next()) {
                count = rs.getInt("Count");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistic_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        return count;
    }
    
    public int phucVuCount() {
        int count = 0;
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT COUNT(StaffID) as 'Count' FROM staff WHERE Type = 'Phục vụ'");
            
            if (rs.next()) {
                count = rs.getInt("Count");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistic_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        return count;
    }
    
    public int quanLyCount() {
        int count = 0;
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT COUNT(StaffID) as 'Count' FROM staff WHERE Type = 'Quản lý'");
            
            if (rs.next()) {
                count = rs.getInt("Count");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistic_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        return count;
    }
    
    public int totalSalary() {
        int salary = 0;
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT SUM(Salary) as 'SalarySum' FROM staff");
            
            if(rs.next()) {
                salary = rs.getInt("SalarySum");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistic_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        return salary;
    }
}
