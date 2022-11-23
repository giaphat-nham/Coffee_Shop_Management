/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Staff_DTO;
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
public class Staff_DAO extends dbConnector {

    public ArrayList<Staff_DTO> list() {
        ArrayList<Staff_DTO> list = new ArrayList();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM staff");

            while (rs.next()) {
                list.add(new Staff_DTO(rs.getInt("StaffID"), rs.getString("StaffName"), rs.getInt("YoB"), rs.getString("Gender"), rs.getInt("Phone"), rs.getInt("Salary"), rs.getString("Type")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Staff_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public boolean insert(Staff_DTO staff) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO staff(StaffName,YoB,Gender,Phone,Salary,Type) VALUES ('"
                    + staff.getName() + "'," + staff.getYob() + ",'" + staff.getGender() + "'," + staff.getPhone() + "," + staff.getSalary() + ",'" + staff.getType() + "')");
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Staff_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean delete(int id) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM staff WHERE StaffID = " + id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Staff_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean update(Staff_DTO staff) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE staff SET StaffName = '" + staff.getName() + "', YoB = " + staff.getYob()
                    + " , Gender = '" + staff.getGender() + "', Phone = " + staff.getPhone() + ", Salary = " + staff.getSalary() + ", Type = '" + staff.getType() + "' "
                    + "WHERE StaffID = " + staff.getId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Staff_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public ArrayList<Staff_DTO> search(String key, String filter) {
        ArrayList<Staff_DTO> list = new ArrayList();
        ResultSet rs;
        try {
            Statement stm = conn.createStatement();

            switch (filter) {
                case "Mã nhân viên":
                    rs = stm.executeQuery("SELECT * FROM staff WHERE StaffID = " + key);
                    break;
                case "Giới tính":
                    rs = stm.executeQuery("SELECT * FROM staff WHERE Gender LIKE '%" + key + "%'");
                    break;
                case "Loại nhân viên":
                    rs = stm.executeQuery("SELECT * FROM staff WHERE Type LIKE '%" + key + "%'");
                    break;
                case "Tên nhân viên":
                    rs = stm.executeQuery("SELECT * FROM staff WHERE StaffName LIKE '%" + key + "%'");
                    break;
                default:
                    rs = stm.executeQuery("SELECT * FROM staff");
            }//switch
            
            while (rs.next()) {
                list.add(new Staff_DTO(rs.getInt("StaffID"), rs.getString("StaffName"), rs.getInt("YoB"),rs.getString("Gender"), rs.getInt("Phone"), rs.getInt("Salary"), rs.getString("Type")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Staff_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
