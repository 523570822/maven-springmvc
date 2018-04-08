package com.springmvc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Permission implements Serializable {






    /**
     * 主键id
     */
    private String id;

    /**
     * 上级权限
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 权限名
     */
    private String name;

    /**
     * 权限值
     */
    private String value;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除：0否,1是
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 图标
     */
    private String icon;

    /**
     * 菜单排序编号
     */
    @Column(name = "order_number")
    private Integer orderNumber;

    /**
     * 权限类型：0菜单，1按钮
     */
    private Integer type;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取上级权限
     *
     * @return parent_id - 上级权限
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置上级权限
     *
     * @param parentId 上级权限
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * 获取权限名
     *
     * @return name - 权限名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限名
     *
     * @param name 权限名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取权限值
     *
     * @return value - 权限值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置权限值
     *
     * @param value 权限值
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除：0否,1是
     *
     * @return is_delete - 是否删除：0否,1是
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除：0否,1是
     *
     * @param isDelete 是否删除：0否,1是
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取菜单排序编号
     *
     * @return order_number - 菜单排序编号
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置菜单排序编号
     *
     * @param orderNumber 菜单排序编号
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 获取权限类型：0菜单，1按钮
     *
     * @return type - 权限类型：0菜单，1按钮
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置权限类型：0菜单，1按钮
     *
     * @param type 权限类型：0菜单，1按钮
     */
    public void setType(Integer type) {
        this.type = type;
    }
}