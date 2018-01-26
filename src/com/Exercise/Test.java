package com.Exercise;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("张三", 30);
		Person p2 = new Person("张三", 30);
		System.out.println(p1.print(p2));
		System.out.println(p1.compare(p2) ? "true" : "false");
	}
}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String print(Person p) {
		return this.name + this.age + ";" + p.name + p.age;

	}

	boolean compare(Person p) {
		if ((this.equals(p)) || (this == p)) {
			return true;
		} else {
			return false;
		}

		/*
		 * if(this.name == p.name && this.age == p.age){ return true; }else{
		 * return false; }
		 */
	}
}
