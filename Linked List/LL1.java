public class LL1{
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
        System.out.println(lengthofLL(a));
    }
}