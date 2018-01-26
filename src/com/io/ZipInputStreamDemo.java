package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;



public class ZipInputStreamDemo {
	public static void main(String []args) throws IOException{
		File f = new File("F:" + File.separator + "hello.zip");
		if (!f.exists()){
			System.out.println(f.getName() + "不存在");
			System.exit(0);
		}
		File outFile = null;
		ZipFile zipFile = new ZipFile(f);
		ZipInputStream zipInput = new ZipInputStream(new FileInputStream(f));
		ZipEntry entry = null;
		InputStream input = null;
		OutputStream output = null;
		while ((entry = zipInput.getNextEntry()) != null){
			System.out.println("解压缩" + entry.getName() + "文件");
			outFile = new File("F:" + File.separator + entry.getName());
			if (!outFile.getParentFile().exists()){
				outFile.getParentFile().mkdir();
			}
			if (!outFile.exists()){
				outFile.createNewFile();
			}
			input = zipFile.getInputStream(entry);
			output = new FileOutputStream(outFile);
			int temp = 0;
			while ((temp = input.read()) != -1){
				output.write(temp);
			}
			input.close();
			output.close();
		}
	}
}
