package com.Exercise;

import java.util.Scanner;

/**
 * 利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，
 * 60分以下的用C表示。   
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
