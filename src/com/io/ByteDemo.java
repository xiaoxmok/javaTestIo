package com.io;

/**
 * 计算字节长度
 * @author Administrator
 *
 */

public class ByteDemo {
	public static void main(String []args){
		String str = "尊敬的用户，您的用户编号：7420328615，用户名称：张国伟   5#，本月电量137，电费66.45元，目前已欠费132.9元，请及时缴费，如有疑问，请联系抄表员：何艳秋，联系电话：。123456爱爱爱";
		System.out.println(str.length());   //按符计算，
		System.out.println(str.getBytes().length);  //按字节计算
	}
}
