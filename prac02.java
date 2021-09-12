package practice.chap02;

import java.util.Scanner;

public class prac02 {//2자리 수 정수를 입력받아 10의 자리와 1의 자리가 같은지 판별하는 프로그램

	public static void main(String[] args) {
		System.out.println("2자리수 정수입력(10~99)");
		Scanner	sc = new Scanner(System.in);
            
		int num,a,b;
		
		num=sc.nextInt();
		
		a=num/10;
		b=num%10;//정수를 10으로 나눈 나머지, 일의자리
		
		if(a==b) {
			System.out.println("YES! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("NO! 10의 자리와 1의 자리가 다릅니다.");	
		}
		
		sc.close();
		
	}

}
