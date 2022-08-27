import java.util.*;

public class Lab2Q2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("\t**MENU**\n\t 1. Add\n\t 2. Sub\n\t3. Multiply\n\t 4. Divide");
			System.out.print("\tEnter your choice: ");
			int ch = in.nextInt();
			
			System.out.print("Enter a number: ");
			int a = in.nextInt();
			
			System.out.print("Enter another number: ");
			int b = in.nextInt();
			switch(ch) {
				case 1:
					int ad = add(a, b);
					System.out.println(ad);
					break;
				case 2: 
					int sb = sub(a, b);
					System.out.println(sb);
					break;
				case 3: 
					int ml = mul(a, b);
					System.out.println(ml);
					break;
				case 4: 
					int dv = div(a, b);
					System.out.println(dv);
					break;
				case 5:
					break;
			}
		}
	}
	 
	static int add(int a, int b) {
		return a+b;
	}
	
	static int sub(int a, int b) {
		return a-b;
	}
	
	static int mul(int a, int b) {
		return a*b;
	}
	
	static int div(int a, int b) {
		return a/b;
	}
}
