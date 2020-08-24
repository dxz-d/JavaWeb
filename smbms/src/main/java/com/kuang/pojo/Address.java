package com.kuang.pojo;

import java.util.Date;

/**
 * @description  地址
 * @author diaoxiuze
 * @date 2020/8/24 16:33
 */  
public class Address {

  private long id;
  /**
   * 联系人姓名
    */
  private String contact;
  /**
   * 收货地址明细
   */
  private String addressDesc;
  /**
   * 邮编
   */
  private String postCode;
  /**
   * 联系人电话
   */
  private String tel;
  /**
   * 创建者
   */
  private long createdBy;
  /**
   * 创建时间
   */
  private Date creationDate;
  /**
   * 修改者
   */
  private long modifyBy;
  /**
   * 创建时间
   */
  private Date modifyDate;
  /**
   * 用户ID
   */
  private long userId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }


  public String getAddressDesc() {
    return addressDesc;
  }

  public void setAddressDesc(String addressDesc) {
    this.addressDesc = addressDesc;
  }


  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
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


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

}
