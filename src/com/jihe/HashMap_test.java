package com.jihe;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class HashMap_test {
	public static void main(String[] args) {
		Map<String, String> hmap=new HashMap<String, String>();
		hmap.put("1", "Jack");
		hmap.put("2", "Rose");
		hmap.put("3", "Pete");
		System.out.println(hmap);
		if(hmap.containsKey("1")) {
			System.out.println("这个双列集合包含键1");
			System.out.println("这个双列集合包中键1的值是"+hmap.get("1"));
		}
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		//将双列集合Map变成单列的键对象集合使用values()方法
		System.out.println("这个双列集合中所有键的集合是:"+hmap.keySet());
		System.out.println("这个双列集合中所有键的集合是:"+hmap.values());
		//将键为1的值改为Andy
		hmap.replace("1","Andy");
		System.out.println(hmap);
		//删除键为1对应的键key值+value=对entry
		hmap.remove("1");
		System.out.println(hmap);
		System.out.println("用键值对集遍历双列集合的键和值");
		Set<String> keySet = hmap.keySet();
		Iterator<String> it=keySet.iterator();
		while (it.hasNext()) {
			Object key =it.next();
			Object value=hmap.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("用键值对集遍历双列集合的键和值");
		Set<?> jianzhiduji=hmap.entrySet();
		Iterator<?> diedai2=jianzhiduji.iterator();
		while (diedai2.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry jianzhidui=(Map.Entry)diedai2.next();
			Object key=jianzhidui.getKey();
			Object value=jianzhidui.getValue();
			System.out.println(key+":"+value);	
		}
		System.out.println("用foreach键值对集遍历双列集合的键值和");
		hmap.forEach((key,value)->System.out.println(key+":"+value));
		
		System.out.println("用foreach键值对集遍历双列集合的所有值");
		Collection<String> values=hmap.values();
		values.forEach(value->System.out.println(value));
		
		Map<String, String> hmap2=new LinkedHashMap<String, String>();
		hmap2.put("1", "Jack");
		hmap2.put("2", "Rose");
		hmap2.put("3", "Pete");
		hmap2.forEach((key,value)->System.out.println(key+":"+value));
	}
}
