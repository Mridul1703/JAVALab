import java.util.Scanner;

class Seven1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = { "Mridul", "Himanshu", "Binit", "Antriksh", "Amritanshu", "John", "Alice", "Jay", "Tim",
                "Tin" };
        int[] rollno = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        try {
            System.out.print("Enter number to access details: ");
            int n = sc.nextInt();
            System.out.println("Name: " + names[n-1]);
            System.out.println("Roll No: " + rollno[n-1]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("\t!!Array Index Out Of Bounds Exception!!");
        }
    }
}