/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yprogramming.controller;

import com.yprogramming.db.dbConnection;
import com.yprogramming.model.District;
import com.yprogramming.model.Province;
import com.yprogramming.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yProgramming
 */
public class addressController extends dbConnection{
    Connection connection = null;
    public addressController(){
        connection = getDbConnection();
    }
    
    public List<Province> getProvince(){
        List<Province> provinces = new ArrayList<Province>();
        String sql = "select * from tb_province";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Province province = new Province(
                    rs.getInt("province_id"), 
                    rs.getString("province_name")
                );
                provinces.add(province);
            }
        } catch (SQLException ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return provinces;
    }
    
    public List<District> getDistrict(int provinceId){
        List<District> districts = new ArrayList<District>();
        String sql = "select * from tb_district where "
                + " province_id = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, provinceId);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                District district = new District(
                    rs.getInt("district_id"), 
                    rs.getString("district_name"),
                    rs.getInt("province_id")
                );
                districts.add(district);
            }
        } catch (SQLException ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return districts;
    }
    
}
