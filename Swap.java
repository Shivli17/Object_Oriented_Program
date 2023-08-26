package Week2;

import java.util.Scanner;

public class Swap {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String a:");
		String a=sc.nextLine();
		System.out.println("Enter Integer b:");
		int b=sc.nextInt();
		int c;
		c=b;
		b=Integer.parseInt(a);
		a=String.valueOf(c);
		System.out.println("String a:"+a);
		System.out.println("Int b:"+b);
	}

}
