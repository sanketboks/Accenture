package com.app.registration.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	private String username;
	private String password;
	@Id
	private int empid;
	public Emp()
	{
		
	}
	public Emp(String username, String password, int empid) {
		super();
		this.username = username;
		this.password = password;
		this.empid = empid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Emp [username=" + username + ", password=" + password + ", empid=" + empid + "]";
	}
	
	

}
