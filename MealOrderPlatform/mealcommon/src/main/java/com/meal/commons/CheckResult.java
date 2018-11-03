package com.meal.commons;

/*
@author 汪培林

@create 2018-10-21-12:26
*/

public class CheckResult {

    public String message;
    public Integer status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public static CheckResult ok(boolean ook){
        CheckResult checkResult=new CheckResult();
        if(ook){
            checkResult.setMessage("OK");
            checkResult.setStatus(200);
        }
        else{
            checkResult.setMessage("已存在!");
            checkResult.setStatus(500);
        }
        return checkResult;
    }
    public static CheckResult build(Integer status,String message){
        CheckResult checkResult=new CheckResult();
        checkResult.setStatus(status);
        checkResult.setMessage(message);
        return checkResult;
    }
}
