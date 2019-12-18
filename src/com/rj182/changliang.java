package com.rj182;

public class changliang {
	//ctrl+shift+f 自动对齐
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//字面上的常量
		System.out.println("二进制以0b开头"+0b11000110);
		System.out.println("八进制以0开头"+0306);
		//0123456789abcdef
		System.out.println("十六进制以0x开头"+0xc6);
		//字面上的浮点型常量
		System.out.println("单精度浮点数以f结尾"+5.022e+6f);
		System.out.println("双精度浮点数以d结尾"+5.022e+6d);
		System.out.println("双精度浮点数d可以省略"+5.022e+6);
		//java中的字符使用单引号，采用16位unicode编码，用\\uxxx来表示
		System.out.println("我的名字"+'\u90ed'+'\u6cbb'+'\u6c11');
		//Java中的字符串常量使用双引号括起来
		System.out.println("Hello,\nSeptember!");
		//Java中的布尔常量只有两个，真true 假false
		System.out.println("布尔型常量"+true+"或者"+false);
		//Java中的null常量，只能是引用数据类型
		System.out.println("null常量只有一个"+null+",表示空对象");
	}

}
