package com.example.model;

public class PojoClass {
	String Empid;
	String Empname;
	
	public PojoClass(String Empid,String Empname)
	{
		this.Empid=Empid;
		this.Empname=Empname;
	}
	
	public String getEmpid() {
		return Empid;
	}
	public void setEmpid(String empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	System.out.println("This line is change from myselflokesh repository ");
	System.out.println("Edited for changes needed");

}
