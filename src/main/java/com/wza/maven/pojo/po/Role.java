package com.wza.maven.pojo.po;

public class Role {
	private Integer rid;
	private String rname;
	private String alias;
	public int getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Role() {		
	}
	public Role(Integer rid, String rname, String alias) {
		this.rid = rid;
		this.rname = rname;
		this.alias = alias;
	}
	
}
