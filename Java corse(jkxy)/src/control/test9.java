package control;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//����һ������scanner ����
		System.out.println("������");
		//������������̨����ı���
		String name=scanner.next();
		System.out.println("�Ա�");
		char sex=scanner.next().charAt(0);
		System.out.println("���䣺");
		int age=scanner.nextInt();
		System.out.println("��ߣ�");
		double height=scanner.nextDouble();
		System.out.println("�ҽ�"+name+",����һ��"+sex+",�ҽ���"+age+"�꣬�������"+height);
	
	}

}
