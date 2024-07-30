package com.grayMatter;

public class Calculator {

    
    public static int findKey(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1;
    }

    
    public static int[] arrayEquals(int[] arr) {
        return arr;
    }

    public static void main(String[] args) {
        
    }


	public static String checkString() {
		// TODO Auto-generated method stub
		String s=null;
		return s;
	}
	public static Student createStudent() {
		Student st=new Student("user",123,22);
		return st;
	}
	
	
}
