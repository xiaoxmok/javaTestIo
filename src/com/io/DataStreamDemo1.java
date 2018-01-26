package com.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;



public class DataStreamDemo1 {
	public static void main(String[] args) throws Exception{
		File f = new File("E:" + File.separator + "hello.txt");
		if(!f.exists()){
			f.createNewFile();
		}
		DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
		double[] prices = {18.99, 9.22, 14.22, 5.22, 4.21};
		int[] units = {10, 10, 20, 39, 40};
		String[] descs = {"T��ɼ", "����", "������", "��ͷ��", "Կ����"};
		
		for(int i = 0; i < prices.length; i++){
			out.writeDouble(prices[i]);		//д��۸�ʹ��tab��������
			out.writeChar('\t');
			
			out.writeInt(units[i]);
			out.writeChar('\t');
			
			out.writeChars(descs[i]);
			out.writeChar('\n');		//��β����
		}
		out.close();
		
		
		DataInputStream in = new DataInputStream(new FileInputStream(f));
		double price;
		int unit;
		StringBuffer desc;
		double total = 0.0;
		try {
			while(true){
				price = in.readDouble();		//���۸�
				in.readChar();			//����tab
				
				unit = in.readInt();
				in.readChar();
				
				char chr;				//����Ʒ����
				desc = new StringBuffer();
				while((chr = in.readChar()) != '\n'){
					desc.append(chr);
				}
				System.out.println("��Ʒ���ƣ�" + desc + ",\t������" + unit + ",\t�۸�" + price);
				total = total + unit * price ;

			}
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("�ܼ۸�" + total);
		}
		in.close();
	}
}
