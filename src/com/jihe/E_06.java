package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class E_06 {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("Guo");
		list.add("Annie");
		list.add("Zhi");
		list.add("Min");
		Iterator<String> it=list.iterator();
		while (it.hasNext()) {
			Object obj=it.next();
			if("Annie".equals(obj)) {
				list.remove(obj);
				break;
			}
		}
		System.out.println(list);
	}
}
