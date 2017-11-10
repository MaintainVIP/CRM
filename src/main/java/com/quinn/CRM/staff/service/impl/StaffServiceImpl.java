package com.quinn.CRM.staff.service.impl;

import com.quinn.CRM.staff.dao.StaffDao;
import com.quinn.CRM.staff.domain.Staff;
import com.quinn.CRM.staff.service.StaffService;

public class StaffServiceImpl implements StaffService{

    private StaffDao staffDao;

    public void setStaffDao(StaffDao staffDao){
        this.staffDao = staffDao;
    }

    @Override
    public Staff login(Staff staff) {
        return staffDao.find(staff.getLoginName(),staff.getLoginPwd());

    }
}
