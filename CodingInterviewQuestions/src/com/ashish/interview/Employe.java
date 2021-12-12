package com.ashish.interview;

public class Employe {
	
	private String name;
	private String companyName;
	private String companycode;
	@Override
	public String toString() {
		return "Employe [name=" + name + ", companyName=" + companyName + ", companycode=" + companycode + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanycode() {
		return companycode;
	}
	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}

}
