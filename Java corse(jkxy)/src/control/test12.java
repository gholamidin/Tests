package control;


import java.util.Scanner;

import sun.applet.Main;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入月份：");
		int Month=scanner.nextInt();
		switch (Month) {
		case 1:
		case 5:
		case 3:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("改月份为31天");
			break;
		default:
			System.out.println("改月份为30天");
			break;
		}
		

	}

}
