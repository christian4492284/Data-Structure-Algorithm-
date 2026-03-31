import java.util.*;


/*IT A FIRST IN FIRST OUT SYSTEM (FIFO)
ENQUEUE IS WHEN ADDING AN OBJECT TO THE END OF THE QUEUE
DEQUEUE IS WHEN REMOVING AN OBJECT FROM THE HEAD OF THE QUEUE
 */

public class Queues {

    public static void main(String[] args)
    {
        // QUEUE IS AN INTERFACE NOT A CLASS THAT WHY WE ASSIGNED IT TO A LINKEDLIST
        Queue<String> queue = new LinkedList<String>();

        /* This is used to add or remove in queue(linkedlist)
        add = enqueue , offer()
           remove = dequeue, poll()
         */

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek());
        //this will dequeue the head
        queue.poll();

        System.out.println(queue.contains("Harold"));

        System.out.println(queue);


    }

}
