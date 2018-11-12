package com.navya;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	//primitive datatypes
	private int eid;
	private String ename;
	private String esalary;
	//secondary datatypes
	private Address address;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}
@Required
	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsalary() {
		return esalary;
	}

	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", address=" + address + "]";
	}
	

}
