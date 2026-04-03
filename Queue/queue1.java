import java.util.LinkedList;
import java.util.Queue;

public class queue1{
    public static void main(String[] args) {
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
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> help = new LinkedList<>();
        while(q.size() > 0){
            System.out.print(q.element() + " ");
            help.add(q.element());
            q.remove();
        }
        System.out.println();
        while(help.size()>0){
            q.add(help.element());
            help.remove();
        }
        System.out.println(q);
    }
}