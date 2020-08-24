package com.kuang.pojo;

import java.util.Date;

/**
 * @description
 * @author diaoxiuze
 * @date 2020/8/24 16:52
 */
public class User {

  private long id;
  /**
   * 用户编码
   */
  private String userCode;
  /**
   * 用户名称
   */
  private String userName;
  /**
   * 用户密码
   */
  private String userPassword;
  /**
   * 性别（1:女、 2:男）
   */
  private long gender;
  /**
   * 出生日期
   */
  private java.sql.Date birthday;
  /**
   * 手机
   */
  private String phone;
  /**
   * 地址
   */
  private String address;
  /**
   * 用户角色（取自角色表-角色id）
   */
  private long userRole;
  /**
   * 创建者（userId）
   */
  private long createdBy;
  /**
   * 创建时间
   */
  private Date creationDate;
  /**
   * 更新者（userId）
   */
  private long modifyBy;
  /**
   * 更新时间
   */
  private Date modifyDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public long getGender() {
    return gender;
  }

  public void setGender(long gender) {
    this.gender = gender;
  }


  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public long getUserRole() {
    return userRole;
  }

  public void setUserRole(long userRole) {
    this.userRole = userRole;
  }


  public long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(long createdBy) {
    this.createdBy = createdBy;
  }


  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }


  public long getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(long modifyBy) {
    this.modifyBy = modifyBy;
  }


  public Date getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

}
