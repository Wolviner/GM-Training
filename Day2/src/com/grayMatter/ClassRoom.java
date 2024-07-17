package com.grayMatter;

import java.util.Arrays;

public class ClassRoom {
 int classNum;
 int floorNum;
 Student st[];
 
public ClassRoom() {
	super();
}


public ClassRoom(int classNum, int floorNum, Student st[]) {
	super();
	this.classNum = classNum;
	this.floorNum = floorNum;
	this.st=st;
}


public ClassRoom(int classNum, int floorNum) {
	super();
	this.classNum = classNum;
	this.floorNum = floorNum;
}


@Override
public String toString() {
	return "ClassRoom [classNum=" + classNum + ", floorNum=" + floorNum + ", st=" + Arrays.toString(st)
			+ ", toString()=" + super.toString() + "]";
}
 
 
}
