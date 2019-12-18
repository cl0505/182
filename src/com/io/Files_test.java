package com.io;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception {
		Path lujing=Paths.get("D:\\Favorites1\\44");
		Files.createDirectories(lujing);
		Path wj=Paths.get("D:\\Favorites1\\44\\test.txt");
		Files.createFile(wj);
		List<String> neirong=new ArrayList<String>();
		neirong.add("这是一个测试文件");
		Files.write(wj, neirong, StandardOpenOption.APPEND);
		List<String>list=Files.readAllLines(wj);
		System.out.println("文件内容为:"+list);
		System.out.println("文件大小为:"+Files.size(wj)+"个字节");
	}

}
