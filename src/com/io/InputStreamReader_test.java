package com.io;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
public class InputStreamReader_test {
	public static void main(String[] args) throws Exception {
		//InputStream jpsr=System.in;
		//InputStreamReader ir=new InputStreamReader(jpsr);
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入年龄:");
		String line=bReader.readLine();
		System.out.println("您的年龄是:"+line);
	}
}
