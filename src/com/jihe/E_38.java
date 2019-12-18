package com.jihe;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class E_38 {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("郭治民","郭治","郭民","郭民治");
		Stream<String>parallelStream=list.parallelStream();
		System.out.println(parallelStream.isParallel());
		Stream<String>stream=Stream.of("郭治民","郭治","郭民","郭民治");
		Stream<String>parallel=stream.parallel();
		System.out.println(parallel.isParallel());
	}
}
