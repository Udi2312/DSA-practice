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

    public static int ZeroSum(int arr[]){
        HashMap<Integer , Integer> mp = new HashMap<>();
        int presum = 0;
        int maxlen = 0;
        mp.put(0,-1);
        for(int i = 0; i<arr.length; i++){
            presum += arr[i];
            if(mp.containsKey(presum)){
                int a = i - mp.get(presum);
                if(a > maxlen) maxlen = a;
            }
            else{
                mp.put(presum , i);
            }
        }
        return maxlen;
    }

    public static int[] TwoSum(int[] nums ,  int target){
        int[] ans = {-1};
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int partner = target - nums[i];
            if(mp.containsKey(partner)){
                ans = new int[]{i , mp.get(partner)};
                return ans;
            }
            else{
                mp.put(nums[i] , i);
            }
        }
        return ans;
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
        // int arr[] = {2,7,11,15};
        // int target = 9;
        // int ans[] = TwoSum(arr, target);
        // System.out.println(ans[0] +" "+ans[1]);


        // Largest zero sum subarray
        int arr[] = {15,-2,2,-8,1,7,10};
        System.out.println(ZeroSum(arr));
    }
}
