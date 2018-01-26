package com.io;

import java.io.Serializable;

/**
 * 对象的序列化
 * @author Administrator
 *
 *
 *到底序列化什么内容呢？其实只有属性会被序列化。
 *
 *
 */

@SuppressWarnings("serial")	//该批注的作用是给编译器一条指令，告诉它对被批注的代码元素内部的某些警告保持静默。 
public class Person implements Serializable {
	public Person(){
		
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名：" + name + "，年龄：" + age;
	}
	private String name;
	//private transient String name;
	private int age;
	
	/*Serializable接口实现的操作其实是吧一个对象中的全部属性进行序列化，
	当然也可以使用我们上使用是Externalizable接口以实现部分属性的序列化，
	但是这样的操作比较麻烦，当我们使用Serializable接口实现序列化操作的时候，
	如果一个对象的某一个属性不想被序列化保存下来，那么我们可以使用transient关键字进行说明：*/

	
}

