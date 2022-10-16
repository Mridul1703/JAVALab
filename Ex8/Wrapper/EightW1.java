package Wrapper;

public class EightW1 {
    public static void main(String[] args) {
        // Converts int to Integer
        int i = 30;
        Integer ii = new Integer(i);
        System.out.println(ii);

        // Convert Integer to String 
        String s = Integer.toString(ii);
        System.out.println(s);

        // Convert String to int
        String s2 = "23";
        int x = Integer.parseInt(s2);
        System.out.println(x);

        // Converts Integer to int
        int y = ii.intValue();
        System.out.println(y);
    }
}