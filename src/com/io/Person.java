package com.io;

import java.io.Serializable;

/**
 * ��������л�
 * @author Administrator
 *
 *
 *�������л�ʲô�����أ���ʵֻ�����Իᱻ���л���
 *
 *
 */

@SuppressWarnings("serial")	//����ע�������Ǹ�������һ��ָ��������Ա���ע�Ĵ���Ԫ���ڲ���ĳЩ���汣�־�Ĭ�� 
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
		return "������" + name + "�����䣺" + age;
	}
	private String name;
	//private transient String name;
	private int age;
	
	/*Serializable�ӿ�ʵ�ֵĲ�����ʵ�ǰ�һ�������е�ȫ�����Խ������л���
	��ȻҲ����ʹ��������ʹ����Externalizable�ӿ���ʵ�ֲ������Ե����л���
	���������Ĳ����Ƚ��鷳��������ʹ��Serializable�ӿ�ʵ�����л�������ʱ��
	���һ�������ĳһ�����Բ��뱻���л�������������ô���ǿ���ʹ��transient�ؼ��ֽ���˵����*/

	
}

