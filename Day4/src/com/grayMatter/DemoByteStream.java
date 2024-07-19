package com.grayMatter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoByteStream {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader obj=new BufferedReader(System.in(sc.readLine()));
		FileOutputStream fos=new FileOutputStream("data.txt");
		String s="Hello World";
		fos.write(s.getBytes());//write in here accepts byte array as parameter
		fos.close();
		
		
		FileInputStream fis= new FileInputStream("data.txt");
		int ch;
		StringBuffer sbf=new StringBuffer();
		while((ch=fis.read())!=-1)
			sbf.append((char)ch);
		System.out.println(sbf);
		fis.read();

	}

}
