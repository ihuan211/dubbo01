package com.aaa.bean;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * 表 : tb_person
     * 对应字段 : tid
     */
    private String tid;

    /**
     * 姓名
     * 表 : tb_person
     * 对应字段 : name
     */
    private String name;

    /**
     * 年龄
     * 表 : tb_person
     * 对应字段 : age
     */
    private Integer age;

    /**
     * 性别
     * 表 : tb_person
     * 对应字段 : gender
     */
    private String gender;

    /**
     * 
     * 表 : tb_person
     * 对应字段 : create_by
     */
    private String createBy;

    /**
     * 
     * 表 : tb_person
     * 对应字段 : create_date
     */
    private Date createDate;

    /**
     * 
     * 表 : tb_person
     * 对应字段 : update_by
     */
    private String updateBy;

    /**
     * 
     * 表 : tb_person
     * 对应字段 : update_date
     */
    private Date updateDate;

    /**
     * 
     * 表 : tb_person
     * 对应字段 : remark
     */
    private String remark;

    /**
     * 
     * 表 : tb_person
     * 对应字段 : version
     */
    private Integer version;

    /**
     * 
     * 表 : tb_person
     * 对应字段 : state
     */
    private Integer state;

    /**
     * get method 
     *
     * @return tb_person.tid：主键
     */
    public String getTid() {
        return tid;
    }

    /**
     * set method 
     *
     * @param tid  主键
     */
    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    /**
     * get method 
     *
     * @return tb_person.name：姓名
     */
    public String getName() {
        return name;
    }

    /**
     * set method 
     *
     * @param name  姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * get method 
     *
     * @return tb_person.age：年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * set method 
     *
     * @param age  年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * get method 
     *
     * @return tb_person.gender：性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * set method 
     *
     * @param gender  性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * get method 
     *
     * @return tb_person.create_by：
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * set method 
     *
     * @param createBy  
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * get method 
     *
     * @return tb_person.create_date：
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * set method 
     *
     * @param createDate  
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * get method 
     *
     * @return tb_person.update_by：
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * set method 
     *
     * @param updateBy  
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * get method 
     *
     * @return tb_person.update_date：
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * set method 
     *
     * @param updateDate  
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * get method 
     *
     * @return tb_person.remark：
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set method 
     *
     * @param remark  
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * get method 
     *
     * @return tb_person.version：
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * set method 
     *
     * @param version  
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * get method 
     *
     * @return tb_person.state：
     */
    public Integer getState() {
        return state;
    }

    /**
     * set method 
     *
     * @param state  
     */
    public void setState(Integer state) {
        this.state = state;
    }
}