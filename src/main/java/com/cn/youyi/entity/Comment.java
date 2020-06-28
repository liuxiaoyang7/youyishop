package com.cn.youyi.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Comment {
    private int cmid;
    private String comcontent;
    private Timestamp comtime;
    private Integer pid;
    private Integer uid;
    private Integer againCmid;
    private Comment commentByAgainCmid;

    @Id
    @Column(name = "cmid", nullable = false)
    public int getCmid() {
        return cmid;
    }

    public void setCmid(int cmid) {
        this.cmid = cmid;
    }

    @Basic
    @Column(name = "comcontent", nullable = true, length = 225)
    public String getComcontent() {
        return comcontent;
    }

    public void setComcontent(String comcontent) {
        this.comcontent = comcontent;
    }

    @Basic
    @Column(name = "comtime", nullable = true)
    public Timestamp getComtime() {
        return comtime;
    }

    public void setComtime(Timestamp comtime) {
        this.comtime = comtime;
    }

    @Basic
    @Column(name = "pid", nullable = true)
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "uid", nullable = true)
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "again_cmid", nullable = true)
    public Integer getAgainCmid() {
        return againCmid;
    }

    public void setAgainCmid(Integer againCmid) {
        this.againCmid = againCmid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (cmid != comment.cmid) return false;
        if (comcontent != null ? !comcontent.equals(comment.comcontent) : comment.comcontent != null) return false;
        if (comtime != null ? !comtime.equals(comment.comtime) : comment.comtime != null) return false;
        if (pid != null ? !pid.equals(comment.pid) : comment.pid != null) return false;
        if (uid != null ? !uid.equals(comment.uid) : comment.uid != null) return false;
        if (againCmid != null ? !againCmid.equals(comment.againCmid) : comment.againCmid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cmid;
        result = 31 * result + (comcontent != null ? comcontent.hashCode() : 0);
        result = 31 * result + (comtime != null ? comtime.hashCode() : 0);
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (againCmid != null ? againCmid.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "again_cmid", referencedColumnName = "cmid")
    public Comment getCommentByAgainCmid() {
        return commentByAgainCmid;
    }

    public void setCommentByAgainCmid(Comment commentByAgainCmid) {
        this.commentByAgainCmid = commentByAgainCmid;
    }
}
