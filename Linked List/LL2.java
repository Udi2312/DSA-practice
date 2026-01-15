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
    public static boolean checkcycle(Node head){
        if(head == null || head.next == null) return false;
         Node slow = head;
        Node fast = head;
        while(fast != null){
            if(slow == null) return false;
            slow = slow.next;
            if(fast.next == null) return false;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
    public static Node returncyclenode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }
        Node temp = head;
        while(temp != slow){
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }
    public static Node mergesortedLL(Node head1, Node head2){
        Node temp1 = head1; 
        Node temp2 = head2;
        Node head = new Node(100);
        Node temp = head;
        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                Node a = new Node(temp1.data);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            }
            else{
                Node a = new Node(temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null){
            temp.next = temp2;
        }
        else{
            temp.next = temp1;
        }
        return head.next; 
    }
    public static Node mergesortedLLwithoutextraspace(Node head1, Node head2){
        Node h = new Node(100);
        Node t = h;
        Node t1 = head1;
        Node t2 = head2;
        while(t1 != null && t2 != null){
            if(t1.data < t2.data){
                t.next = t1;
                t = t1;
                t1 = t1.next;
            }
            else{
                 t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }
        if(t1 == null){
            t.next = t2;
        }
        else{
            t.next = t1;
        }
        return h.next;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(31);
        Node c = new Node(33);
        Node d = new Node(80);
        Node e = new Node(164); 
        Node f = new Node(196); 
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // f.next = c;

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
        Node a1 = new Node(1);
        Node b1 = new Node(2);
        Node c1 = new Node(3);
        Node d1 = new Node(400);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        // d1.next = c;
        // System.out.println(intersectionof2LL(a, a1).data);



        // Finding the middle element of a LL in a single traversal
        // System.out.println(findmiddleelement(a).data);



        // Delete the middle element of a LL in one traversal
        // printLL(a);
        // deletemiddlenode(a);
        // printLL(a);



        // Check whether the given LL has cycle or not
        // System.out.println(checkcycle(a));



        // given a LL with cycle, return the node where the cycle begins
        // System.out.println(returncyclenode(a).data);



        // Given 2 sorted LL, merge them into a sorted LL
        // Node head = mergesortedLL(a,a1);
        // printLL(head);



        // Given 2 sorted LL, merge them into a sorted LL without using extra space
        Node head1 = mergesortedLLwithoutextraspace(a,a1);
        printLL(head1);
    }
}
