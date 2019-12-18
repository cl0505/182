package com.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class E_01 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("d:\\cc.jpg");
		FileOutputStream fout=new FileOutputStream("cc.jpg");
		long kssj=System.currentTimeMillis();
		byte[]zjhc=new byte[1024];
		int b=fin.read();
		while(b!=-1) {
			//System.out.print((char)b);
			fout.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("拷贝40kb的图片文件耗时"+(jssj-kssj)+"毫秒");
		//fout.write(",com on!".getBytes());
		fin.close();
		fout.close();
	}
}
