/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yprogramming.controller;

import com.yprogramming.db.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yProgramming
 */
public class userController extends dbConnection {
    Connection connection = null;
    dbConnection dbConnect = new dbConnection();
    public userController(){
        connection = getDbConnection();
    }
    
    public boolean registerAdmin(String username, String password){
        try {
            String sql = "insert into tb_user values(?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setString(3, "em001");
            stm.setString(4, "admin");
            stm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
