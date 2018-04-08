package control;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner =new Scanner(System.in);
     System.out.println("输入分数：");
     int score=scanner.nextInt();
     boolean isPass;
     isPass=score>=60;
     System.out.println(score+"及格"+isPass);
	}

}
