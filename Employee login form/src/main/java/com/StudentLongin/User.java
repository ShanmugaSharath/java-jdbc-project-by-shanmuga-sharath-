package com.StudentLongin;

public class User {

public String getUserName() {
	return userName;
}

public User(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
private String userName,password;
}
