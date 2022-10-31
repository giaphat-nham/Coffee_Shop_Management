/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Account_DTO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
                Account_DTO account = new Account_DTO(rs.getString("Username"), rs.getString("Password"), rs.getString("StaffID"), rs.getBoolean("IsAdmin"));
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
}
