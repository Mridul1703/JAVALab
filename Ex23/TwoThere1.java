import java.util.Scanner;

public class TwoThere1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int num1 = in.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int num2 = in.nextInt();
		
		System.out.print("Enter 3rd number: ");
		int num3 = in.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the largest");
		} else if(num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the largest");
		} else {
			System.out.println(num3 + " is the largest");
		}
		
	}
}
