package com.Exercise;

class Person1{
	private String name;
	private int age;
	public String talk(){
		return "name :" + name + "," + "age:" + age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
public class TalkDemo {
	public static void main(String[] args){
		Person1 p = null;
		Person1 p1 = null;
		p1 = new Person1();
		p = p1;
		p.setName("china");
		p.setAge(23);
		System.out.println(p.talk());
		p1 = null;
	}
}
