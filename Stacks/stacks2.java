// import java.util.Scanner;
// import java.util.Stack;
// import javax.xml.stream.events.Characters;
import java.util.*;
public class stacks2 {
    public static class MinStack{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> min = new Stack<>();
        int m = Integer.MAX_VALUE;
        void push(int val){
            if(val < m) {
                m = val;
                min.push(val);
                st.push(val);
            }       
            else{
                st.push(val);
                min.push(min.peek());
            }
        }
        void pop(){
            st.pop();
            min.pop();
        }
        int peek(){
            return st.peek();
        }
        int getmin(){
            return min.peek();
        }

    }
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
    public static int[] nextGreater(int arr[]){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        st.push(arr[arr.length-1]);
        ans[arr.length-1] = -1;
        for(int i = arr.length-2; i>=0; i--){
            while(st.size()>0 && st.peek() < arr[i]){
                st.pop();
            }
            if(st.size() == 0) ans[i] = -1;
            else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
    public static int largestRectangleArea(int[] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];

        // calculate nse
        st.push(n-1);
        nse[n-1] = n;
        for(int i = n-2; i>=0; i--){
            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.size() == 0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }

        // emptying stack
        while(st.size() > 0) st.pop();

        // calculate pse
        st.push(0);
        pse[0] = -1;
        for(int i = 1; i<n; i++){
            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.size() == 0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        // maximum area  of rectangle
        int max = -1;
        for(int i =0; i<n; i++){
            int area = heights[i] * (nse[i] - pse[i] - 1);
             max = Math.max(max,area);
        }
        return max;
    }
    public static void main(String[] args) {
        // Check whether the given string of brackets is valid or not
        // Scanner s = new Scanner(System.in);
        // String in = s.nextLine();
        // System.out.println(isBalanced(in));


        // Remove the consecutive sub sequences inside the array whose length is greater than or equla to 2
        // int arr[] = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        // int ans[] = removeSubSequences(arr);
        // for(int i = 0; i<ans.length; i++){
        //     System.out.print(ans[i] + " ");
        // }


        // Find the next greater element for every element in the array and -1 if it does not exists
        // int arr[] = {1,3,2,1,8,6,3,4};
        // int ans[] = nextGreater(arr);
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(ans[i] + " ");
        // }


        // largest Rectangle in Histogram (Leetcode-84)
        // int heights[] = {2,1,5,6,2,3};
        // int ans = largestRectangleArea(heights);
        // System.out.println(ans);


        // implement Min stack
        MinStack a = new MinStack();
        a.push(7);
        a.push(8);
        a.push(5);
        a.push(6);
        a.push(3);
        a.push(4);
        System.out.println(a.getmin());
        a.pop();
        System.out.println(a.getmin());
        a.pop();
        System.out.println(a.getmin());
        a.pop();
        System.out.println(a.getmin());
        a.pop();
        System.out.println(a.getmin());
    }
}
