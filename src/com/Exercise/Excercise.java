package com.Exercise;

import java.util.Scanner;

/**
 * ���������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��
 * 60�����µ���C��ʾ��   
 * @author Administrator
 *
 */


public class Excercise {
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		int x;
		char grade;
		x = s.nextInt();
		grade = x >= 90 ? 'A' : x >= 60 ? 'B' : 'C';
		System.out.println(grade);
	}
}
