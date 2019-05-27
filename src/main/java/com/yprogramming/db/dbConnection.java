/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yprogramming.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yProgramming
 */
public class dbConnection {
    
    protected Connection getDbConnection(){
        try {
            String url = "jdbc:mysql://localhost:3306/bank_customer_care?useUnicode=true&characterEncoding=utf-8";
            String user = "root";
            String password = "99833266";
            Class.forName("com.mysql.jdbc.Driver");
            Connection db = DriverManager.getConnection(url, user, password);
            return db;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
