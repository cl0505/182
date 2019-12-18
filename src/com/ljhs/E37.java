package com.ljhs;
class person{
	public void finalize() {
		System.out.println("对象将被作为垃圾回收...");
	}
}
public class E37 {
	 public static void recyclegWaste1() {
		 new person();
		 int i=1;
		 while (i<10) {
			 System.out.println("方法1循环中..");
			 i++;
		 }
	 }
	 public static void recyclegWaste2() {
		 new person();
		 System.gc();
		 int i=1;
		 while (i<10) {
			 System.out.println("方法2循环中..");
			 i++;
		 }
	 }
	public static void main(String[] args) {
		recyclegWaste1();
		System.out.println("=========");
		recyclegWaste2();
	}
}
