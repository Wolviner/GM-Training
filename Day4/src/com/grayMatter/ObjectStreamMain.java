package com.grayMatter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamMain {
	
public static void main(String[] args)  throws IOException, ClassNotFoundException{
	Customer c=new Customer("Milton",999);
	//to read and write objects to file
	FileOutputStream fos=new FileOutputStream("obj.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(c);
	oos.close();
	fos.close();
	
	FileInputStream fis=new FileInputStream("obj.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Customer c1=(Customer)ois.readObject();
	System.out.println(c1);
	
//		File f=new File("myFile.txt");
	
}
}
//replace character s with *


//Further explanation
//The code snippet you've provided demonstrates how to serialize an object (Customer in this case) 
//to a file (obj.txt) using ObjectOutputStream, and then deserialize it back into an object
//using ObjectInputStream.

//Serialization is the process of converting an object into a byte stream so that it can be 
//stored in a file or sent over a network. In Java, you use ObjectOutputStream to serialize 
//an object.

//Deserialization is the process of converting a byte stream back into an object. 
//In Java, you use ObjectInputStream to deserialize an object.

