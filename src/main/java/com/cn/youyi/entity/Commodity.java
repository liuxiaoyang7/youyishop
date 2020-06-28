package com.cn.youyi.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Commodity {
    private int cid;
    private String titile;
    private String variety;
    private Double price;
    private String introduce;
    private Integer popularity;
    private String cimg;
    private Integer gid;
    private Integer uid;
    private Timestamp xinping;
    private Integer rexiao;

    @Id
    @Column(name = "cid", nullable = false)
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "titile", nullable = true, length = 50)
    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    @Basic
    @Column(name = "variety", nullable = true, length = 10)
    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "introduce", nullable = true, length = 225)
    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Basic
    @Column(name = "popularity", nullable = true)
    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    @Basic
    @Column(name = "cimg", nullable = true, length = 225)
    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg;
    }

    @Basic
    @Column(name = "gid", nullable = true)
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
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
    @Column(name = "xinping", nullable = true)
    public Timestamp getXinping() {
        return xinping;
    }

    public void setXinping(Timestamp xinping) {
        this.xinping = xinping;
    }

    @Basic
    @Column(name = "rexiao", nullable = true)
    public Integer getRexiao() {
        return rexiao;
    }

    public void setRexiao(Integer rexiao) {
        this.rexiao = rexiao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commodity commodity = (Commodity) o;

        if (cid != commodity.cid) return false;
        if (titile != null ? !titile.equals(commodity.titile) : commodity.titile != null) return false;
        if (variety != null ? !variety.equals(commodity.variety) : commodity.variety != null) return false;
        if (price != null ? !price.equals(commodity.price) : commodity.price != null) return false;
        if (introduce != null ? !introduce.equals(commodity.introduce) : commodity.introduce != null) return false;
        if (popularity != null ? !popularity.equals(commodity.popularity) : commodity.popularity != null) return false;
        if (cimg != null ? !cimg.equals(commodity.cimg) : commodity.cimg != null) return false;
        if (gid != null ? !gid.equals(commodity.gid) : commodity.gid != null) return false;
        if (uid != null ? !uid.equals(commodity.uid) : commodity.uid != null) return false;
        if (xinping != null ? !xinping.equals(commodity.xinping) : commodity.xinping != null) return false;
        if (rexiao != null ? !rexiao.equals(commodity.rexiao) : commodity.rexiao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + (titile != null ? titile.hashCode() : 0);
        result = 31 * result + (variety != null ? variety.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (introduce != null ? introduce.hashCode() : 0);
        result = 31 * result + (popularity != null ? popularity.hashCode() : 0);
        result = 31 * result + (cimg != null ? cimg.hashCode() : 0);
        result = 31 * result + (gid != null ? gid.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (xinping != null ? xinping.hashCode() : 0);
        result = 31 * result + (rexiao != null ? rexiao.hashCode() : 0);
        return result;
    }
}
