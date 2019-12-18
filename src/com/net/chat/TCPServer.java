package com.net.chat;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket fwqtjz=new ServerSocket(8899);
		while(true) {
			Socket khdtjz=fwqtjz.accept();
			new Thread(()->{
				try {
				String ip=khdtjz.getInetAddress().getHostAddress();
				int port=khdtjz.getPort();
				System.out.println("和客户端ip地址是"+ip+"端口是"+port+"连接上了");
				InputStream is;
					is = khdtjz.getInputStream();
				byte[]zjhc=new byte[1024];
				FileOutputStream fout=new FileOutputStream("d:\\upload\\"+ip+"jpg");
				int b=is.read(zjhc);
				while(b!=-1) {
					fout.write(zjhc,0,b);
					b=is.read(zjhc);
				}
				String xinxi="文件上传成功";
				zjhc=new byte[1024];
				OutputStream os=khdtjz.getOutputStream();
				os.write(xinxi.getBytes("UTF-8"));
				os.close();
				khdtjz.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}).start();
		}
	}
}
