package com.springmvc.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "sys_permissions")
public class SysPermissions implements Serializable {
    /**
     * 编号
     */
    private Long id;

    /**
     * 权限标识符
     */
    private String permission;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否可用
     */
    private Boolean available;

    private static final long serialVersionUID = 1L;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取权限标识符
     *
     * @return permission - 权限标识符
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置权限标识符
     *
     * @param permission 权限标识符
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取是否可用
     *
     * @return available - 是否可用
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * 设置是否可用
     *
     * @param available 是否可用
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }
}