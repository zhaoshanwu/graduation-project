package com.sw.entity;

import java.sql.Date;

public class Comments {
    private String commentID;
    private String postID;
    private String userID;
    private String content;
    private Date commentTime;
    private Integer praise;
    private Integer revert;
    private String status;

    public String getCommentID() {
        return commentID;
    }

    public void setCommentID(String commentID) {
        this.commentID = commentID;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public Integer getRevert() {
        return revert;
    }

    public void setRevert(Integer revert) {
        this.revert = revert;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "commentID='" + commentID + '\'' +
                ", postID='" + postID + '\'' +
                ", userID='" + userID + '\'' +
                ", content='" + content + '\'' +
                ", commentTime=" + commentTime +
                ", praise=" + praise +
                ", revert=" + revert +
                ", status='" + status + '\'' +
                '}';
    }
}
