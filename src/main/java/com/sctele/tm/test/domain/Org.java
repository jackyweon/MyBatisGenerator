package com.sctele.tm.test.domain;

import javax.persistence.*;

@Table(name = "t_org")
public class Org {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private String id;

    /**
     * 部门名称
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * 部门编码
     */
    @Column(name = "org_code")
    private String orgCode;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取部门名称
     *
     * @return org_name - 部门名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置部门名称
     *
     * @param orgName 部门名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 获取部门编码
     *
     * @return org_code - 部门编码
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置部门编码
     *
     * @param orgCode 部门编码
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }
}