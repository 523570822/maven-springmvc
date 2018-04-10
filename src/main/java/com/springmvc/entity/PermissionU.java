package com.springmvc.entity;

import javax.persistence.Table;
import java.util.List;
@Table(name = "permission")
public class PermissionU extends Permission {
    private String parentName;  //父菜单

    private List<PermissionU> subMenus;  //子菜单

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public List<PermissionU> getSubMenus() {
        return subMenus;
    }

    public void setSubMenus(List<PermissionU> subMenus) {
        this.subMenus = subMenus;
    }
}
