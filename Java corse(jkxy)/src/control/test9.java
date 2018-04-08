package control;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//步骤一：创建scanner 对象。
		System.out.println("姓名：");
		//步骤二：向控制台输出文本。
		String name=scanner.next();
		System.out.println("性别：");
		char sex=scanner.next().charAt(0);
		System.out.println("年龄：");
		int age=scanner.nextInt();
		System.out.println("身高：");
		double height=scanner.nextDouble();
		System.out.println("我叫"+name+",我是一名"+sex+",我今年"+age+"岁，我身高是"+height);
	
	}

}
