package Week3;

import java.util.Scanner;

public class Prime {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n,c=0;
		System.out.println("Enter number to check for prime:");
		n=sc.nextInt();
		if(n==2)
			System.out.println("Prime number.");
		else if(n>2){
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				c++;
				break;
			}
		}
		if(c!=0) {
			System.out.println("Not a prime number.");
		}
		else
			System.out.println("Prime number.");
	}
		else
			System.out.println("Not a prime number.");
	}
}
