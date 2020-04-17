package com.ishang.wastedemo.admin.entity;

import java.io.Serializable;
import java.util.Date;

public class RecycleOrder implements Serializable {
    private Integer id;

    private Integer userid;

    private Integer siteid;

    private Float pointnumber;

    private Integer totalnumber;

    private Float totalprice;

    private Date createtime;

    private Integer delFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public Float getPointnumber() {
        return pointnumber;
    }

    public void setPointnumber(Float pointnumber) {
        this.pointnumber = pointnumber;
    }

    public Integer getTotalnumber() {
        return totalnumber;
    }

    public void setTotalnumber(Integer totalnumber) {
        this.totalnumber = totalnumber;
    }

    public Float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", siteid=").append(siteid);
        sb.append(", pointnumber=").append(pointnumber);
        sb.append(", totalnumber=").append(totalnumber);
        sb.append(", totalprice=").append(totalprice);
        sb.append(", createtime=").append(createtime);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}