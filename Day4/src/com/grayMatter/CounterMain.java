package com.grayMatter;

public class CounterMain extends Thread {
	CounterClass cc;
	
	public CounterMain() {
		super();
	}

	public CounterMain(CounterClass cc) {
		super();
		this.cc = cc;
	}
//-----------------------------------------------------------------------------	
//                 1
//	@Override
//	public void run() {
//		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(currentThread().getId());
//			cc.updateCount();
//		}
//	}
	
	//---------------------BOTH 1 AND 2 ARE EXAMPLES
	
//                 2
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			cc.updateCount();
			try {
				sleep(1000);
			}
			catch(InterruptedException r) {
				System.out.println("Interrupted");
			}
		}
	}
//-------------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterClass cc=new CounterClass();
		CounterMain cm1=new CounterMain(cc);
		CounterMain cm2=new CounterMain(cc);
		
		cm1.start();
		cm2.start();
		
		 

	}

}
