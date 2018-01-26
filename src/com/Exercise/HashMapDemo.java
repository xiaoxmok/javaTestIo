package com.Exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		HashMap hm = new HashMap();		//创建HashMap对象
		hm.put("张三", new Double(1213));		//加入元素
		hm.put("李四", new Double(32.33));		
		hm.put("王五", new Double(32443.33));
		hm.put("朱六", new Double(66.53));
		hm.put("卓七", new Double(72.33));
		Set set = hm.entrySet();			//返回包含映射中的集合
		Iterator i = set.iterator();		//用Iterator得到HashMap的项
		while(i.hasNext()){					//显示元素
			Map.Entry me = (Map.Entry) i.next();		//Map.Entry可操作映射输入	
			System.out.println(me.getKey() + ":" + me.getValue());
		}
		double d = ((Double) hm.get("李四")).doubleValue();		//让李四的值增加1000
		hm.put("李四", new Double(d + 1000));		//用新值替换旧值
		System.out.println("李四now：" + hm.get("李四"));
	}
}
