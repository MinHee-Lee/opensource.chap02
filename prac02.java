package practice.chap02;

import java.util.Scanner;

public class prac02 {//2�ڸ� �� ������ �Է¹޾� 10�� �ڸ��� 1�� �ڸ��� ������ �Ǻ��ϴ� ���α׷�

	public static void main(String[] args) {
		System.out.println("2�ڸ��� �����Է�(10~99)");
		Scanner	sc = new Scanner(System.in);
            
		int num,a,b;
		
		num=sc.nextInt();
		
		a=num/10;
		b=num%10;//������ 10���� ���� ������, �����ڸ�
		
		if(a==b) {
			System.out.println("YES! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else {
			System.out.println("NO! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");	
		}
		
		sc.close();
		
	}

}
