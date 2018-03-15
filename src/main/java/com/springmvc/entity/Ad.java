package com.springmvc.entity;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
//一般添加个@ApiModel（）就可以，看情况使用里面的属性
@ApiModel(value="Ad", discriminator = "foo", subTypes = {Ad.class})
public class Ad implements Serializable {
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
     * 订单排序
     */
    private Integer orders;

    /**
     * 起始日期
     */
    @Column(name = "begin_date")
    private Date beginDate;

    /**
     * 结束日期
     */
    @Column(name = "end_date")
    private Date endDate;

    /**
     * 路径
     */
    private String path;

    /**
     * 标题
     */
    private String title;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 广告位ID
     */
    @Column(name = "ad_position_id")
    private Long adPositionId;

    @Column(name = "target_id")
    private Long targetId;

    /**
     * 链接参数
     */
    private String param;

    /**
     * 内容
     */
    private String content;

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
     * 获取订单排序
     *
     * @return orders - 订单排序
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置订单排序
     *
     * @param orders 订单排序
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获取起始日期
     *
     * @return begin_date - 起始日期
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * 设置起始日期
     *
     * @param beginDate 起始日期
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 获取结束日期
     *
     * @return end_date - 结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置结束日期
     *
     * @param endDate 结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取路径
     *
     * @return path - 路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置路径
     *
     * @param path 路径
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取链接地址
     *
     * @return url - 链接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接地址
     *
     * @param url 链接地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取广告位ID
     *
     * @return ad_position_id - 广告位ID
     */
    public Long getAdPositionId() {
        return adPositionId;
    }

    /**
     * 设置广告位ID
     *
     * @param adPositionId 广告位ID
     */
    public void setAdPositionId(Long adPositionId) {
        this.adPositionId = adPositionId;
    }

    /**
     * @return target_id
     */
    public Long getTargetId() {
        return targetId;
    }

    /**
     * @param targetId
     */
    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    /**
     * 获取链接参数
     *
     * @return param - 链接参数
     */
    public String getParam() {
        return param;
    }

    /**
     * 设置链接参数
     *
     * @param param 链接参数
     */
    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}