package com.shristi.training;
class User{
	String name;
	String city;
	int userId;

public User() {
	System.out.println("user details");
}
public User(String name) {
	this();
	System.out.println("one param");
	this.name=name;
}
public User(String name,int userId) {
	this(name);
	System.out.println("2 param");
	this.userId=userId;
}
public User(String name,int userId,String city) {
	this(name,userId);
	System.out.println("3 param");
	
	this.city=city;
}
void getDetails() {
	if(name!=null) {
		System.out.println(name);
	}
	if(userId>0) {
		System.out.println(userId);
	}
	if(city!=null) {
		System.out.println(city);
	}
}
public class ConstOverloading {
	
	

}
}