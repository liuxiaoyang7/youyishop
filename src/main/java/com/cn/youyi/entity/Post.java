package com.cn.youyi.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Post {
    private int pid;
    private String pcontent;
    private String pimg;
    private Timestamp publishtime;
    private Integer cid;
    private Integer pbid;
    private Collection<Comment> commentsByPid;
    private Posttype posttypeByPtid;
    private User userByUid;
    private Commodity commodityByCid;
    private Postbar postbarByPbid;

    @Id
    @Column(name = "pid", nullable = false)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "pcontent", nullable = true, length = 225)
    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    @Basic
    @Column(name = "pimg", nullable = true, length = 225)
    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg;
    }

    @Basic
    @Column(name = "publishtime", nullable = true)
    public Timestamp getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Timestamp publishtime) {
        this.publishtime = publishtime;
    }

    @Basic
    @Column(name = "cid", nullable = true)
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "pbid", nullable = true)
    public Integer getPbid() {
        return pbid;
    }

    public void setPbid(Integer pbid) {
        this.pbid = pbid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (pid != post.pid) return false;
        if (pcontent != null ? !pcontent.equals(post.pcontent) : post.pcontent != null) return false;
        if (pimg != null ? !pimg.equals(post.pimg) : post.pimg != null) return false;
        if (publishtime != null ? !publishtime.equals(post.publishtime) : post.publishtime != null) return false;
        if (cid != null ? !cid.equals(post.cid) : post.cid != null) return false;
        if (pbid != null ? !pbid.equals(post.pbid) : post.pbid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid;
        result = 31 * result + (pcontent != null ? pcontent.hashCode() : 0);
        result = 31 * result + (pimg != null ? pimg.hashCode() : 0);
        result = 31 * result + (publishtime != null ? publishtime.hashCode() : 0);
        result = 31 * result + (cid != null ? cid.hashCode() : 0);
        result = 31 * result + (pbid != null ? pbid.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "postByPid")
    public Collection<Comment> getCommentsByPid() {
        return commentsByPid;
    }

    public void setCommentsByPid(Collection<Comment> commentsByPid) {
        this.commentsByPid = commentsByPid;
    }

    @ManyToOne
    @JoinColumn(name = "ptid", referencedColumnName = "ptid")
    public Posttype getPosttypeByPtid() {
        return posttypeByPtid;
    }

    public void setPosttypeByPtid(Posttype posttypeByPtid) {
        this.posttypeByPtid = posttypeByPtid;
    }

    @ManyToOne
    @JoinColumn(name = "uid", referencedColumnName = "uid")
    public User getUserByUid() {
        return userByUid;
    }

    public void setUserByUid(User userByUid) {
        this.userByUid = userByUid;
    }

    @ManyToOne
    @JoinColumn(name = "cid", referencedColumnName = "cid")
    public Commodity getCommodityByCid() {
        return commodityByCid;
    }

    public void setCommodityByCid(Commodity commodityByCid) {
        this.commodityByCid = commodityByCid;
    }

    @ManyToOne
    @JoinColumn(name = "pbid", referencedColumnName = "pbid")
    public Postbar getPostbarByPbid() {
        return postbarByPbid;
    }

    public void setPostbarByPbid(Postbar postbarByPbid) {
        this.postbarByPbid = postbarByPbid;
    }
}
