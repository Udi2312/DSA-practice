// import java.util.Scanner;
// import java.util.Stack;
// import javax.xml.stream.events.Characters;
import java.util.*;
public class stacks2 {
    public static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(st.size() == 0) return false;
                st.pop();
            }
        }
        if(st.size() == 0) return true;
        else return false;
    }
    public static int[] removeSubSequences(int arr[]){
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            if(st.size() == 0 || st.peek() != arr[i]) {
                st.push(arr[i]);    
            }
            else if(arr[i] == st.peek()){
                if(i != arr.length-1 ){
                    if(arr[i] != arr[i+1]){
                        st.pop();
                    }
                }
            }
        }
        int ans[] = new int[st.size()];
        for(int i = ans.length-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        // Check whether the given string of brackets is valid or not
        // Scanner s = new Scanner(System.in);
        // String in = s.nextLine();
        // System.out.println(isBalanced(in));


        // Remove the consecutive sub sequences inside the array whose length is greater than or equla to 2
        int arr[] = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int ans[] = removeSubSequences(arr);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
