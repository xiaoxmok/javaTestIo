package com.Exercise;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ʹ��compara()ʵ�ְ�����������淽�����
 * 
 * @author xiao
 * 
 */

@SuppressWarnings("rawtypes")
class MyComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String aStr, bStr;
		aStr = (String) o1;
		bStr = (String) o2;
		return bStr.compareTo(aStr);
	}
}

public class ComparatorDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComp());
		ts.add("C");
		ts.add("G");
		ts.add("D");
		ts.add("B");
		ts.add("F");
		ts.add("E");
		ts.add("A");
		Iterator i = ts.iterator(); // �õ�Iterator��ʵ��������
		// ��ʾȫ������
		while (i.hasNext()) {
			Object element = i.next();
			System.out.println(element);
		}
	}
}
