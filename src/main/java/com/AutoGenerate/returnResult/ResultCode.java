package com.AutoGenerate.returnResult;

public enum  ResultCode {

    SUCCESS(1000,"请求成功"),
    WARN(9500,"请求失败!");

    private Integer code;
    private String desc;
    ResultCode(Integer code,String msg){
        this.code=code;
        this.desc=msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
