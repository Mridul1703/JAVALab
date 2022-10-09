import java.util.Scanner;

public class Seven2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float divisor, dividend;

        // dividend/divisor = quotient

        System.out.print("Enter dividend: ");
        dividend = in.nextFloat();
        System.out.print("Enter divisor: ");
        divisor = in.nextFloat();

        try{
            int quotient = (int)dividend/(int)divisor;
            // System.out.println("Quotient: "+quotient);
            System.out.println(quotient);
        } catch(ArithmeticException ae) {
            System.out.println("\t!!Infinity!!");
        }
    }
}
