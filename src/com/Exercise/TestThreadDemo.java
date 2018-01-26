package com.Exercise;

public class TestThreadDemo {
	public static void main(String[] args){
		TestThread t = new TestThread();
		//启动四个线程，实现资源共享的目的。
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}
class TestThread implements Runnable{
	private int tickets = 20;
	boolean flag = true;
	public void stopFlag(){
		flag = false;
	}
	public void run() {
		while(flag){
			sale();
		}
	}
	public synchronized void sale(){
		if(tickets > 0){
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
			System.out.println(Thread.currentThread().getName() + "出售票" + tickets--);
		}else{
			stopFlag();
		}
	}
}
