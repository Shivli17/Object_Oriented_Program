package Week2;
import java.util.Scanner;
public class LeapYear {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int Year;
		
		System.out.println("Enter Year:");
		Year=sc.nextInt();
		if(Year==0) {
			System.out.println("Invalid");
		}
		if(Year%4!=0) {
			System.out.println("It's a common year");
		}
		else {
			if(Year%100!=0)
				System.out.println("It's a leap year");
			else {
				if(Year%400!=0)
					System.out.println("It's a common year");
				else
					System.out.println("It's a leap year");
			}
				
		}
		
     }

}
