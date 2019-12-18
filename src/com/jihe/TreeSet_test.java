package com.jihe;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(25);
		ts.add(8);
		ts.add(17);
		ts.add(13);
		ts.add(11);
		ts.add(1);
		ts.add(15);
		System.out.println("创建的TreeSet为"+ts);
		System.out.println("TreeSet首元素为"+ts.first());
		System.out.println("TreeSet中小于等于9的最大一个元素为"+ts.floor(9));
		System.out.println("创建的TreeSet为"+ts);
	}

}
