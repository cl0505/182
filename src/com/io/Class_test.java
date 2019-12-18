package com.io;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
public class Class_test {

	public static void main(String[] args) throws Exception {
		Path wj=Paths.get("D:\\班级信息.txt");
		Path bjmc=Paths.get("D:\\求班级编号.txt");
		Path bjbh=Paths.get("D:\\班级编号.txt");
		List<String>list=Files.readAllLines(wj);
		List<String>names=Files.readAllLines(bjmc);
		List<String>neirong=new ArrayList<String>();
		Files.createFile(bjbh);
		//System.out.println("文件内容为:"+list);
		//System.out.println("文件大小为:"+Files.size(wj)+"个字节");
		for (String name : names) {
			for (String line : list) {
				String[] zfcsz=line.split("\t");
		if (name.equals(zfcsz[1])) {
			System.out.println(zfcsz[0]);
			neirong.add(zfcsz[0]);
		}
			
		}
	}
		Files.write(bjbh, neirong, StandardOpenOption.APPEND);
	
	}
}
