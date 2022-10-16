import java.util.Scanner;

public class Eight1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter a character to find its position: ");
        Character c = sc.next().charAt(0);

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == c) {
                System.out.println("First Index: " + i);
                break;
            } 
        }

        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i) == c) {
                System.out.println("Last Index: " + i);
                break;
            }
        }
    }
}