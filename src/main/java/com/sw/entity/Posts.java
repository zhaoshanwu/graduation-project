package com.sw.entity;

public class Posts {
    private String postID;
    private String title;
    private String boardID;
    private String initiateID;
    private String auditID;
    private String content;
    private String datetime;
    private Integer click;
    private Integer praise;
    private Integer comment;
    private boolean recommend;
    private boolean top;
    private boolean elite;
    private String status;

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBoardID() {
        return boardID;
    }

    public void setBoardID(String boardID) {
        this.boardID = boardID;
    }

    public String getInitiateID() {
        return initiateID;
    }

    public void setInitiateID(String initiateID) {
        this.initiateID = initiateID;
    }

    public String getAuditID() {
        return auditID;
    }

    public void setAuditID(String auditID) {
        this.auditID = auditID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

    public boolean isTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    public boolean isElite() {
        return elite;
    }

    public void setElite(boolean elite) {
        this.elite = elite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "postID='" + postID + '\'' +
                ", title='" + title + '\'' +
                ", boardID='" + boardID + '\'' +
                ", initiateID='" + initiateID + '\'' +
                ", auditID='" + auditID + '\'' +
                ", content='" + content + '\'' +
                ", datetime='" + datetime + '\'' +
                ", click=" + click +
                ", praise=" + praise +
                ", comment=" + comment +
                ", recommend=" + recommend +
                ", top=" + top +
                ", elite=" + elite +
                ", status='" + status + '\'' +
                '}';
    }
}
