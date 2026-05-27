import java.util.HashMap;
import java.util.Map;

public class hashmap2 {

    public static HashMap<Character , Integer> makeFreqMap(String s){
        HashMap<Character , Integer> mp = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            Character ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch , 1);
            }
            else{
                int currfreq = mp.get(ch);
                mp.put(ch , currfreq+1);
            }
        }
        return mp;
    }
    public static boolean isIsomorphic(String s , String t){
        HashMap<Character , Character> mp = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(!mp.containsKey(s.charAt(i))){
                if(mp.containsValue(t.charAt(i))) return false;
                mp.put(s.charAt(i) , t.charAt(i));
            }
            else{
                if(!(mp.get(s.charAt(i)) == t.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    } 
    public static boolean isanagram(String a , String b){
        if(a.length() != b.length()) return false;
         Map<Character , Integer> mp1 = makeFreqMap(a);
         Map<Character , Integer> mp2 = makeFreqMap(b);
         return mp1.equals(mp2);
    }
    public static void main(String[] args) {
        // Tell if 2 strings are anagram or not
        // System.out.println(isanagram("knee" , "keen"));


        // Isomorphic Strings
        // System.out.println(isIsomorphic("abcdca" , "xywswx"));


        // TwoSum
        
    }
}
