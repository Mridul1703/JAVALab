package Collections;
import java.util.*;

public class NineC1 {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i=0; i<n; i++) {
            arr.add(i);
        }

        System.out.println("Reversed array: ");
        Collections.reverse(arr);
        Iterator<Integer> it = arr.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        ArrayList<Integer> arrcpy = (ArrayList<Integer>) arr.clone();
        
        Iterator<Integer> itt = arrcpy.iterator();
        System.out.println("Copied array: ");
        while(itt.hasNext()) {
            System.out.println(itt.next());
        }
    }
}
