package com.coolweather.android.db;

import org.litepal.crud.DataSupport;
/**
 *省份模型类,继承DataSupport
 * 属性:id,provinceName省份名称,provinceCode省份代码*/
public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName() {
        return provinceName;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode =provinceCode;
    }
}
