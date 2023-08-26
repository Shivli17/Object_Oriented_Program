package Week3;

import java.util.Scanner;

public class Rectangle {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,area;
		
		System.out.println("Enter dimensions:");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a<=0||b<=0)
			System.out.println("Invalid");
		else {
			c=2*(a+b);
			area=a*b;
			System.out.println("Circumference:"+c+" units");
			System.out.println("Area:"+area+" sq. units");
		}
	}
}
