package com.quinn.CRM.staff.dao.impl;


import com.quinn.CRM.staff.dao.StaffDao;
import com.quinn.CRM.staff.domain.Staff;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao {


    @Override
    public Staff find(String loginName, String loginPwd) {

        //sql
        String sql = "from Staff where loginName=? and loginPwd=?";

        //获取所有 -- 因为没有获取一个的方法
        List<Staff> allStaff = (List<Staff>) this.getHibernateTemplate().find(sql,loginName,loginPwd);

        //判断获取
        if (allStaff.size() == 1){
            return allStaff.get(0);
        }
        return null;
    }
}
