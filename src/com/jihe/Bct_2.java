package com.jihe;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class CustomComparator implements Comparator<Object>{
	@Override
	public int compare(Object o1,Object o2) {
		String key1=(String) o1;
		String key2=(String) o2;
		return key1.compareTo(key2);
	}
}
public class Bct_2 {

	public static void main(String[] args) {
		Map<String, String> tmap=new HashMap<String, String>();
		tmap.put("1", "Lucy");
		tmap.put("2", "John");
		tmap.put("3", "Smith");
		tmap.put("4", "Aimee");
		tmap.put("5", "Amanda");
		System.out.println(tmap);
		
		System.out.println("用键值对集遍历双列集合的键和值");
		Set<String> keySet = tmap.keySet();
		Iterator<String> it=keySet.iterator();
		while (it.hasNext()) {
			Object key =it.next();
			Object value=tmap.get(key);
			System.out.println(key+":"+value);
		}
	}
}

