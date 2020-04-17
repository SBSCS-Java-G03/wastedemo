package com.ishang.wastedemo.admin.entity;

import java.io.Serializable;
import java.util.Date;

public class RecycleSite implements Serializable {

	private Integer id;

    private String sitename;

    private String area;

    private String address;

    private Integer delFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

	@Override
	public String toString() {
		return "RecycleSite [id=" + id + ", sitename=" + sitename + ", area=" + area + ", address=" + address
				+ ", delFlag=" + delFlag + "]";
	}

}