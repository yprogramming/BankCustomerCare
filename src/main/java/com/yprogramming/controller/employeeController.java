/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yprogramming.controller;

import com.yprogramming.bank_customer_care.static_variable;
import com.yprogramming.db.dbConnection;
import com.yprogramming.model.User;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yProgramming
 */
public class employeeController extends dbConnection {
    Connection connection = null;
    public employeeController(){
        connection = getDbConnection();
    }
    
    public List<User> getEmpoyees(){
        List<User> employees = new ArrayList<User>();
        String sql = "select * from v_employee";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                User user = new User(
                        rs.getString("employee_id"), 
                        rs.getString("full_name"), 
                        rs.getString("village"), 
                        rs.getString("district_id"), 
                        rs.getString("district_name"), 
                        rs.getString("prov_id"), 
                        rs.getString("province_name"), 
                        rs.getString("image"), 
                        rs.getDate("birth_date"), 
                        rs.getDate("created_date"), 
                        rs.getDate("updated_date"), 
                        rs.getString("username"), 
                        rs.getString("permission")
                );
                employees.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employees;
    }
    
}
