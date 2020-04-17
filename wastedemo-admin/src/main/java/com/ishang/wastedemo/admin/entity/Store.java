package com.ishang.wastedemo.admin.entity;

import java.io.Serializable;
import java.util.Date;

public class Store implements Serializable {
    private Integer id;

	private Integer rubbishid;

	private String whsename;

	private Integer num;

	private Integer delFlag;

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRubbishid() {
		return rubbishid;
	}

	public void setRubbishid(Integer rubbishid) {
		this.rubbishid = rubbishid;
	}

	public String getWhsename() {
		return whsename;
	}

	public void setWhsename(String whsename) {
		this.whsename = whsename == null ? null : whsename.trim();
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
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
		sb.append(", rubbishid=").append(rubbishid);
		sb.append(", whsename=").append(whsename);
		sb.append(", num=").append(num);
		sb.append(", delFlag=").append(delFlag);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}


}