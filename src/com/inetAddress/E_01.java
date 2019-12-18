package com.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class E_01 {

	public static void main(String[] args) throws Exception {
		InetAddress localAddress=InetAddress.getLocalHost();
		InetAddress remoteAddress=InetAddress.getByName("www.baidu.com");
		System.out.println("本机的IP地址:"+localAddress.getHostAddress());
		System.out.println("itcast的IP地址:"+remoteAddress.getHostAddress());
		System.out.println("3秒内是否可以访问:"+remoteAddress.isReachable(3000));
		System.out.println("itcast的主机名为:"+remoteAddress.getHostName());
	}

}
