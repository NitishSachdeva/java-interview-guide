//Array Dequeue is a queue that is implemented using a single array.
//You can insert and remove elements from both sides of the queue.

package data_structures.queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_03_Demo_ArrayDequeue {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(15);
        queue.add(10);
        queue.add(20);
        queue.add(5);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}