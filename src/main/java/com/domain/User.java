package com.domain;

import java.util.Date;

/**
 * 用户表
 * @author 73598 2018-03-09
 */
public class User {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String loginName;

    /**
     * 登陆密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * 
     */
    private String isDeleted;

    /**
     * 邮件
     */
    private String email;

    /**
     * 移动电话
     */
    private String mobile;

    /**
     * 记录创建时间
     */
    private Date gmtCreate;

    /**
     * 最近更新时间
     */
    private Date gmtModified;

    /**
     * 区
     */
    private String locationArea;

    /**
     * 市
     */
    private String locationCity;

    /**
     * 省
     */
    private String locationProvince;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(String locationArea) {
        this.locationArea = locationArea == null ? null : locationArea.trim();
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity == null ? null : locationCity.trim();
    }

    public String getLocationProvince() {
        return locationProvince;
    }

    public void setLocationProvince(String locationProvince) {
        this.locationProvince = locationProvince == null ? null : locationProvince.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", locationArea='" + locationArea + '\'' +
                ", locationCity='" + locationCity + '\'' +
                ", locationProvince='" + locationProvince + '\'' +
                '}';
    }
}