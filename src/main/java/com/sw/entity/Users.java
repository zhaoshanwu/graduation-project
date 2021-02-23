package com.sw.entity;

import java.sql.Date;

public class Users {
    private String userID;
    private String userName;
    private String userNumber;
    private String userPassword;
    private Integer capacity;
    private String status;
    private Integer grade;
    private Date registerDate;
    private Date finallyDate;
    private String signature;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getFinallyDate() {
        return finallyDate;
    }

    public void setFinallydate(Date finallyDate) {
        this.finallyDate = finallyDate;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", userNumber='" + userNumber + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", capacity=" + capacity +
                ", status='" + status + '\'' +
                ", grade=" + grade +
                ", registerdate=" + registerDate +
                ", finallydate=" + finallyDate +
                ", signature='" + signature + '\'' +
                '}';
    }
}
