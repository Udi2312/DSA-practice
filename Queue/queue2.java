import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Reverse first k elements of queue
        System.out.println(q);
        int k = 3;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<k; i++){
            st.push(q.remove());
        }
        for(int i = 0; i<k; i++){
            q.add(st.pop());
        }
        for(int i = 0; i<q.size()-k; i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
