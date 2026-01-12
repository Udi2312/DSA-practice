public class LL2 {
     public static class Node{
        int data;
        Node next;
        // int size = 0
        Node(int data){
            this.data = data;
        }
    }
    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
             System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void deleteNode(Node x){
        x.data = x.next.data;
        x.next = x.next.next;
        // size--;
    }
    public static Node returnnodefromend(Node head, int idx){
        int length = 0;
        Node temp1 = head;
        while(temp1!= null){
            length++;
            temp1= temp1.next;
        }
        int idxfromst = length-idx+1;
        Node temp2 = head;
        for(int i = 1; i<idxfromst; i++){
                temp2 = temp2.next;
        }
        return temp2;
    }
    public static Node nthNodesingleiteration(Node head, int idx){
        Node slow = head;
        Node fast = head;
        for(int i = 0; i<idx; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static Node deletenthnodefromlast(Node head, int idx){
        Node slow = head;
        Node fast = head;
        for(int i = 0; i<idx; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
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
        // delete a node that is given as a parameter and is not the last node (Leetcode 237)
        // deleteNode(b);
        // printLL(a);



        // return the node nth position from the last
        // System.out.println(returnnodefromend(a,1).data);



        // Return the node nth position from the last in one iteration
        // System.out.println(nthNodesingleiteration(a, 3).data);



        // Delete the node nth position from last in one iteration
        printLL(a);
        a = deletenthnodefromlast(a, 3);
        printLL(a);
    }
}
