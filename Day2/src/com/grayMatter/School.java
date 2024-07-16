package com.grayMatter;

import java.util.Arrays;

public class School {
String schoolName;
String address;

ClassRoom cr[];

public School() {
	super();//call superclass constructor if present here its not there 
}
public School(String schoolName, String address) {
	super();
	this.schoolName = schoolName;
	this.address = address;
	ClassRoom c1=new ClassRoom(3,2);
	ClassRoom c2=new ClassRoom(35,1);
	
	ClassRoom cr[]=new ClassRoom[2];//ClassRoom array
	cr[0]=c1;
	cr[1]=c2;
	this.cr = cr;
}
@Override
public String toString() {
	return "School [schoolName=" + schoolName + ", address=" + address + ", cr=" + Arrays.toString(cr) + ", toString()="
			+ super.toString() + "]";
}

@Override
protected void finalize()throws Throwable{
	System.out.println("Manual invoke to finalize");
	System.gc();
}

}
