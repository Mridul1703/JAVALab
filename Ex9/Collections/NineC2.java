package Collections;
import java.util.*;

public class NineC2 {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();

        mp.put("Mridul", 100);
        mp.put("SMW", 77);
        mp.put("King", 50);

        System.out.println(mp.containsKey("Mridul"));
        System.out.println(mp.containsValue(77));

        Set keys = mp.keySet();
        Iterator it = keys.iterator();

        System.out.println();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
