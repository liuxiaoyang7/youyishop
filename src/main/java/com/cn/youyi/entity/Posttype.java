package com.cn.youyi.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Posttype {
    private int ptid;
    private String ptype;
    private Collection<Post> postsByPtid;

    @Id
    @Column(name = "ptid", nullable = false)
    public int getPtid() {
        return ptid;
    }

    public void setPtid(int ptid) {
        this.ptid = ptid;
    }

    @Basic
    @Column(name = "ptype", nullable = true, length = 8)
    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Posttype posttype = (Posttype) o;

        if (ptid != posttype.ptid) return false;
        if (ptype != null ? !ptype.equals(posttype.ptype) : posttype.ptype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ptid;
        result = 31 * result + (ptype != null ? ptype.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "posttypeByPtid")
    public Collection<Post> getPostsByPtid() {
        return postsByPtid;
    }

    public void setPostsByPtid(Collection<Post> postsByPtid) {
        this.postsByPtid = postsByPtid;
    }
}
