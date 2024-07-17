package com.grayMatter;

public class MainClass {

	public static void main(String[] args)throws Throwable {
		
		School sc=new School("SPA","Ang");
		//sc.finalize();
//		Student st[]=new Student[3];
		Student s1=new Student("Milton",999);
		Student s2=new Student("Milan",9999);
		Student s3=new Student("Machan",98);
		Student st[]= {s1,s2,s3};
		
		ClassRoom c=new ClassRoom(7,4,st);
		System.out.println(sc);
		System.out.println(c);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		MainClass mc=new MainClass();
		mc.finalize();
		
		

	}
	@Override
	protected void finalize()throws Throwable{
		System.out.println("Manual invoke to finalize");
		System.gc();
	}

}
//Here School and ClassRoom are composite
//ClassRoom and Students are aggregate

//Explanation
//Aggregation:
//
//In ClassRoom, Student[] st represents aggregation. Here, ClassRoom "has-a" collection of Student objects (st[]). Students can exist independently and can belong to different classrooms.
//Aggregation is typically used when there is a weaker relationship between the classes, and the part (students) can exist outside the whole (classroom).
//Composition:
//
//In School, ClassRoom[] cr represents composition. School "has-a" collection of ClassRoom objects (cr[]). Classrooms are created within the context of a school and are managed by the school.
//Composition implies a stronger relationship; when School is destroyed, all ClassRoom instances (cr[]) created within it are also destroyed.
//Summary
//Aggregation is used to represent "has-a" relationships where objects can exist independently.
//Composition is used when one object is made up of other objects, and there's a whole-part relationship, with the parts being managed by the whole.
//In your code:
//
//ClassRoom aggregates Student objects (st[]).
//School composes ClassRoom objects (cr[]).

//-------------------------------------------------------------------------------------------------------
//Car and Engine-----Composition
//Order and Item------Aggregation

//-------------------------------------------------------------------------------------------------------


//GARBAGE COLLECTION AND FINALIZE METHOD
//The finalize() method is used for performing cleanup actions on an object before it is garbage collected. Garbage collection is the process by which Java automatically reclaims memory occupied by objects that are no longer reachable or referenced by any active part of the program.

