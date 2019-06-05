/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yprogramming.model;

import java.sql.Date;

/**
 *
 * @author yProgramming
 */
public class User {
    private String employeeId;
    private String fullName;
    private String village;
    private String districtId;
    private String districtName;
    private String provinceId;
    private String provinceName;
    private String image;
    private Date birthDate;
    private Date createdDate;
    private Date updateDate;
    private String username;
    private String permission;

    public User(
            String employeeId, 
            String fullName, 
            String village, 
            String districtId, 
            String districtName, 
            String provinceId, 
            String provinceName, 
            String image, 
            Date birthDate, 
            Date createdDate, 
            Date updateDate, 
            String username, 
            String permission) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.village = village;
        this.districtId = districtId;
        this.districtName = districtName;
        this.provinceId = provinceId;
        this.provinceName = provinceName;
        this.image = image;
        this.birthDate = birthDate;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
        this.username = username;
        this.permission = permission;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getVillage() {
        return village;
    }

    public String getDistrictId() {
        return districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public String getImage() {
        return image;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public String getUsername() {
        return username;
    }

    public String getPermission() {
        return permission;
    }
    
}
