/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DLCH
 */
public class dbConnector {
    protected Connection conn = null;

    public dbConnector() {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop", "root", "");
                System.out.println("Database connection successful!");
            } catch (SQLException ex) {
                Logger.getLogger(dbConnector.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public static void main(String[] args) {
        dbConnector dbConnector = new dbConnector();
    }
    
}
