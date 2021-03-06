package com.coolweather.android.db;

import org.litepal.crud.DataSupport;
/**
 * 建立城市模型
 * 属性:id,cityName城市名称,cityCode城市代码,provinceId省份id*/
public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getCityCode() {
        return cityCode;
    }
    public void setCityCode(int cityCode) {
        this.cityCode =cityCode;
    }
    public int getProvinceId() { return provinceId;}
    public void setProvinceId(int provinceId) {this.provinceId= provinceId;}
}

