package com.ishang.wastedemo.admin.entity;

import java.io.Serializable;
import java.util.Date;

public class UserTotalData implements Serializable {
    private Integer id;

    private Integer userid;

    private Integer rubbishid;

    private Integer rubbishtype;

    private Integer number;

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

    public Integer getRubbishid() {
        return rubbishid;
    }

    public void setRubbishid(Integer rubbishid) {
        this.rubbishid = rubbishid;
    }

    public Integer getRubbishtype() {
        return rubbishtype;
    }

    public void setRubbishtype(Integer rubbishtype) {
        this.rubbishtype = rubbishtype;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
        sb.append(", rubbishid=").append(rubbishid);
        sb.append(", rubbishtype=").append(rubbishtype);
        sb.append(", number=").append(number);
        sb.append(", createtime=").append(createtime);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}