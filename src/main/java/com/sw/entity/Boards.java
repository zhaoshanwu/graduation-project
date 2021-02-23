package com.sw.entity;

import java.sql.Date;

public class Boards {
    private String boardID;
    private String boardName;
    private String masterID;
    private Date establish;
    private Integer postNumber;
    private String describe;

    public String getBoardID() {
        return boardID;
    }

    public void setBoardID(String boardID) {
        this.boardID = boardID;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getMasterID() {
        return masterID;
    }

    public void setMasterID(String masterID) {
        this.masterID = masterID;
    }

    public Date getEstablish() {
        return establish;
    }

    public void setEstablish(Date establish) {
        this.establish = establish;
    }

    public Integer getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(Integer postNumber) {
        this.postNumber = postNumber;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Boards{" +
                "boardID='" + boardID + '\'' +
                ", boardName='" + boardName + '\'' +
                ", masterID='" + masterID + '\'' +
                ", establish=" + establish +
                ", postNumber=" + postNumber +
                ", describe='" + describe + '\'' +
                '}';
    }
}
