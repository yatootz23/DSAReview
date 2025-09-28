import java.util.LinkedList;
import java.util.Queue;

public class QueueReview {
    public static void main(String[] args) {
        // Queue: First In First Out (FIFO)
        // Uses of Queues
        // 1. Keyboard Stroke Buffer
        // 2. Printer Queue
        // 3. Linked Lists, Priority Queues, BFS

        // queue Declaration
        Queue<String> queue = new LinkedList<>();

        // queue enqueue
       queue.offer("Japan");
       queue.offer("Korea");
       queue.offer("Taiwan");
       queue.offer("Hongkong");
       queue.offer("Singapore");
       queue.offer("Philippines");

        System.out.println(queue);

        // queue peek
        System.out.println(queue.peek());

        // queue dequeue
        queue.poll();
        System.out.println(queue);

        // Better to use offer/poll/peek than add/remove/element to not cause an exception when empty
    }
}
