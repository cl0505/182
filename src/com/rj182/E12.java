package com.rj182;
class Student{
	static String schoolName;
}
public class E12 {

	public static void main(String[] args) {
		new Student();
		new Student();
		//类名，静态成员变量
		Student.schoolName="江汉艺术职业学院";
		System.out.println("我是"+Student.schoolName+"的学生");
		System.out.println("我是"+Student.schoolName+"的学生");

	}

}
