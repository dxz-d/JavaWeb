package com.kuang.pojo;

import java.util.Date;

/**
 * @description  角色
 * @author diaoxiuze
 * @date 2020/8/24 16:50
 */
public class Role {

  private long id;
  /**
   * 角色编码
   */
  private String roleCode;
  /**
   * 角色名称
   */
  private String roleName;
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
   * 修改时间
   */
  private Date modifyDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getRoleCode() {
    return roleCode;
  }

  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
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
