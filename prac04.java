package practice.chap02;

import java.util.Scanner;

public class prac04 {//���� 3���� �Է¹ް� 3���� ���� �� �߰� ũ���� ���� ����ϴ� ���α׷�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("���� 3�� �Է�");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		if((a>b&&c>a)||(b>a&&a>c)) {
			System.out.print("�߰� ���� "+a);
		}
		else if((a<b&&b<c)||(c<b&&b<a)) {
			System.out.print("�߰� ���� "+b);
		}
		else {
			System.out.print("�߰� ���� "+c);
		}
		
		sc.close();

	}

}
