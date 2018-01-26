package com.Exercise;

class Person2 {
	private String name;
	private int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean conpare(Person2 p) {
		if (this.name.equals(p.name) && this.age == p.age) {
			return true;
		} else {
			return false;
		}
	}
}

public class ConpareDemo {
	public static void main(String[] args) {
		Person2 p1 = new Person2("china", 1001);
		Person2 p2 = new Person2("china", 100);
		System.out.println(p1.conpare(p2) ? "yes!" : "no!");
	}
}
