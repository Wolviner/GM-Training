package com.grayMatter;


import java.util.*;
import java.util.Scanner;

public class DemoOnArray {
	public static int dupe(int arr[],int num) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
				count++;
		}
		System.out.println("Count="+count);
		return count;
		
	}
	
	public static void insertAtPos(int arr[],int pos,int element,int size) {
		 if (arr.length==size) {
	            System.out.println("Array is already full.");
	            return;
	        }

	        
	        for (int i = arr.length - 1; i > pos; i--) {
	            arr[i] = arr[i - 1];
	        }

	        
	        arr[pos] = element;

	        System.out.println("Original Array: " + Arrays.toString(arr));
		
	}
	
	public static void insertAtLast(int arr[],int element) {
		
	}
	public static boolean isPrime(int num) {
		boolean flag=true;
		if(num==0||num==1) {
//			System.out.println("Not prime");
			flag=false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
//				System.out.println("Not prime");
				flag=false;
			}
		}
		if(flag==true)
		{
//			System.out.println("Element is prime");
		}
		return flag;
	}
	
	public static void binSearch(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(key==arr[mid]) {
				System.out.println("Element found");
				break;
			}
			else if(key<arr[mid]) {
				high=mid-1;
				
			}
			else
				low=mid+1;
		}
	}
	public static void linSearch(int arr[],int key) {
		int i=0;
		for( i=0;i<arr.length;i++)
		{
			if(arr[i]==key) {
				System.out.println("Element found");
				break;
			}
		}
		if(i==arr.length)
		{
			System.out.println("Not found");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		arr[0]=0;arr[3]=25;
		int arr1[]= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.println("prime");
			}
			else
				System.out.println("not prime");
		}
		int key;
		System.out.println("Enter element to be searched");
		key=sc.nextInt();
		System.out.println("Enter element to be inserted and position");
		int element=sc.nextInt();
		int pos=sc.nextInt();
		linSearch(arr,key);
		binSearch(arr,key);
		dupe(arr,key);
		insertAtPos(arr,key,pos,arr.length);
		
		//int gg[]= {1,2,3,34,67};
		
		
	}

}
//----------ARRAY------------------------
//
//delete an element at a given position
//find no.of duplicates for a given element
//insert an element at a given position
//insert an element at the last position

//--------------MATRIX ARRAY---------------
//
//    Jagged Array
//int arr[][] = new int[3][];This is called jagged array
//Where there are 3 rows and each row can be used to have diffferne tnumber of colums
//int arr[][] = new int[3][];
//arr[0] = new int[2];   // First row has 2 columns
//arr[1] = new int[3];   // Second row has 3 columns
//arr[2] = new int[1];   // Third row has 1 column

