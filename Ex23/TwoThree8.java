import java.util.Scanner;

class TwoThree8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int arr[] = new int[10];
		
		for(int i=1; i<10; i++) {
		    System.out.print("Enter number: ");
		    arr[i] = in.nextInt();
		}
		
		for(int i=0; i<10; i++) {
		    arr[i] *= arr[i];
		    sum += arr[i];
		}
		
		System.out.println("Sum is: " + sum);
	}
}