package com.quinn.CRM.action.refer;

import com.opensymphony.xwork2.ActionSupport;


public class referAction extends ActionSupport{

    private int status;

    public String findAll() throws Exception {
        if (status == 1){
            return "addOrEditRefer";
        }else if (status == 2){
            return "listRefer";
        }else {
        return ERROR;
        }
    }



    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
