

package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * �ֽ���
 * ��len��Ϊ����������й���Ŀո�
 * @author Administrator
 *
 */


public class InputStreamDemo{
	public static void main(String []args) throws IOException{
		String fileName = "F:" + File.separator + "hello.txt";
		File f = new File(fileName);
		InputStream in = new FileInputStream(f);
		//byte[] b = new byte[1024];
		byte[] b = new byte[(int) (f.length())];	//�Զ�ʶ�����ݵĳ���
		int len = in.read(b);	//���ĳ���
		in.read(b);
		/*for (int i = 0; i < f.length(); i++){
			b[i] = (byte) in.read();
		}*/			//һ���ֽ�һ���ֽڵĶ�
		in.close();
		System.out.println("����ĳ���Ϊ��" + len);
		System.out.println(new String(b, 0, len));
	}
}