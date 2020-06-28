package com.cn.youyi.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Postbar {
    private int pbid;
    private String bname;
    private String barowner;
    private Date create;
    private Integer attention;

    @Id
    @Column(name = "pbid", nullable = false)
    public int getPbid() {
        return pbid;
    }

    public void setPbid(int pbid) {
        this.pbid = pbid;
    }

    @Basic
    @Column(name = "bname", nullable = true, length = 10)
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Basic
    @Column(name = "barowner", nullable = true, length = 10)
    public String getBarowner() {
        return barowner;
    }

    public void setBarowner(String barowner) {
        this.barowner = barowner;
    }

    @Basic
    @Column(name = "create", nullable = true)
    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    @Basic
    @Column(name = "attention", nullable = true)
    public Integer getAttention() {
        return attention;
    }

    public void setAttention(Integer attention) {
        this.attention = attention;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Postbar postbar = (Postbar) o;

        if (pbid != postbar.pbid) return false;
        if (bname != null ? !bname.equals(postbar.bname) : postbar.bname != null) return false;
        if (barowner != null ? !barowner.equals(postbar.barowner) : postbar.barowner != null) return false;
        if (create != null ? !create.equals(postbar.create) : postbar.create != null) return false;
        if (attention != null ? !attention.equals(postbar.attention) : postbar.attention != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pbid;
        result = 31 * result + (bname != null ? bname.hashCode() : 0);
        result = 31 * result + (barowner != null ? barowner.hashCode() : 0);
        result = 31 * result + (create != null ? create.hashCode() : 0);
        result = 31 * result + (attention != null ? attention.hashCode() : 0);
        return result;
    }
}
