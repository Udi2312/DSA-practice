import java.util.Stack;
public class stacks1{
    public static void displaystackrev(Stack<Integer> st){
        if(st.size() == 0){
            return;
        }
        int top = st.pop();
        System.out.println(top);
        displaystackrev(st);
        st.push(top);
    }
    public static void displaystack(Stack<Integer> st){
        if(st.size() == 0){
            return;
        }
        int top = st.pop();
        displaystack(st);
        System.out.println(top);
        st.push(top);
    }
    public static Stack reverseStack(Stack<Integer> st){
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
            rt.push(st.pop());
        }
        Stack<Integer> qt = new Stack<>();
        while(rt.size() > 0){
            qt.push(rt.pop());
        }
        while(qt.size() > 0){
            st.push(qt.pop());
        }
        return st;
    }
    public static void pushAtBottom(Stack<Integer> st , int a){
        if(st.size() == 0){
            st.push(a);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, a);
        st.push(top);
    }
    public static void revStackusingRecursion(Stack<Integer> st){
        if(st.size() == 0){
            return;
        }
        int top = st.pop();
        revStackusingRecursion(st);
        pushAtBottom(st, top);
    }
    public static class Stack2{
        private int arr[] = new int[5];
        private int idx = 0;

        void push(int i){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = i;
            idx++;
        }

        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        void display(){
            for(int i = 0; i<idx; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            else return false;
        }

        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }

        int capacity(){
            return arr.length;
        }
    }

    public static class Node{
        int val;
        Node next;
        Node(int x){
            val = x;
        }
    }
    public static class Stack3{
      private Node head = null;
      private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayrec(Node head){
            if(head == null) return;
            displayrec(head.next);
            System.out.print(head.val + " ");
        }
        
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayrev(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int ans = head.val;
            head = head.next;
            size--;
            return ans;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }
    }
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
        // int element = 67;
        // int idx = 0;
        //    Stack<Integer> st2 = new Stack<>();
        //    int n = st.size() - idx;
        //    for(int i = 0; i<n; i++){
        //     st2.push(st.pop());
        //    }
        //    st.push(element);
        //    while(st2.size() > 0){
        //     st.push(st2.pop());
        //    }
        //    System.out.println(st);


        // Display stack
        // Stack<Integer> st2 = new Stack<>();
        // while(st.size() > 0){
        //     st2.push(st.pop());
        // }
        // while(st2.size() > 0){
        //     System.out.println(st2.peek());
        //     st.push(st2.pop());
        // }


        // Display reverse stack using recursion
        // displaystackrev(st);


        // Display stack using recursion
        // displaystack(st);


        // Reverse stack 
        // reverseStack(st);
        // System.out.println(st);


        // Push at bottom
        // pushAtBottom(st,25);
        // System.out.println(st);


        // Reverse a stack using recursion
        // revStackusingRecursion(st);
        // System.out.println(st);


        // Array implementation of Stack
        // Stack2 st2 = new Stack2();
        // st2.push(1);
        // st2.display();
        // st2.push(2);
        // st2.display();
        // st2.push(3);
        // st2.display();
        // st2.pop();
        // st2.display();
        // System.out.println(st2.size());


        // LL implementation of stack
         Stack3 st2 = new Stack3();
        st2.push(1);
        st2.display();
        st2.push(2);
        st2.display();
        st2.push(3);
        st2.display();
        st2.pop();
        st2.display();
        System.out.println(st2.size());
    }
}