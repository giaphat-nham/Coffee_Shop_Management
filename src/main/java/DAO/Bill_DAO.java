/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.BillDetails_DTO;
import DTO.Bill_DTO;
import java.sql.Date;
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
public class Bill_DAO extends dbConnector{
    public ArrayList<Bill_DTO> list() {
        ArrayList<Bill_DTO> list = new ArrayList();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM bill");
            
            while (rs.next()) {
                int id = rs.getInt("BillID");
                java.util.Date date = new java.util.Date(rs.getDate("Date").getTime());
                int total = rs.getInt("Total");
                int staffID = rs.getInt("StaffID");
                
                list.add(new Bill_DTO(id, date, total, staffID));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bill_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public ArrayList<BillDetails_DTO> getDetails(int billID) {
        ArrayList<BillDetails_DTO> list = new ArrayList();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM billdetails WHERE BillID = "+billID);
            
            while (rs.next()) {
                list.add(new BillDetails_DTO(rs.getInt("BillID"),rs.getInt("ProductID"),rs.getInt("Price"),rs.getInt("Quantity")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bill_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public boolean insertBill(Bill_DTO bill) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO bill(Date,Total,StaffID) VALUES (?,?,?)");
            pst.setDate(1, (Date) bill.getDate());
            pst.setInt(2,bill.getTotal());
            pst.setInt(3,bill.getStaffID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Bill_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean deleteBill(int id) {
        try {
            PreparedStatement pst1 = conn.prepareStatement("DELETE FROM billdetails WHERE BillID = ?");
            pst1.setInt(1,id);
            pst1.executeUpdate();
            
            PreparedStatement pst = conn.prepareStatement("DELETE FROM bill WHERE BillID = ?");
            pst.setInt(1,id);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Bill_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean insertBillDetail(BillDetails_DTO detail) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO billdetails(BillID,ProductID,Price,Quantity) VALUES (?,?,?,?)");
            pst.setInt(1, detail.getBillID());
            pst.setInt(2, detail.getProductID());
            pst.setInt(3, detail.getPrice());
            pst.setInt(4, detail.getQuantity());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Bill_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public int getLatestBillID () {
        int billID = 0;
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT  * FROM bill ORDER BY BillID DESC");
            
            if (rs.next()) {
                billID = rs.getInt("BillID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bill_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return billID;
    }
}
