package com.atria.training;

public class Constructors {
	private String cname;
	private int cid;
	private String city;
	
	public Constructors(){
		
	}
	
	public Constructors(String cname, int cid, String city) {
	
		this.cname = cname;
		this.cid = cid;
		this.city = city;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Constructors [cname=" + cname + ", cid=" + cid + ", city=" + city + "]";
	}
	
	
}
