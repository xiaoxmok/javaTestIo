package com.io;

/**
 * �����ֽڳ���
 * @author Administrator
 *
 */

public class ByteDemo {
	public static void main(String []args){
		String str = "�𾴵��û��������û���ţ�7420328615���û����ƣ��Ź�ΰ   5#�����µ���137�����66.45Ԫ��Ŀǰ��Ƿ��132.9Ԫ���뼰ʱ�ɷѣ��������ʣ�����ϵ����Ա���������ϵ�绰����123456������";
		System.out.println(str.length());   //�������㣬
		System.out.println(str.getBytes().length);  //���ֽڼ���
	}
}
