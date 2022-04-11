package com.raj.model;

public class Student {
	private int sid;
	private String fname;
	private String lname;
	private String address;
	private int age;

	public Student() {

	}

	public Student(int sid, String fname, String lname, int age, String address) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.address = address;
	}

	public Student(String fname, String lname, String address, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.age = age;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fname=" + fname + ", lname=" + lname + ", address=" + address + ", age=" + age
				+ "]";
	}

}
