package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MaxHeap {
    public static void main(String[] args) {
        Queue<Integer> heap = new PriorityQueue<>((a, b) -> (b-a));
        heap.add(24);
        heap.add(32);
        heap.add(25);
        heap.add(11);
        heap.add(1);
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());

        Queue<Product> queue = new PriorityQueue<>((o1, o2) -> o2.name.compareTo(o1.name));
        Product p1 =  new Product("phone", 890.87);
        Product p2 =  new Product("pc", 1023.9);
        Product p3 =  new Product("book", 69.23);
        queue.add(p1);
        queue.add(p2);
        queue.add(p3);
        System.out.println(queue.peek());

    }
}
