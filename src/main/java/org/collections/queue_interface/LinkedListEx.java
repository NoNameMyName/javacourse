package org.collections.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Roma");
        queue.add("Oleg");
        queue.offer("Ivan");
        queue.offer("Petr");
        queue.offer("Petr");
        System.out.println(queue);
        System.out.println(queue.element() + "\n");
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
