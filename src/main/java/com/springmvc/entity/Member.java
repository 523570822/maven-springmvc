package com.springmvc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Member implements Serializable {
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
     * 版本日期
     */
    private Long version;

    /**
     * 地址
     */
    private String address;

    /**
     * 消费金额
     */
    private BigDecimal amount;

    /**
     * 会员注册项值0
     */
    @Column(name = "attribute_value0")
    private String attributeValue0;

    /**
     * 会员注册项值1
     */
    @Column(name = "attribute_value1")
    private String attributeValue1;

    /**
     * 会员注册项值2
     */
    @Column(name = "attribute_value2")
    private String attributeValue2;

    /**
     * 会员注册项值3
     */
    @Column(name = "attribute_value3")
    private String attributeValue3;

    /**
     * 会员注册项值4
     */
    @Column(name = "attribute_value4")
    private String attributeValue4;

    /**
     * 会员注册项值5
     */
    @Column(name = "attribute_value5")
    private String attributeValue5;

    /**
     * 会员注册项值6
     */
    @Column(name = "attribute_value6")
    private String attributeValue6;

    /**
     * 会员注册项值7
     */
    @Column(name = "attribute_value7")
    private String attributeValue7;

    /**
     * 会员注册项值8
     */
    @Column(name = "attribute_value8")
    private String attributeValue8;

    /**
     * 会员注册项值9
     */
    @Column(name = "attribute_value9")
    private String attributeValue9;

    /**
     * 余额
     */
    private BigDecimal balance;

    private BigDecimal recharge;

    /**
     * 预存款
     */
    private BigDecimal prestore;

    /**
     * 佣金
     */
    private BigDecimal commission;

    /**
     * 支付密码
     */
    @Column(name = "pay_password")
    private String payPassword;

    /**
     * 出生日期
     */
    private Date birth;

    /**
     * Email
     */
    private String email;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 是否启用
     */
    @Column(name = "is_enabled")
    private Boolean isEnabled;

    /**
     * 是否锁定
     */
    @Column(name = "is_locked")
    private Boolean isLocked;

    /**
     * 锁定KEY
     */
    @Column(name = "lock_key")
    private String lockKey;

    /**
     * 锁定日期
     */
    @Column(name = "locked_date")
    private Date lockedDate;

    /**
     * 最后登录日期
     */
    @Column(name = "login_date")
    private Date loginDate;

    /**
     * 连续登录失败次数
     */
    @Column(name = "login_failure_count")
    private Integer loginFailureCount;

    /**
     * 最后登录IP
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登录插件ID
     */
    @Column(name = "login_plugin_id")
    private String loginPluginId;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 名称
     */
    private String name;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * openID
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话
     */
    private String phone;

    /**
     * 喵币
     */
    private BigDecimal point;

    /**
     * 注册IP
     */
    @Column(name = "register_ip")
    private String registerIp;

    /**
     * 安全密钥失效日期
     */
    @Column(name = "safe_key_expire")
    private Date safeKeyExpire;

    /**
     * 安全密钥
     */
    @Column(name = "safe_key_value")
    private String safeKeyValue;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 用户名
     */
    private String username;

    /**
     * 邮编
     */
    @Column(name = "zip_code")
    private String zipCode;

    /**
     * 地区
     */
    @Column(name = "area_id")
    private Long areaId;

    /**
     * 用户是否是vip 0/否 1/是
     */
    @Column(name = "is_vip")
    private Boolean isVip;

    /**
     * 会员等级
     */
    @Column(name = "member_rank_id")
    private Long memberRankId;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

    /**
     * 个性签名
     */
    private String sign;

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
     * 获取版本日期
     *
     * @return version - 版本日期
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置版本日期
     *
     * @param version 版本日期
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取消费金额
     *
     * @return amount - 消费金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置消费金额
     *
     * @param amount 消费金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取会员注册项值0
     *
     * @return attribute_value0 - 会员注册项值0
     */
    public String getAttributeValue0() {
        return attributeValue0;
    }

    /**
     * 设置会员注册项值0
     *
     * @param attributeValue0 会员注册项值0
     */
    public void setAttributeValue0(String attributeValue0) {
        this.attributeValue0 = attributeValue0 == null ? null : attributeValue0.trim();
    }

    /**
     * 获取会员注册项值1
     *
     * @return attribute_value1 - 会员注册项值1
     */
    public String getAttributeValue1() {
        return attributeValue1;
    }

    /**
     * 设置会员注册项值1
     *
     * @param attributeValue1 会员注册项值1
     */
    public void setAttributeValue1(String attributeValue1) {
        this.attributeValue1 = attributeValue1 == null ? null : attributeValue1.trim();
    }

    /**
     * 获取会员注册项值2
     *
     * @return attribute_value2 - 会员注册项值2
     */
    public String getAttributeValue2() {
        return attributeValue2;
    }

    /**
     * 设置会员注册项值2
     *
     * @param attributeValue2 会员注册项值2
     */
    public void setAttributeValue2(String attributeValue2) {
        this.attributeValue2 = attributeValue2 == null ? null : attributeValue2.trim();
    }

    /**
     * 获取会员注册项值3
     *
     * @return attribute_value3 - 会员注册项值3
     */
    public String getAttributeValue3() {
        return attributeValue3;
    }

    /**
     * 设置会员注册项值3
     *
     * @param attributeValue3 会员注册项值3
     */
    public void setAttributeValue3(String attributeValue3) {
        this.attributeValue3 = attributeValue3 == null ? null : attributeValue3.trim();
    }

    /**
     * 获取会员注册项值4
     *
     * @return attribute_value4 - 会员注册项值4
     */
    public String getAttributeValue4() {
        return attributeValue4;
    }

    /**
     * 设置会员注册项值4
     *
     * @param attributeValue4 会员注册项值4
     */
    public void setAttributeValue4(String attributeValue4) {
        this.attributeValue4 = attributeValue4 == null ? null : attributeValue4.trim();
    }

    /**
     * 获取会员注册项值5
     *
     * @return attribute_value5 - 会员注册项值5
     */
    public String getAttributeValue5() {
        return attributeValue5;
    }

    /**
     * 设置会员注册项值5
     *
     * @param attributeValue5 会员注册项值5
     */
    public void setAttributeValue5(String attributeValue5) {
        this.attributeValue5 = attributeValue5 == null ? null : attributeValue5.trim();
    }

    /**
     * 获取会员注册项值6
     *
     * @return attribute_value6 - 会员注册项值6
     */
    public String getAttributeValue6() {
        return attributeValue6;
    }

    /**
     * 设置会员注册项值6
     *
     * @param attributeValue6 会员注册项值6
     */
    public void setAttributeValue6(String attributeValue6) {
        this.attributeValue6 = attributeValue6 == null ? null : attributeValue6.trim();
    }

    /**
     * 获取会员注册项值7
     *
     * @return attribute_value7 - 会员注册项值7
     */
    public String getAttributeValue7() {
        return attributeValue7;
    }

    /**
     * 设置会员注册项值7
     *
     * @param attributeValue7 会员注册项值7
     */
    public void setAttributeValue7(String attributeValue7) {
        this.attributeValue7 = attributeValue7 == null ? null : attributeValue7.trim();
    }

    /**
     * 获取会员注册项值8
     *
     * @return attribute_value8 - 会员注册项值8
     */
    public String getAttributeValue8() {
        return attributeValue8;
    }

    /**
     * 设置会员注册项值8
     *
     * @param attributeValue8 会员注册项值8
     */
    public void setAttributeValue8(String attributeValue8) {
        this.attributeValue8 = attributeValue8 == null ? null : attributeValue8.trim();
    }

    /**
     * 获取会员注册项值9
     *
     * @return attribute_value9 - 会员注册项值9
     */
    public String getAttributeValue9() {
        return attributeValue9;
    }

    /**
     * 设置会员注册项值9
     *
     * @param attributeValue9 会员注册项值9
     */
    public void setAttributeValue9(String attributeValue9) {
        this.attributeValue9 = attributeValue9 == null ? null : attributeValue9.trim();
    }

    /**
     * 获取余额
     *
     * @return balance - 余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * @return recharge
     */
    public BigDecimal getRecharge() {
        return recharge;
    }

    /**
     * @param recharge
     */
    public void setRecharge(BigDecimal recharge) {
        this.recharge = recharge;
    }

    /**
     * 获取预存款
     *
     * @return prestore - 预存款
     */
    public BigDecimal getPrestore() {
        return prestore;
    }

    /**
     * 设置预存款
     *
     * @param prestore 预存款
     */
    public void setPrestore(BigDecimal prestore) {
        this.prestore = prestore;
    }

    /**
     * 获取佣金
     *
     * @return commission - 佣金
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * 设置佣金
     *
     * @param commission 佣金
     */
    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    /**
     * 获取支付密码
     *
     * @return pay_password - 支付密码
     */
    public String getPayPassword() {
        return payPassword;
    }

    /**
     * 设置支付密码
     *
     * @param payPassword 支付密码
     */
    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    /**
     * 获取出生日期
     *
     * @return birth - 出生日期
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * 设置出生日期
     *
     * @param birth 出生日期
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * 获取Email
     *
     * @return email - Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置Email
     *
     * @param email Email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取是否启用
     *
     * @return is_enabled - 是否启用
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置是否启用
     *
     * @param isEnabled 是否启用
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * 获取是否锁定
     *
     * @return is_locked - 是否锁定
     */
    public Boolean getIsLocked() {
        return isLocked;
    }

    /**
     * 设置是否锁定
     *
     * @param isLocked 是否锁定
     */
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * 获取锁定KEY
     *
     * @return lock_key - 锁定KEY
     */
    public String getLockKey() {
        return lockKey;
    }

    /**
     * 设置锁定KEY
     *
     * @param lockKey 锁定KEY
     */
    public void setLockKey(String lockKey) {
        this.lockKey = lockKey == null ? null : lockKey.trim();
    }

    /**
     * 获取锁定日期
     *
     * @return locked_date - 锁定日期
     */
    public Date getLockedDate() {
        return lockedDate;
    }

    /**
     * 设置锁定日期
     *
     * @param lockedDate 锁定日期
     */
    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    /**
     * 获取最后登录日期
     *
     * @return login_date - 最后登录日期
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * 设置最后登录日期
     *
     * @param loginDate 最后登录日期
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * 获取连续登录失败次数
     *
     * @return login_failure_count - 连续登录失败次数
     */
    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    /**
     * 设置连续登录失败次数
     *
     * @param loginFailureCount 连续登录失败次数
     */
    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    /**
     * 获取最后登录IP
     *
     * @return login_ip - 最后登录IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置最后登录IP
     *
     * @param loginIp 最后登录IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * 获取登录插件ID
     *
     * @return login_plugin_id - 登录插件ID
     */
    public String getLoginPluginId() {
        return loginPluginId;
    }

    /**
     * 设置登录插件ID
     *
     * @param loginPluginId 登录插件ID
     */
    public void setLoginPluginId(String loginPluginId) {
        this.loginPluginId = loginPluginId == null ? null : loginPluginId.trim();
    }

    /**
     * 获取手机
     *
     * @return mobile - 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取openID
     *
     * @return open_id - openID
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置openID
     *
     * @param openId openID
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取喵币
     *
     * @return point - 喵币
     */
    public BigDecimal getPoint() {
        return point;
    }

    /**
     * 设置喵币
     *
     * @param point 喵币
     */
    public void setPoint(BigDecimal point) {
        this.point = point;
    }

    /**
     * 获取注册IP
     *
     * @return register_ip - 注册IP
     */
    public String getRegisterIp() {
        return registerIp;
    }

    /**
     * 设置注册IP
     *
     * @param registerIp 注册IP
     */
    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    /**
     * 获取安全密钥失效日期
     *
     * @return safe_key_expire - 安全密钥失效日期
     */
    public Date getSafeKeyExpire() {
        return safeKeyExpire;
    }

    /**
     * 设置安全密钥失效日期
     *
     * @param safeKeyExpire 安全密钥失效日期
     */
    public void setSafeKeyExpire(Date safeKeyExpire) {
        this.safeKeyExpire = safeKeyExpire;
    }

    /**
     * 获取安全密钥
     *
     * @return safe_key_value - 安全密钥
     */
    public String getSafeKeyValue() {
        return safeKeyValue;
    }

    /**
     * 设置安全密钥
     *
     * @param safeKeyValue 安全密钥
     */
    public void setSafeKeyValue(String safeKeyValue) {
        this.safeKeyValue = safeKeyValue == null ? null : safeKeyValue.trim();
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取邮编
     *
     * @return zip_code - 邮编
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置邮编
     *
     * @param zipCode 邮编
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * 获取地区
     *
     * @return area_id - 地区
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 设置地区
     *
     * @param areaId 地区
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取用户是否是vip 0/否 1/是
     *
     * @return is_vip - 用户是否是vip 0/否 1/是
     */
    public Boolean getIsVip() {
        return isVip;
    }

    /**
     * 设置用户是否是vip 0/否 1/是
     *
     * @param isVip 用户是否是vip 0/否 1/是
     */
    public void setIsVip(Boolean isVip) {
        this.isVip = isVip;
    }

    /**
     * 获取会员等级
     *
     * @return member_rank_id - 会员等级
     */
    public Long getMemberRankId() {
        return memberRankId;
    }

    /**
     * 设置会员等级
     *
     * @param memberRankId 会员等级
     */
    public void setMemberRankId(Long memberRankId) {
        this.memberRankId = memberRankId;
    }

    /**
     * 获取是否删除
     *
     * @return is_delete - 是否删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除
     *
     * @param isDelete 是否删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取个性签名
     *
     * @return sign - 个性签名
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置个性签名
     *
     * @param sign 个性签名
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }
}