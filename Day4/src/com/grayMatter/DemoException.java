package com.grayMatter;

public class DemoException {

	public static void Div(int a,int b)throws Exception {
//		throw new ArithmeticException();
		if(b==0)
			throw new Exception();
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7,den=0;
		int arr[]= {8,3,4,9};
		try {
			System.out.println(num/den);
			if(arr[0]==8)
			{
				throw new ArithmeticException();
			}
		}
//		this would work since arithmetic is first
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}
		catch(RuntimeException re) {
			re.printStackTrace();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		//ArithmeticException wont be reached since (Exception HAS Runtime HAS ArithmeticException)
//		and Exception is written at first and ArithmeticException wont have a chance to handle it
//		It has a hierarchy
//		catch(ArithmeticException ae) {
//			ae.printStackTrace();
//		}
//		
		
		finally
		{
			System.out.println("finally");
		}
		System.out.println("End of main block");//If an exception isnt handled then this wont execute
		//in such case u use finally block
		try{Div(5,0);
	}
		catch(Exception rr) {
			rr.printStackTrace();
		}
		
	}

}
