package com.jshop.entity;

// Generated 2012-7-27 14:17:45 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ModuleM generated by hbm2java
 */
public class ModuleM implements java.io.Serializable {

	private String id;
	private String modulename;
	private Date createtime;

	public ModuleM() {
	}

	public ModuleM(String id, String modulename, Date createtime) {
		this.id = id;
		this.modulename = modulename;
		this.createtime = createtime;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModulename() {
		return this.modulename;
	}

	public void setModulename(String modulename) {
		this.modulename = modulename;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
