package com.quinn.CRM.staff.action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.quinn.CRM.staff.domain.Staff;
import com.quinn.CRM.staff.service.StaffService;

public class StaffAction extends ActionSupport implements ModelDriven<Staff> {


    //封装数据
    private Staff staff = new Staff();

    @Override
    public Staff getModel() {
        return staff;
    }
    private StaffService staffService;

    public void setStaffService(StaffService staffService) {
        this.staffService = staffService;
    }
    public String login(){
        //查询员工
        Staff crmStaff = staffService.login(staff);

        //是否成功
        if (crmStaff != null){
            //成功
            //在Session作用域保存数据
            ActionContext.getContext().getSession().put("loginStaff",crmStaff);
            //重定向到首页 -- 需要再xml中进行配置
        }
        //不成功
        //添加错误信息 -- 字段错误,显示所有错误信息
        addFieldError("","用户名或密码错误");
        //请求转发显示
        return LOGIN;
    }
    //跳转到首页
    public String home(){
        return "home";
    }
}

