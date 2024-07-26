package com.grayMatter.assg;

public class TernaryOperator {
public static void main(String[] args) {
	int a=99,b=999,c=30,d=40,g=50;
	//4 variables
	//Using AND
	int e=(a>b&&a>c&&a>d)?a:(b>c&&b>d)?b:(c>d?c:d);
	
	//Without using AND
//	e=(a>b)?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d));
	
	//5 variables
	int z= (a > b && a > c && a > d && a > e) ? a :
        (b > c && b > d && b > e) ? b :
        (c > d && c > e) ? c :
        (d > e ? d : e);

			
	System.out.println(e);
	System.out.println(z);
}
}
