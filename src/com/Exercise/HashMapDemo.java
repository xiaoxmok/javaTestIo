package com.Exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		HashMap hm = new HashMap();		//����HashMap����
		hm.put("����", new Double(1213));		//����Ԫ��
		hm.put("����", new Double(32.33));		
		hm.put("����", new Double(32443.33));
		hm.put("����", new Double(66.53));
		hm.put("׿��", new Double(72.33));
		Set set = hm.entrySet();			//���ذ���ӳ���еļ���
		Iterator i = set.iterator();		//��Iterator�õ�HashMap����
		while(i.hasNext()){					//��ʾԪ��
			Map.Entry me = (Map.Entry) i.next();		//Map.Entry�ɲ���ӳ������	
			System.out.println(me.getKey() + ":" + me.getValue());
		}
		double d = ((Double) hm.get("����")).doubleValue();		//�����ĵ�ֵ����1000
		hm.put("����", new Double(d + 1000));		//����ֵ�滻��ֵ
		System.out.println("����now��" + hm.get("����"));
	}
}
