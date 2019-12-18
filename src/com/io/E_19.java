package com.io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class E_19 {

	public static void main(String[] args) throws Exception {
		RandomAccessFile infile=new RandomAccessFile("cc.jpg", "rw");
		FileChannel inChannel=infile.getChannel();
		RandomAccessFile outfile=new RandomAccessFile("ll.jpg", "rw");
		FileChannel outChannel=outfile.getChannel();
		long transferTo=inChannel.transferTo(0, inChannel.size(), outChannel);
		if (transferTo>0) {
			System.out.println("复制成功！");
		}
		infile.close();
		inChannel.close();
		outfile.close();
		outChannel.close();
	}

}
