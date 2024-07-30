package com.grayMatter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DemoTest {

  
    public static int findKey( ) {
    	int key=12;
    	int arr[]= {12,455,67,89};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1;
    }
    @Test
    @Category(MarkerInterface.class)
	public void testAdd() {
		assertEquals((Double)10.0,(Double)App.add(3.0,7.0));
		
	}

//    @Test
//    @Category(MarkerInterface.class)
//    public static int[] arrayEquals(int[] arr) {
//        return arr;
//    }

    public static void main(String[] args) {
        
    }


	
	    
	public static Student createStudent() {
		Student st=new Student("user",123,22);
		return st;
	}
	
	
}
