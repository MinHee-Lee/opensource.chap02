package practice.chap02;

import java.util.Scanner;

public class prac10 {//�� ���� ���� �Է¹ް� �� ���� ���� ��ġ���� �Ǵ��Ͽ� �浹�ϴ� ���α׷�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int x1,y1;
		int x2,y2;
		double r1,r2,distance;
		
		System.out.println("ù��° ���� �߽ɰ� ������ �Է�:");
		x1=sc.nextInt();
		y1=sc.nextInt();
		r1=sc.nextDouble();
		System.out.println("�ι�° ���� �߽ɰ� ������ �Է�:");
		x2=sc.nextInt();
		y2=sc.nextInt();
		r2=sc.nextDouble();
	
		distance=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		if(distance<=r1+r2) {
			System.out.println("�� ���� ���� ��ģ��.");
		}
		else {
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�");
		}
		sc.close();
	}

}
