package practice.chap02;

import java.util.Scanner;

public class prac08 {//�� ������ �̷���� ���簢���� �浹�ϴ��� �Ǻ��ϴ� ���α׷�

	public static boolean inRect(int x,int y) {
		if((x>=10&&x<=200)&&(y>=100&&y<=200)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int x1,y1;
		int x2,y2;
		boolean a,b;
		
		System.out.println("(x1,y1)�� ���� �Է����ּ��� >>");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("(x2,y2)�� ���� �Է����ּ��� >>");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		a=inRect(x1,y1);
		b=inRect(x2,y2);
	
		if(a==true||b==true)
			System.out.println("�� �簢���� �浹�մϴ�.");
		else
			System.out.println("�� �簢���� �浹���� �ʽ��ϴ�.");
		
		sc.close();
		
	}

}
