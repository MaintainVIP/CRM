package com.quinn.CRM.staff.dao;


import com.quinn.CRM.staff.domain.Staff;

public interface StaffDao {

    /**
     * 登录 -- 通过用户名和密码进行查询
     * @param loginName
     * @param loginPwd
     * @return
     */
    Staff find(String loginName,String loginPwd);

}
