import java.util.Scanner;

public class MonthDisplay
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String arr[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		System.out.print("Enter number: ");
		int num = in.nextInt();
		
		System.out.println("Month: " + arr[num-1]);
	}
}