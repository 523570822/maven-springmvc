package com.springmvc.entity;

import java.util.List;

public class PermissionU extends Permission {
    private String parentName;  //父菜单

    private List<Permission> subMenus;  //子菜单

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public List<Permission> getSubMenus() {
        return subMenus;
    }

    public void setSubMenus(List<Permission> subMenus) {
        this.subMenus = subMenus;
    }
}
