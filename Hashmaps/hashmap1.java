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
        // System.out.println(mp.get("b"));
        // System.out.println(mp.get("f"));

        // Updating value of a key
        // mp.put("a" , 25);
        // System.out.println(mp.get("a"));

        // Remove value pair
        // System.out.println(mp.remove("b"));

        // Check if the key exists
        // System.out.println(mp.containsKey("a"));
        // System.out.println(mp.containsKey("h"));

        // Adding a new entry if the key doesn't already exists
        // mp.putIfAbsent("h", 46);

        // Get all the keys
        //System.out.println(mp.keySet());

        // Get all the values
        //System.out.println(mp.values());

        // Get all the entries
        //System.out.println(mp.entrySet());

        // Traverse along the hashmap
        // for(String key : mp.keySet()){
        //     System.out.println(key + " = " + mp.get(key));
        // }
        // for(Map.Entry<String , Integer> e : mp.entrySet()){
        //     System.out.println(e.getKey() + " = " + e.getValue());
        // }
        // for(var e : mp.entrySet()){
        //     System.out.println(e.getKey() + " = " + e.getValue());
        // }
    }
    public static void main(String[] args) {
        // HashmapMethods();


        // Most frequent element in array

        // int arr[] = {1,2,4,1,3,1,5,5,1,6};
        // Map<Integer , Integer> a = new HashMap<>();
        // for(int i = 0; i<arr.length; i++){
        //     if(!a.containsKey(arr[i])){
        //             a.put(arr[i],1);
        //     }
        //     else{
        //         a.put(arr[i],a.get(arr[i])+1);
        //     }
        // }
        // System.out.println(a.entrySet());
        // int max = -1;
        // int maxele = -1;
        // for (var i : a.entrySet()) {
        //     if(i.getValue() > max){
        //         max = i.getValue();
        //         maxele = i.getKey();
        //     }
        // }
        // System.out.println(maxele);


        
    }
}
