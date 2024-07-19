package com.grayMatter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fc=new File("dem.txt");
		System.out.println(fc.getName());
		System.out.println(fc.getPath());
		System.out.println(fc.getParent());
		System.out.println(fc.getAbsolutePath());
		System.out.println(fc.canRead());
		System.out.println(fc.canWrite());
		System.out.println(fc.canExecute());
		
		FileWriter wr=new FileWriter(fc);
		
		String str="Hello Man";
		for(char c:str.toCharArray()) {
			
			wr.write(c);//write accepts character
		}
		wr.close();
		
		
		FileReader rd=new FileReader(fc);
		int ch;
		StringBuffer sbf=new StringBuffer();
		
		while((ch=rd.read())!=-1) //-1 denote end of stream or file
			sbf.append((char)ch);
		String s=sbf.toString();
		System.out.println(s);
		rd.close();
			
		
		
		
		
		

	}

}
