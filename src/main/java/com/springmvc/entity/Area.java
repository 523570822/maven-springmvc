package com.springmvc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Area implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 创建日期
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改日期
     */
    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 版本号
     */
    private Long version;

    /**
     * 订单
     */
    private Integer orders;

    /**
     * 层级
     */
    private Integer grade;

    /**
     * 名称
     */
    private String name;

    /**
     * 树路径
     */
    @Column(name = "tree_path")
    private String treePath;

    /**
     * 上级地区ID
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 全称
     */
    @Column(name = "full_name")
    private String fullName;

    private static final long serialVersionUID = 1L;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取创建日期
     *
     * @return create_date - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改日期
     *
     * @return modify_date - 修改日期
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 设置修改日期
     *
     * @param modifyDate 修改日期
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 获取订单
     *
     * @return orders - 订单
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置订单
     *
     * @param orders 订单
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获取层级
     *
     * @return grade - 层级
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 设置层级
     *
     * @param grade 层级
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取树路径
     *
     * @return tree_path - 树路径
     */
    public String getTreePath() {
        return treePath;
    }

    /**
     * 设置树路径
     *
     * @param treePath 树路径
     */
    public void setTreePath(String treePath) {
        this.treePath = treePath == null ? null : treePath.trim();
    }

    /**
     * 获取上级地区ID
     *
     * @return parent_id - 上级地区ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置上级地区ID
     *
     * @param parentId 上级地区ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取全称
     *
     * @return full_name - 全称
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置全称
     *
     * @param fullName 全称
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }
}