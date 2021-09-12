package practice.chap02;

import java.util.Scanner;

public class prac12 {//사칙 연산을 입력받아 계산하는 프로그램
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      
	      double a, c, result;
	      String b; //연산자
	      System.out.print("연산>>");
	      a = sc.nextDouble();
	      b = sc.next();
	      c = sc.nextDouble();
	      
	      //if-else문 이용
	      if(b.equals("+")) {
	         result = a + c;
	         System.out.print(a+b+c+"의 계산 결과는 "+result);
	      }
	      else if(b.equals("-")) {
	         result = a - c;
	         System.out.print(a+b+c+"의 계산 결과는 "+result);
	      }
	      else if(b.equals("*")) {
	         result = a * c;
	         System.out.print(a+b+c+"의 계산 결과는 "+result);
	      }
	      else if(b.equals("/")) {
	         if(c==0) {
	            System.out.print("0으로 나눌 수 없습니다.");
	         }
	         else {
	            result = a / c;
	            System.out.print(a+b+c+"의 계산 결과는 "+result);
	         }
	      }
	      sc.close();
	   }
	}

