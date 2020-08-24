package com.kuang.pojo;

import java.util.Date;

/**
 * @description  供应者
 * @author diaoxiuze
 * @date 2020/8/24 16:47
 */
public class Provider {

  private long id;
  /**
   * 供应商编码
   */
  private String proCode;
  /**
   * 供应商名称
   */
  private String proName;
  /**
   * 供应商详细描述
   */
  private String proDesc;
  /**
   * 供应商联系人
   */
  private String proContact;
  /**
   * 联系电话
   */
  private String proPhone;
  /**
   * 地址
   */
  private String proAddress;
  /**
   * 传真
   */
  private String proFax;
  /**
   * 创建者（userId）
   */
  private long createdBy;
  /**
   * 创建时间
   */
  private Date creationDate;
  /**
   * 更新时间
   */
  private Date modifyDate;
  /**
   * 更新者（userId）
   */
  private long modifyBy;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getProCode() {
    return proCode;
  }

  public void setProCode(String proCode) {
    this.proCode = proCode;
  }


  public String getProName() {
    return proName;
  }

  public void setProName(String proName) {
    this.proName = proName;
  }


  public String getProDesc() {
    return proDesc;
  }

  public void setProDesc(String proDesc) {
    this.proDesc = proDesc;
  }


  public String getProContact() {
    return proContact;
  }

  public void setProContact(String proContact) {
    this.proContact = proContact;
  }


  public String getProPhone() {
    return proPhone;
  }

  public void setProPhone(String proPhone) {
    this.proPhone = proPhone;
  }


  public String getProAddress() {
    return proAddress;
  }

  public void setProAddress(String proAddress) {
    this.proAddress = proAddress;
  }


  public String getProFax() {
    return proFax;
  }

  public void setProFax(String proFax) {
    this.proFax = proFax;
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


  public Date getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }


  public long getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(long modifyBy) {
    this.modifyBy = modifyBy;
  }

}
