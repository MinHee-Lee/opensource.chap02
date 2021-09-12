package practice.chap02;

import java.util.Scanner;

public class prac06 {//369 게임 프로그램

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1-99 사이의 정수를 입력하시오");
		Scanner sc= new Scanner(System.in);
		
		int num,a=1,b;
		
		num=sc.nextInt();
		
		b=num%10;
		
		if(num>=10) {
			a=num/10;
		}
		if(num%10==0) {
			b=-1;
		}
		
		System.out.print("박수");
		if(a%3==0)
		System.out.print("짝");
		if(b%3==0)
			System.out.println("짝");
		
		sc.close();
	}
	

}