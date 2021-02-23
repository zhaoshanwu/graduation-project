package com.sw.entity;

import java.sql.Date;

public class Messages {
    private String userID;
    private Integer stature;
    private Integer weight;
    private String sex;
    private Date birth;
    private String site;
    private String phone;
    private String hobby;
    private String work;
    private String mail;
    private String qq;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Integer getStature() {
        return stature;
    }

    public void setStature(Integer stature) {
        this.stature = stature;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "userID='" + userID + '\'' +
                ", stature=" + stature +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", site='" + site + '\'' +
                ", phone='" + phone + '\'' +
                ", hobby='" + hobby + '\'' +
                ", work='" + work + '\'' +
                ", mail='" + mail + '\'' +
                ", qq='" + qq + '\'' +
                '}';
    }
}
