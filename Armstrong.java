package Week3;

import java.util.Scanner;

public class Armstrong {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n,c=0;
		int d;
		double sum=0;
		System.out.println("Enter a no. to check for armstrong:");
		n=sc.nextInt();
		for(int i=n;i>0;i=i/10) {
			c++;
		}
		for(int i=n;i>0;i=i/10) {
			d=i%10;
			sum=(int)sum+Math.pow((double)d,(double)c);
		}
		if (sum==n) {
			System.out.println("Armstrong");
		}
		else
			System.out.println("Not Armstrong");
	}
}
