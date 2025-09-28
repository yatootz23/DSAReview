import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueReview {
    public static void main(String[] args) {
        // Priority Queue: First In First Out (FIFO) with priority

        // priorityQueue declaration
        Queue<String> priorityQueue = new PriorityQueue<>();

        // priorityQueue enqueue
        priorityQueue.offer("Japan");
        priorityQueue.offer("Korea");
        priorityQueue.offer("Taiwan");
        priorityQueue.offer("Hongkong");
        priorityQueue.offer("Singapore");
        priorityQueue.offer("Philippines");

        System.out.println(priorityQueue);

        // priorityQueue peek
        System.out.println(priorityQueue.peek());

        // priorityQueue dequeue
        priorityQueue.poll();
        System.out.println(priorityQueue);

        // reversePriorityQueue declaration
        Queue<String> reversePriorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        // reversePriorityQueue enqueue
        reversePriorityQueue.offer("Japan");
        reversePriorityQueue.offer("Korea");
        reversePriorityQueue.offer("Taiwan");
        reversePriorityQueue.offer("Hongkong");
        reversePriorityQueue.offer("Singapore");
        reversePriorityQueue.offer("Philippines");

        System.out.println(reversePriorityQueue);

        // reversePriorityQueue peek
        System.out.println(reversePriorityQueue.peek());

        // priorityQueue dequeue
        reversePriorityQueue.poll();
        System.out.println(reversePriorityQueue);
    }
}
