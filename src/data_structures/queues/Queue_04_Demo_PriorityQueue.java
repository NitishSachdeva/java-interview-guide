//Priority Queue is a queue that is implemented using a single java_guide.array.
//Insertion and removal of elements take O(log n) time.
//Elements are ordered based on their priority.
//Elements with higher priority are removed first.
//If two elements have the same priority, they are removed based on their order in the queue.
//Priority Queue is not thread-safe.
//Priority Queue does not allow null elements.
//smaller number has higher priority
package data_structures.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_04_Demo_PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(15);
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);

        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);

    }
}