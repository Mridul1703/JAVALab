package Lab2;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n1 = 0, n2 = 1;
		
		System.out.print("Enter number: ");
		int n = in.nextInt();
		
		for(int i=2; i<n; i++) {
			int n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	} 
}
