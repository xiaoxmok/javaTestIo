package com.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * ʹ���ڴ��������һ����д��ĸת��ΪСд��ĸ
 * @author Administrator
 *
 */

public class TOLower {
	public static void main(String []args) throws IOException{
		String str = "THE PEOPLE'S REPUBLIC OF CHINA";
		ByteArrayInputStream input = new ByteArrayInputStream(str.getBytes());
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		int temp = 0;
		while ((temp = input.read()) != (-1)){
			char ch = (char) temp;
			output.write(Character.toLowerCase(ch));
		}
		String outstr = output.toString();
		input.close();
		output.close();
		System.out.println(outstr);
	}
}
