package com.Exercise;

class Producer implements Runnable{
	P p = null;
	public Producer(P p){
		this.p = p;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(true){
			//for(int i = 0; i >= 10; i++){ 
				if(i == 0){
					p.Set("张三", "女");
				}else{
					p.Set("李四", "男");
				}
			//}
			i = (i + 1) % 2;
		}
	}
}
class P{
	private String name;
	private String sex;
	public synchronized void Set(String name , String sex){
		this.name = name;
		this.sex = sex;
	}
	public synchronized void Get(){
		System.out.println(this.name + "---->" + this.sex);
	}
}


class Cousumer implements Runnable{
	P p = null;
	public Cousumer(){
		
	}
	public Cousumer(P p){
		this.p = p;
	}
	boolean flag = true;
	public void stopFlag(){
		flag = false;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(flag){
			p.Get();
		}
	}
}
public class ThreadCoummunation {
	public static void main(String[] args){
		P p = new P();
		new Thread(new Producer(p)).start();
		new Thread(new Cousumer(p)).start();
		
	}
}
