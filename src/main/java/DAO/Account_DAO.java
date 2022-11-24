/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Account_DTO;
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
public class Account_DAO extends dbConnector {

    public ArrayList<Account_DTO> loadDataAccount() {
        ArrayList<Account_DTO> listAccount = new ArrayList<Account_DTO>();
        try {
            String sql = "SELECT * FROM account";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Account_DTO account = new Account_DTO(rs.getString("Username"), rs.getString("Password"), rs.getInt("StaffID"), rs.getBoolean("IsAdmin"));
                listAccount.add(account);
            }
        } catch (Exception e) {
            System.out.println("An error has occured at loadDataAccount method from Account_DAO class.");
            System.out.println(e);
        }
        return listAccount;
    }

    public boolean usernameIsValid(String username) {
        boolean isValid = false;
        try {
            String sql = "SELECT * FROM account";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                if (username.equals(rs.getString("Username"))){
                    isValid = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("An error has occured at loadDataAccount method from Account_DAO class.");
            System.out.println(e);
        }
        return isValid;
    }
    
    public boolean passwordIsValid(String username, String password) {
        boolean isValid = false;
        try {
            String sql = "SELECT * FROM account WHERE Username = '"+username+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                if (password.equals(rs.getString("Password"))){
                    isValid = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("An error has occured at loadDataAccount method from Account_DAO class.");
            System.out.println(e);
        }
        return isValid;
    }
    
    public Account_DTO getAccount(String username) {
        Account_DTO account = new Account_DTO();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM account WHERE Username = '"+username+"'");
            
            while(rs.next()) {
                account = new Account_DTO(rs.getString("Username"),rs.getString("Password"),rs.getInt("StaffID"),rs.getBoolean("IsAdmin"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return account;
    }
    
    public boolean hadAccount(int id) {
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM account where StaffID = "+id);
            
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean insert(Account_DTO account) {
        try {
            PreparedStatement pst = conn.prepareStatement("INSERT INTO account(Username,Password,IsAdmin,StaffID) VALUES (?,?,?,?)"); 
            pst.setString(1, account.getUsername());
            pst.setString(2, account.getPassword());
            pst.setBoolean(3, account.isIsAdmin());
            pst.setInt(4, account.getStaffID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Account_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean delete(String username) {
        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM account WHERE Username = ?");
            pst.setString(1, username);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Account_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean update(Account_DTO account) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE account SET Username = ?, Password = ?, IsAdmin = ?, StaffID = ? WHERE Username = ?");
            pst.setString(1, account.getUsername());
            pst.setString(2, account.getPassword());
            pst.setBoolean(3, account.isIsAdmin());
            pst.setInt(4, account.getStaffID());
            pst.setString(5, account.getUsername());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Account_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean usernameExistedIgnores(String username, String ignore) {
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM account WHERE Username = '"+username+"' AND Username != '"+ignore+"'");
            
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<Account_DTO> search(String key, String filter) {
        ArrayList<Account_DTO> result = new ArrayList();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs;
            
            switch (filter) {
                case "Tên tài khoản": {
                    rs = stm.executeQuery("SELECT * FROM account WHERE Username LIKE '%"+key+"%'");
                    break;
                }
                case "Mật khẩu": {
                    rs = stm.executeQuery("SELECT * FROM account WHERE Password LIKE '%"+key+"%'");
                    break;
                }
                case "Mã nhân viên": {
                    rs = stm.executeQuery("SELECT * FROM account WHERE StaffID = "+key);
                    break;
                }
                default: {
                    rs = stm.executeQuery("SELECT * FROM account");
                    break;
                }
            }
            
            while (rs.next()) {
                result.add(new Account_DTO(rs.getString("Username"),rs.getString("Password"),rs.getInt("StaffID"),rs.getBoolean("IsAdmin")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
}
