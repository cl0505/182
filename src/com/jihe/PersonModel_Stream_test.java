package com.jihe;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class PersonModel_Stream_test {

	public static void main(String[] args) {
		List<PersonModel> list=new ArrayList<>();
		PersonModel p1=new PersonModel("Wang Yu",18,"男");
		PersonModel p2=new PersonModel("Zhang San",20,"男");
		PersonModel p3=new PersonModel("Li Si",22,"女");
		PersonModel p4=new PersonModel("Zhao qiao",28,"男");
		list=Arrays.asList(p1,p2,p3,p4);
		
		for(PersonModel pm:list) {
			System.out.println(pm.getName());
		}
		List<String> list2=list.stream().map(a->a.getName()).collect(Collectors.toList());
		System.out.println(list2);
		
		List<String> list3=list.stream().map(PersonModel::getName).collect(Collectors.toList());
		System.out.println(list3);
		
		List<String> list4=list.stream().map(a->{
			System.out.println(a.getName());
			return a.getName();
		}).collect(Collectors.toList());
		System.out.println(list4);
	}
}
