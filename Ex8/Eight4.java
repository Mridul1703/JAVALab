import java.util.Scanner;

public class Eight4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sbm = new StringBuffer();

        System.out.print("Enter a String: ");
        sbm.append(sc.nextLine());

        System.out.println("Length of String: " + sbm.length());

        System.out.println("\nEnter a character/substring to find its position: ");
        String sbsString = sc.nextLine();

        // Inbuilt Methods 
        int find = sbm.indexOf(sbsString);
        if(find == -1) {
            System.out.print("Substring/Character is not found!");
        } else {
            System.out.println(find);
        }
    }   
}
