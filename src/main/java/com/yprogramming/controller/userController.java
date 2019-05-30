/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yprogramming.controller;

import com.yprogramming.db.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    public String getEmployeeAutoID(){
        String sql = "call sp_get_auto_id(?);"; //
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "EM_ID");
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                return rs.getString("ID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public boolean registerAdmin(String username, String password){
        try {
            String emId = getEmployeeAutoID();
            String sql = "insert into tb_employee(employee_id) values(?);";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, emId);
            stm.executeUpdate();
            
            sql = "insert into tb_user values(?,password(?),?,?);";
            stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setString(3, emId);
            stm.setString(4, "admin");
            stm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
