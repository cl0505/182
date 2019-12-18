package com.jihe;

import java.util.TreeSet;

class Teacher implements Comparable<Object> {
	String name;
	int age;
	public Teacher (String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+":"+age;
	}
	public int compareTo(Object obj) {
		Teacher s=(Teacher)obj;
		if(this.age-s.age>0) {
			return 1;
		}
		if(this.age-s.age==0) {
			return this.name.compareTo(s.name);
		}
		return -1;
	}
}
	public class TreeSet_Comparable{
	public static void main(String[] args) {
		TreeSet<Teacher> ts=new TreeSet<Teacher>();
		ts.add(new Teacher("王雷", 23));
		ts.add(new Teacher("老民", 20));
		ts.add(new Teacher("晓誉", 19));
		ts.add(new Teacher("盼盼", 18));
		ts.add(new Teacher("谢雷", 38));
		System.out.println(ts);
	}
}
