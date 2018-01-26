package com.Exercise;
/**
 * equals 对比内容；
 * == 对比地址；
 * @author xiao
 *
 */
public class TestEquals {
	public static void main(String []args)
	{
		String str1 = new String("java");
		String str2 = "java";
		String str3 = "java";
		if(str2.equals(str1))
		{
			System.out.println("str2 equals str1");
		}
		else
		{
			System.out.println("str2 not equals str1");
		}
		if(str2 == str3)
		{
			System.out.println("str2 == str3");
		}
		else
		{
			System.out.println("str2 !== str3");
		}
	}
}
