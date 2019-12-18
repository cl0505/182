package com.io;
import java.io.FileReader;
import java.io.FileWriter;
public class FileReader_test {
	public static void main(String[] args) throws Exception {
		FileReader fileReader=new FileReader("test.txt");
		FileWriter fileWriter=new FileWriter("writer.txt");
		fileWriter.write("轻轻的我走了,\r\n");
		fileWriter.write("正如我慢慢的来;\r\n");
		fileWriter.write("我轻轻的招手,\r\n");
		fileWriter.write("作别西天的云彩。\r\n");
		int len=0;
		while ((len=fileReader.read())!=-1) {
			System.out.print((char)len);
		}
		fileReader.close();
		fileWriter.close();
	}

}
