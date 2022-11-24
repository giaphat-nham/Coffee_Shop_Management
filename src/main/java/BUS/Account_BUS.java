/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.Account_DAO;
import DTO.Account_DTO;
import java.util.ArrayList;

/**
 *
 * @author DLCH
 */
public class Account_BUS {
    Account_DAO accountDAO = new Account_DAO();
    
    public ArrayList<Account_DTO> loadDataAccount() {
        return accountDAO.loadDataAccount();
    }
    
    public boolean usernameIsValid (String username) {
        return accountDAO.usernameIsValid(username);
    }
    
    public boolean passwordIsValid (String username, String password) {
        return accountDAO.passwordIsValid(username,password);
    }
    
    public Account_DTO getAccount(String username) {
        return accountDAO.getAccount(username);
    }
    
    public boolean insert(Account_DTO account) {
        return accountDAO.insert(account);
    }

    public boolean update(Account_DTO account) {
        return accountDAO.update(account);
    }
    
    public boolean delete(String username) {
        return accountDAO.delete(username);
    }
    
    public boolean hadAccount (int id) {
        return accountDAO.hadAccount(id);
    }
    
    public boolean usernameExistedIgnores(String username, String ignore) {
        return accountDAO.usernameExistedIgnores(username, ignore);
    }
    
    public ArrayList<Account_DTO> search(String key, String filter) {
        return accountDAO.search(key, filter);
    }
}
