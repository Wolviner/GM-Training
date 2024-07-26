package com.grayMatter;

public class Student {

private String studName;
private int id;
private int m1,m2,m3;


//No parameter constructor
public Student() {
	super();//Constructor of object class is invoked (it has to be written first)
}

//All parameter constr.
public Student(String studName, int id, int m1, int m2, int m3) {
	super();
	this.studName = studName;
	this.id = id;
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
}

//Some parameter constr.

public Student(String studName, int id) {
	super();
	this.studName = studName;
	this.id = id;
	this.m1=this.m2=this.m3=100;
}

public String getStudName() {
	return studName;
}

public void setStudName(String studName) {
	this.studName = studName;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getM1() {
	return m1;
}

public void setM1(int m1) {
	this.m1 = m1;
}

public int getM2() {
	return m2;
}

public void setM2(int m2) {
	this.m2 = m2;
}

public int getM3() {
	return m3;
}

public void setM3(int m3) {
	this.m3 = m3;
}

@Override
public String toString() {
	return "Student [studName=" + studName + ", id=" + id + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
}



}
