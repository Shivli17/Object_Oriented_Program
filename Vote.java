package Week3;

import java.util.Scanner;

public class Vote {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter age:");
		n=sc.nextInt();
		if(n<0|| n>120)
			System.out.println("Invalid age.");
		else {
		if(n>=18)
			System.out.println("Eligible for voting.");
		else
			System.out.println("Not eligible for voting.");
		}
	}
}
