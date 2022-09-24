package mypackage;
import java.util.Scanner;

public class Six1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = in.nextInt();

        System.out.print("Enter another number: ");
        int b = in.nextInt();

        if(a > b) {
            System.out.print("Maximum: "+a);
        } else {
            System.out.print("Maximum: "+b);
        }
    }
}