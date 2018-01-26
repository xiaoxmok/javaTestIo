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
		String[] descs = {"T恤杉", "怀子", "洋娃娃", "大头针", "钥匙链"};
		
		for(int i = 0; i < prices.length; i++){
			out.writeDouble(prices[i]);		//写入价格，使用tab隔开数据
			out.writeChar('\t');
			
			out.writeInt(units[i]);
			out.writeChar('\t');
			
			out.writeChars(descs[i]);
			out.writeChar('\n');		//结尾换行
		}
		out.close();
		
		
		DataInputStream in = new DataInputStream(new FileInputStream(f));
		double price;
		int unit;
		StringBuffer desc;
		double total = 0.0;
		try {
			while(true){
				price = in.readDouble();		//读价格
				in.readChar();			//跳过tab
				
				unit = in.readInt();
				in.readChar();
				
				char chr;				//读产品名称
				desc = new StringBuffer();
				while((chr = in.readChar()) != '\n'){
					desc.append(chr);
				}
				System.out.println("产品名称：" + desc + ",\t数量：" + unit + ",\t价格：" + price);
				total = total + unit * price ;

			}
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("总价格：" + total);
		}
		in.close();
	}
}
