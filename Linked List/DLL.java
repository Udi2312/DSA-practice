public class DLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printLLrev(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void printLLrandom(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        printLL(temp);
    }
    public static Node insertathead(Node head , int val){
        Node f = new Node(val);
        f.next = head;
        head.prev = f;
        head = f;
        return head;
    }
    public static Node insertattail(Node head, int val){
        Node f = new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = f;
        f.prev = temp;
        temp = head;
        return temp;
    }
    public static Node insertatidx(Node head, int idx, int val){
        Node t = new Node(val);
        Node temp = head;
        for(int i = 0; i<idx-1; i++){
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next.prev = t;
        temp.next = t;
        t.prev = temp;
        temp = head;
        return temp;    
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;
        // printLL(a);
        // printLLrev(e);

        // You are given any random node in a DLL, print the LL
        // printLLrandom(d);



        // Insertion at head in DLL
        // Node ans = insertathead(a,30);
        // printLL(ans);


        
        // Insertion at tail in DLL, only head node is given
        // Node ans = insertattail(a,22);
        // printLL(ans);



        // Insert at index in DLL
        Node ans = insertatidx(a,3,55);
        printLL(ans);
    }
}
