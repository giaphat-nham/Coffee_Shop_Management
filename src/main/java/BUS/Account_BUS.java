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
}
