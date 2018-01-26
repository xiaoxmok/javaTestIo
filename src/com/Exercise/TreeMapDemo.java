package com.Exercise;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 按首字母排序
 * compare(),两个相等返回0，当obj1大于obj2时返回正值，否则返回一个负值
 * 
 * @author xiao
 *
 */

@SuppressWarnings("rawtypes")
class Employee implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String aStr, bStr;
		int k;
		aStr = (String) o1;
		bStr = (String) o2;
		k = aStr.compareTo(bStr);	
		if(k == 0){
			return bStr.compareTo(aStr);
		}else{
			return k;
		}
	}
}

public class TreeMapDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		TreeMap tm = new TreeMap(new Employee());
		tm.put("A王五", new Integer(10005));
		tm.put("E张三", new Integer(10001));
		tm.put("C李三", new Integer(10002));
		tm.put("B张大", new Integer(10000));
		tm.put("D小三", new Integer(10004));
		//Collection col = tm.values();		
		Set set = tm.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()){
			Map.Entry me = (Entry) i.next(); 
			System.out.println(me.getKey() + ":" + me.getValue()); 
			//System.out.println(i.next());
		}
	}
}
