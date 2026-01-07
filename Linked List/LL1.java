public class LL1{
    public static class Linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;
        void inserAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            // Node temp = head;
            // int ans = 0;
            // while(temp != null){
            //     ans++;
            //     temp = temp.next;
            // }
            // return ans;
            return size;
        }
        void insertAtStart(int val){
            Node temp = new Node(val);
            if(head == null){
                // head = temp;
                // tail = temp;
                inserAtEnd(val);
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx , int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size()){
                inserAtEnd(val);
                return;
            }
            if(idx == 0){
                insertAtStart(val);
                return;
            }
            if(idx>size() || idx<0){
                System.out.println("Wrong input:");
                return;
            }
            for(int i = 1; i<= idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getAt(int idx){
            Node temp = head;
            for(int i = 1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if(idx == 0){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i = 1; i<idx; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx == size-1) tail = temp;
            size--;
        }
    }
    public static int lengthofLL(Node head){
        int ans = 0;
        while(head != null){
            ans++;
            head = head.next;
        }
        return ans;
    }
    public static void printReverseLL(Node head){
         if(head == null){
            return;
        }
        printReverseLL(head.next);
        System.out.print(head.data + " ");
    }

    public static void printLLUsingRecursion(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        printLLUsingRecursion(head.next);
    }

    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
             System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16); 
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Printing a linked list using only header
        // Node temp = a;
        // for(int i = 0; i<5; i++){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }

        // Without knowing the length of list
        // Node temp = a;
        // while(temp != null){
        //      System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }

        // Using function
        // printLL(a);

        // Using recursion
        // printLLUsingRecursion(a);



        // Print LL in reverse order
        // printReverseLL(a);



        // Find Length of LL
        // System.out.println(lengthofLL(a));



        // Implementation of LinkedList
        Linkedlist l = new Linkedlist();
        l.inserAtEnd(4);
        // l.display();
        l.inserAtEnd(5);
        // l.display();
        // System.out.println(l.size());
        l.insertAtStart(12);
        // l.display();
        l.insertAtStart(13);
        // l.display();
        l.insertAt(2, 15);
        // l.display();
        l.insertAt(2, 10);
        // l.display();
        l.insertAt(5, 100);
        // l.display();
        l.insertAt(7, 90);
        // l.display();
        // System.out.println(l.tail.data);
        l.insertAt(0, 80);
        // l.display();



        // Write a program to return the element at any given index of the linked list
        // System.out.println(l.getAt(3));
        // System.out.println(l.size());



        // Write a program to delete element from the linked list at given index
        l.display();
        l.deleteAt(2);
        l.display();
    }
}