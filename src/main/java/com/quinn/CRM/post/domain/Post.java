package com.quinn.CRM.post.domain;


import com.quinn.CRM.department.domain.Department;
import com.quinn.CRM.staff.domain.Staff;

import java.util.HashSet;
import java.util.Set;

public class Post {


    private String postId;
    private String postName;

    private Department department;

    private Set<Staff> staffSet = new HashSet<Staff>();

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Set<Staff> getStaffSet() {
        return staffSet;
    }

    public void setStaffSet(Set<Staff> staffSet) {
        this.staffSet = staffSet;
    }
}
