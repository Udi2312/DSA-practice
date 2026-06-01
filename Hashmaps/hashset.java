import java.util.HashSet;
public class hashset {
    public static int longestsequence(int arr[]){
        HashSet<Integer> st = new HashSet<>();
        for(int i : arr){
            st.add(i);
        }
        int maxstreak = 0;
        for(int i: st){
            if(!st.contains(i - 1)){
                int currnum = i;
                int currstreak = 1;
                while(st.contains(currnum+1)){
                    currstreak++;
                    currnum++;
                }
                maxstreak = Math.max(maxstreak , currstreak);
            }
        }
        return maxstreak;
    }

    public static int tableproblem(int arr[]){
        HashSet<Integer> table = new HashSet<>();
        table.add(arr[0]);
        int ans = 1;
        for(int i = 1; i<arr.length; i++){
            if(table.contains(arr[i])){
                table.remove(arr[i]);
            }
            else{
                table.add(arr[i]);
                ans = Math.max(ans,table.size());
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // HashSet<String> st = new HashSet<>();
        // st.add("Udit");
        // st.add("Udit2");
        // st.add("Udit");
        // System.out.println(st);
        // System.out.println(st.contains("Udit"));
        // System.out.println(st.size());
        // st.remove("Udit");
        // System.out.println(st.contains("Udit"));
        // System.out.println(st.size());
        // for(String s: st){
        //     System.out.println(s);
        // }


        // Given an unsorted array of Integers, return the length of longest consecutive elements sequence
        // int arr[] = {100,4,200,1,3,2};
        // System.out.println(longestsequence(arr));


        // 66th video last question (bhaut bada hai)
        int arr[] = {1,1};
        System.out.println(tableproblem(arr));
    }
}
