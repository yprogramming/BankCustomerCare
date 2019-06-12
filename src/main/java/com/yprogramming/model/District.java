/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yprogramming.model;

/**
 *
 * @author yProgramming
 */
public class District {
    private int districtId;
    private String districtName;
    private int provinceId;

    public District(int districtId, String districtName, int provinceId) {
        this.districtId = districtId;
        this.districtName = districtName;
        this.provinceId = provinceId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public int getProvinceId() {
        return provinceId;
    }
    
}
