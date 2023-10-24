package com.sunbeam;



public class Users  {
	
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String passwd;
	private String bdate;
	private boolean status;
	private String role;
	
  public Users() {
	
}

public Users(int id, String fname, String lname, String email, String passwd, String bdate, boolean status,
		String role) {
	
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.passwd = passwd;
	this.bdate = bdate;
	this.status = status;
	this.role = role;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPasswd() {
	return passwd;
}

public void setPasswd(String passwd) {
	this.passwd = passwd;
}

public String getBdate() {
	return bdate;
}

public void setBdate(String bdate) {
	this.bdate = bdate;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

@Override
public String toString() {
	return "Users [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", passwd=" + passwd
			+ ", bdate=" + bdate + ", status=" + status + ", role=" + role + "]";
}
 

}







// id | first_name | last_name | email             | password | dob        | status | role
// create table users (id int primary key auto_increment, first_name varchar(20),last_name varchar(20), email
//varchar(80) unique, password varchar(20), dob date, status boolean,role varchar(20));