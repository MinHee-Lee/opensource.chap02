package practice.chap02;

import java.util.Scanner;

public class Prac12_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      
	      double a, c, result;
	      String b; //������
	      System.out.print("����>>");
	      a = sc.nextDouble();
	      b = sc.next();
	      c = sc.nextDouble();
	      
	      //switch�� �̿�
	      switch(b) {
	      case "+" :
	         result = a+c;
	         System.out.print(a+b+c+"�� ��� ����� "+result);
	         break;
	      case "-":
	         result = a-c;
	         System.out.print(a+b+c+"�� ��� ����� "+result);
	         break;
	      case "*":
	         result = a*c;
	         System.out.print(a+b+c+"�� ��� ����� "+result);
	         break;
	      case "/":
	         if(c==0) {
	            System.out.print("0���� ���� �� �����ϴ�.");
	            break;
	         }
	         else {
	            result = a / c;
	            System.out.print(a+b+c+"�� ��� ����� "+result);
	            break;
	         }
	      default:
	         System.out.print("�߸� �Է��Ͽ����ϴ�.");
	      }
	      sc.close();
	   }
}
