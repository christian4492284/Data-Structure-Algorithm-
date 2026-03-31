import java.util.*;

public class priority_queue {
    public static void main(String[] args){
/* This is a standard queue
 Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(3.5);
        queue.offer(3.8);

        //display the element of the queue
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

 */
        //this put the queue in order
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        //display the element of the queue
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }


    }
}
