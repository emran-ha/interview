package collections;

import java.util.LinkedList;
import java.util.Queue;

class QueueJava {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.peek());

    }
}
