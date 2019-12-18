package com.inetAddress;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class E_03 {
	public static void main(String[] args) throws Exception {
		DatagramSocket client=new DatagramSocket(3000);
		String str="陈龙";
		DatagramPacket packet=new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("10.2.103.31"),8900);
		System.out.println("开始发送信息...");
		client.send(packet);
		client.close();
	}
}
