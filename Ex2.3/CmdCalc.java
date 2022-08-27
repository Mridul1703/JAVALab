package Lab2;

public class CmdCalc {
	public static void main(String args[]) {
//		System.out.println("\t**MENU**\n\t 1. Add\n\t 2. Sub\n\t3. Multiply\n\t 4. Divide");
		int ch = Integer.parseInt(args[0]);
		
		int a = Integer.parseInt(args[1]);
		
		int b = Integer.parseInt(args[2]);
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
