package Week2;

import java.util.Scanner;

public class Bitwise {
	static int bitwise_Add(int a,int b) {
		while(b!=0) {
			int carry=a&b;
			a=a^b;
			b=carry<<1;
		}
		return a;
	}
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.s:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=bitwise_Add(a,b);
		if(c==0)
			System.out.println("Neither");
		else if((c&1)==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
