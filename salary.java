package Week2;

import java.util.Scanner;

public class salary {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int sal;
		System.out.println("Enter number of hours worked:");
		int h=sc.nextInt();
		System.out.println("Enter hourly rate:");
		int r=sc.nextInt();
		if(h<=40) {
			sal=h*r;
		}
		else {
			sal=(int)((h-40)*(r*1.5))+(40*r);
		}
		System.out.println("Salary:Rs"+sal);
	}
}
