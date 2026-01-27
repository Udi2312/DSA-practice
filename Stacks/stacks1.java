import java.util.Stack;
public class stacks1{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(21);
        st.push(22);
        st.push(23);
        st.push(24);

        // peek
        // System.out.println(st.peek());
        // System.out.println(st);


        // pop
        // System.out.println(st.pop());
        // System.out.println(st);


        // size
        // System.out.println(st.size());


        // Print 1st element
        // while(st.size() > 1){
        //     st.pop();
        // }
        // System.out.println(st.peek());


        // Copy the elements of 1 stack into another stack in reverse order
        // Stack<Integer> st2 = new Stack<>();
        // while(st.size() >  0){
        //     int x = st.peek();
        //     st2.push(x);
        //     st.pop();
        // }
        // System.out.println(st2);


        // Copy the elements of 1 stack into another stack in same order
        //  Stack<Integer> st2 = new Stack<>();
        // while(st.size() >  0){
        //     int x = st.peek();
        //     st2.push(x);
        //     st.pop();
        // }
        // Stack<Integer> st3 = new Stack<>();
        // while(st2.size() >  0){
        //     int x = st2.peek();
        //     st3.push(x);
        //     st2.pop();
        // }
        // System.out.println(st3);


        // Insert element at any index
        int element = 67;
        int idx = 0;
           Stack<Integer> st2 = new Stack<>();
           int n = st.size() - idx;
           for(int i = 0; i<n; i++){
            st2.push(st.pop());
           }
           st.push(element);
           while(st2.size() > 0){
            st.push(st2.pop());
           }
           System.out.println(st);
    }
}