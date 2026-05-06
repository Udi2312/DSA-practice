import java.util.Map;
import java.util.HashMap;

public class hashmap1 {
    public static void HashmapMethods(){
        Map<String , Integer> mp = new HashMap<>();
        mp.put("a" , 21);
        mp.put("b" , 31);
        mp.put("c" , 41);
        mp.put("d" , 51);
        mp.put("e" , 61);
        
        // Getting value of a key
        System.out.println(mp.get("b"));
        System.out.println(mp.get("f"));

        // Updating value of a key
        mp.put("a" , 25);
        System.out.println(mp.get("a"));

        
    }
    public static void main(String[] args) {
        HashmapMethods();
    }
}
