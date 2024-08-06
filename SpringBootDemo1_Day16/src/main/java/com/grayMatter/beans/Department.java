package com.grayMatter.beans;

import java.util.Set;

public class Department {
 private int depid;
 private Set<String> depname;
public int getDepid() {
	return depid;
}
public void setDepid(int depid) {
	this.depid = depid;
}
public Set<String> getDepname() {
	return depname;
}
public void setDepname(Set<String> depname) {
	this.depname = depname;
}
public Department(int depid, Set<String> depname) {
	super();
	this.depid = depid;
	this.depname = depname;
}
public Department() {
	super();
}
@Override
public String toString() {
	return "Department [depid=" + depid + ", depname=" + depname + "]";
}

 
}
