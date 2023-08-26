package Week2;

import java.util.Scanner;

public class Conversions {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer:");
		int a=sc.nextInt();
		System.out.println("Enter Double:");
		double b=sc.nextDouble();
		System.out.println("Enter Character:");
		char c=sc.next().charAt(0);
		byte intToByte=(byte)a;
		int charToInt=(int)c;
		byte doubleToByte=(byte)b;
		int doubleToInt=(int)b;
		System.out.println("int To Byte:"+intToByte);
		System.out.println("char To Int:"+charToInt);
		System.out.println("double To Byte:"+doubleToByte);
		System.out.println("double To Int:"+doubleToInt);
	}
}
