package com.AutoGenerate.returnResult;

public class result {
    private Integer code;
    private String desc;
    private Object data;
    public result(ResultCode resultCode, Object data){
        this(resultCode);
        this.data=data;
    }
    public result(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.desc = resultCode.getDesc();
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
