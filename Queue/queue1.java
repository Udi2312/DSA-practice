
public class queue1{
    public static class CircularQueue{
        int size = 0;
        int f = -1;
        int r = -1;
        int arr[] = new int[4];
        public void add(int x) throws Exception{
            if(size==0){
                f = r = 0;
                arr[0] = x;
            }
            else if(size == arr.length){
                throw new Exception("Queue is full!");
            }
            else if(r < arr.length-1){
                arr[++r] = x;
            }
            else if(r==arr.length-1){
                r = 0;
                arr[0] = x;
            }
            size++; 
        }
        

        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is empty");
            }
            else{
                int a = arr[f];
                if(f==arr.length-1) f = 0;
                f++;
                size--;
                return a;
            }
        }

        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }
            else{
                return arr[f];
            }
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            if(f<=r){
                for(int i = f; i<=r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else{
                for(int i = f; i<arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i = 0; i<r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLimplementation{
        Node head  = null;
        Node tail  = null;
        int size  = 0;

        public void add(int x){
            Node temp = new Node(x);
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int a = head.val;
            head = head.next;
            size--;
            return a;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty(){
            return size==0;
        }
    }
    public static class ArrayImplementation{
        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[100];

        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f==-1) {
                f = r = 0;
                arr[0] = val;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty. Nothing to remove.");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty. Nothing to peek.");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is empty. Nothing to print.");
                return;
            }

            for(int i = f; i<=r; i++){
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        // Queue<Integer> q = new LinkedList<>();
        // System.out.println(q.isEmpty());
        // q.add(1);
        // System.out.println(q.isEmpty());
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // System.out.println(q);
        // q.remove();
        // System.out.println(q);
        // q.poll();
        // System.out.println(q);
        // System.out.println(q.element());
        // System.out.println(q.size());


        // Display queue
        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // Queue<Integer> help = new LinkedList<>();
        // while(q.size() > 0){
        //     System.out.print(q.element() + " ");
        //     help.add(q.element());
        //     q.remove();
        // }
        // System.out.println();
        // while(help.size()>0){
        //     q.add(help.element());
        //     help.remove();
        // }
        // System.out.println(q);


        // Array implementation of queue

        // ArrayImplementation q = new ArrayImplementation();
        // q.display();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.display();
        // q.remove();
        // q.display();
        // System.out.println(q.peek());
        // System.out.println(q.size);


        // Linked List implementation

        // LLimplementation q = new LLimplementation();
        // q.display();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.display();
        // q.remove();
        // q.display();
        // System.out.println(q.peek());
        // System.out.println(q.size);


        // Circular queue implementation
        CircularQueue q = new CircularQueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}