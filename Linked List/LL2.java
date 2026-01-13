public class LL2 {
     public static class Node{
        int data;
        Node next;
        // int size = 0
        Node(int data){
            this.data = data;
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
    public static Node intersectionof2LL(Node head1, Node head2){
        int l1 = lengthofLL(head1);
        int l2 = lengthofLL(head2);
        int x = Math.abs(l2-l1);
        if(l1>l2){
            for(int i = 0; i<x; i++){
                head1 = head1.next;
            }
        }
        else{
            for(int i = 0; i<x; i++){
                head2 = head2.next;
            }
        }
        while(head1 != head2){
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;
    }
    public static Node findmiddleelement(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void deletemiddlenode(Node head){
        // if(head.next == null){
        //     return;
        // }
        Node slow = head;
        Node fast = head;
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16); 
        // Node f = new Node(19); 
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // e.next = f;
        // delete a node that is given as a parameter and is not the last node (Leetcode 237)
        // deleteNode(b);
        // printLL(a);



        // return the node nth position from the last
        // System.out.println(returnnodefromend(a,1).data);



        // Return the node nth position from the last in one iteration
        // System.out.println(nthNodesingleiteration(a, 3).data);



        // Delete the node nth position from last in one iteration
        // printLL(a);
        // a = deletenthnodefromlast(a, 3);
        // printLL(a);



        // Finding the intersection of 2 linked lists
        // Node a1 = new Node(1);
        // Node b1 = new Node(2);
        // Node c1 = new Node(92);
        // Node d1 = new Node(81);
        // a1.next = b1;
        // b1.next = c1;
        // c1.next = d1;
        // d1.next = c;
        // System.out.println(intersectionof2LL(a, a1).data);



        // Finding the middle element of a LL in a single traversal
        // System.out.println(findmiddleelement(a).data);



        // Delete the middle element of a LL in one traversal
        printLL(a);
        deletemiddlenode(a);
        printLL(a);
    }
}
