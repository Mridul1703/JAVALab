import java.util.Scanner;

public class Eight2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        StringBuffer newString = new StringBuffer();

        System.out.print("Enter a String: ");
        sb.append(sc.nextLine());

        for(int i=0; i<sb.length(); i++) {
            int asciivalue = sb.charAt(i);
            if(asciivalue >= 97 && asciivalue <= 122) {
                asciivalue -= 32;
                newString = newString.append((char)asciivalue);
            } else {
                newString = newString.append(sb.charAt(i));
            }
        }

        System.out.println(newString);
    }
}