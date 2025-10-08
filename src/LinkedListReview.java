import java.util.LinkedList;

public class LinkedListReview {
    public static void main(String[] args) {
        LinkedList<String> linkedList =  new LinkedList<>();

        // Linked List - node with 2 parts (data & address)
        // Elements are linked using pointers

        // 2 kinds of Linked Lists: singly  & doubly
        // Singly LL - one-way connection
        // Doubly LL -two-way connection

        // Advantages:
        // 1. Dynamic data structure
        // 2. Faster insertion/deletion
        // 3. Little to no memory waste

        // Disadvantages
        // 1. High memory usage
        // 2. No random access of elements (index)
        // 3. Slower data retrieval

        // Uses:
        // 1. Stacks/Queues
        // 2. GPS Navigation
        // 3. Playlist

        // linked list behaving as a stack
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");

        // linked list behaving as a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        System.out.println(linkedList);

        // peek head
        System.out.println(linkedList.peekFirst());

        // peek tail
        System.out.println(linkedList.peekLast());

        // add to head
        linkedList.addFirst("0");

        // add to tail
        linkedList.addLast("G");

        // add to middle
        linkedList.add(5,"E");
        System.out.println(linkedList);

        // remove head
        System.out.println(linkedList.removeFirst());

        // remove tail
        System.out.println(linkedList.removeLast());
    }
}
