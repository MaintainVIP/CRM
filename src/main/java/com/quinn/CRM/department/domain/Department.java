package com.quinn.CRM.department.domain;

import com.quinn.CRM.post.domain.Post;

import java.util.HashSet;
import java.util.Set;

public class Department {



    private String depId;
    private String depName;

    private Set<Post> postSet = new HashSet<Post>();

    public Set<Post> getPostSet() {
        return postSet;
    }

    public void setPostSet(Set<Post> postSet) {
        this.postSet = postSet;
    }


    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
