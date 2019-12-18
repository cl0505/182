package com.thread;

class MyThread2 implements Runnable{
	public void run() {
		int i=0;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}	
}
public class Thread_test2 {
	public static void main(String[] args) {
		MyThread2 mthread1=new MyThread2();
		Thread thread1=new Thread(mthread1,"thread1");
		thread1.start();
		MyThread2 mthread2=new MyThread2();
		new Thread(mthread2,"thread1").start();
	}
}
