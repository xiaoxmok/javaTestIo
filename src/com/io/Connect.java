package com.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道流
 * PipedOutputStream 管道输入流
 * PipedInputStream	管道输出流
 * @author Administrator
 *
 */

class Send implements Runnable{
	private PipedOutputStream output = null;
	public Send(){
		this.output = new PipedOutputStream();
	}
	public PipedOutputStream getOutput(){
		return this.output;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str = "hello china.";
		try {
			output.write(str.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		try {
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class Recive implements Runnable{
	private PipedInputStream input = null;
	public Recive(){
		this.input = new PipedInputStream();
	}
	public PipedInputStream getInput(){
		return this.input;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		byte[] b = new byte[1000];
		int len = 0;
		try {
			len = this.input.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new String(b, 0, len));
	}
	
}

public class Connect{
	public static void main(String []args){
		Send s = new Send();
		Recive r = new Recive();
		try {
			s.getOutput().connect(r.getInput());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(s).start();
		new Thread(r).start();
	}
}