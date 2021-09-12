package practice.chap02;

import java.util.Scanner;

public class prac08 {//두 점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램

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
		
		System.out.println("(x1,y1)의 값을 입력해주세요 >>");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("(x2,y2)의 값을 입력해주세요 >>");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		a=inRect(x1,y1);
		b=inRect(x2,y2);
	
		if(a==true||b==true)
			System.out.println("두 사각형은 충돌합니다.");
		else
			System.out.println("두 사각형은 충돌하지 않습니다.");
		
		sc.close();
		
	}

}
