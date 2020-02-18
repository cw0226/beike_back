package com.kgc.pojo;

import java.util.Date;

public class ValidateCode {
    private String validateCode;

    private Date date;

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode == null ? null : validateCode.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}