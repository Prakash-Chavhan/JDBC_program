package com.yash;

import java.util.Date;

public class Student {
int id ;
String name;
int totalmarks;
Date addmissiondate;

public Date getAddmissiondate() {
	return addmissiondate;
}
public void setAddmissiondate(Date addmissiondate) {
	this.addmissiondate = addmissiondate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTotalmarks() {
	return totalmarks;
}
public void setTotalmarks(int totalmarks) {
	this.totalmarks = totalmarks;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", totalmarks=" + totalmarks + "]";
}

}
