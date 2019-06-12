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
public class Province {
    private int provinceId;
    private String provinceName;
    
    public Province(int provinceId, String provinceName) {
        this.provinceId = provinceId;
        this.provinceName = provinceName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }
    
}
