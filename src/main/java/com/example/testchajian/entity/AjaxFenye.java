package com.example.testchajian.entity;

import java.io.Serializable;

/**
 * (AjaxFenye)实体类
 *
 * @author makejava
 * @since 2022-03-22 17:06:19
 */
public class AjaxFenye implements Serializable {
    private static final long serialVersionUID = 375827673720321959L;
    /**
    * 主键id
    */
    private Object id;
    /**
    * 名字
    */
    private String name;
    /**
    * 语言
    */
    private String language;
    /**
    * 性别
    */
    private String sex;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}