package practice.chap02;

import java.util.Scanner;

public class prac04 {//정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하는 프로그램

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("정수 3개 입력");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		if((a>b&&c>a)||(b>a&&a>c)) {
			System.out.print("중간 값은 "+a);
		}
		else if((a<b&&b<c)||(c<b&&b<a)) {
			System.out.print("중간 값은 "+b);
		}
		else {
			System.out.print("중간 값은 "+c);
		}
		
		sc.close();

	}

}
