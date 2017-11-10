package com.quinn.CRM.action.frame;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class LoginAction extends ActionSupport {


    private String loginPwd;
    private String loginName;

    public String login(){
        return SUCCESS;
    }
    public String left(){
        return SUCCESS;
    }
    public String left1(){
        return SUCCESS;
    }
    public String left2(){
        return SUCCESS;
    }
    public String right(){
        return SUCCESS;
    }
    public String top(){
        return SUCCESS;
    }
    public String control(){
        return SUCCESS;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginName() {
        return loginName;
    }
}
