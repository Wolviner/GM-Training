package com.grayMatter;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("From run method in myrunnable class implementing runnable interface");

	}

}


//ex for runnable interface implemented
//public class MyRunnable implements Runnable {
//
//    @Override
//    public void run() {
//        // Task to be executed by the thread
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello from MyRunnable: " + i);
//            try {
//                Thread.sleep(1000); // Simulate some task
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable();
//
//        // Create a new thread with MyRunnable as the target
//        Thread thread = new Thread(myRunnable);
//
//        // Start the thread
//        thread.start();
//
//        // Main thread continues with other tasks
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Hello from Main: " + i);
//            try {
//                Thread.sleep(1500); // Simulate main thread task
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
