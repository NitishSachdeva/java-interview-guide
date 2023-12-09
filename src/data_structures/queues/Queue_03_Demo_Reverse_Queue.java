//Array Dequeue is a queue that is implemented using a single array.
//You can insert and remove elements from both sides of the queue.

package data_structures.queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Queue_03_Demo_Reverse_Queue {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(15);
        queue.add(10);
        queue.add(20);
        queue.add(5);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        System.out.println("Reverse order of queue is :" + queue);
    }
}