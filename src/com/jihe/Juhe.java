package com.jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhe {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("陈盼");
		list.add("郭治");
		list.add("郭治民");
		list.add("郭民");
		
		Stream<String> stream=list.stream();
		stream.forEach(j->System.out.println(j));
		Stream<String> stream2=list.stream();
		Stream<String> stream3=stream2.filter(i->i.startsWith("郭"));
		
		System.out.println("集合里所有姓郭的人:");
		stream3.forEach(j->System.out.println(j));
		
		System.out.println("集合里所有姓郭的人:");
		list.stream().skip(1).limit(3).forEach(System.out::println);
		
		System.out.println("集合里所有姓郭的人:");
		System.out.println(list.stream().skip(1).limit(3).collect(Collectors.joining("and")));
	}

}
