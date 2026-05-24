import java.util.HashMap;
import java.util.Map;

public class hashmap2 {

    public static HashMap<Character , Integer> makeFreqMap(String s){
        
    }
    public static boolean isanagram(String a , String b){
        if(a.length() != b.length()) return false;
         Map<Character , Integer> mp1 = makeFreqMap(a);
         Map<Character , Integer> mp2 = makeFreqMap(b);
         return mp1.equals(mp2);
    }
    public static void main(String[] args) {
        // Tell if 2 strings are anagram or not
        isanagram("knee" , "keen");

    }
}
