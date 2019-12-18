package com.io;
import java.io.File;
import java.util.Arrays;
public class FileList_test {
	public static void main(String[] args) {
		File file=new File("D:\\Favorites");
		if (file.isDirectory()) {
			String[]fileNames=file.list();
			Arrays.stream(fileNames)
				.forEach(f->System.out.println(f));
		}
	}
}
