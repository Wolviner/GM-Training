package com.grayMatter;

public class Sender <T> {
	T msg;//instance variable of type T
	
	public void setMsg(T msg) {
		this.msg=msg;
	}
	
	public void sendMsg() {
	System.out.println("From sender to receiver "+msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sender <String> strmsg=new Sender<String>();
		strmsg.setMsg("hello");
		strmsg.sendMsg();

	}

}
