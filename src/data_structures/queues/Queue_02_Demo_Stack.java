//Queue is a linear data structure which follows a particular order in which the operations are performed.
//Queue follows principle of First In First Out (FIFO).
//Queue supports two basic operations called enqueue and dequeue.
//Enqueue: Adds an item to the end of queue. If the queue is full, then it is said to be an Overflow condition.
//Dequeue: Removes an item from the beginning of  queue.
//Queue is an interface and part of java.util package.
//ArrayDeque, LinkedList, PriorityQueue, etc are the known implementations of Queue interface.

//originalStack = 1 4 5 7
// tempStack = 7 5 4 1
//4 5 7
package data_structures.queues;

import java.util.Stack;

public class Queue_02_Demo_Stack {

    static Stack<Integer> originalStack = new Stack<>();
    static Stack<Integer> tempStack = new Stack<>();

    public void enqueue(int x) {
        originalStack.push(x);
    }

    public void dequeue() {
        while (!originalStack.isEmpty()) {
            tempStack.push(originalStack.pop());
        }
        tempStack.pop();
        while (!tempStack.isEmpty()) {
            originalStack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Queue_02_Demo_Stack queue = new Queue_02_Demo_Stack();
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(7);
        System.out.println("originalStack = " + originalStack);
        queue.dequeue();
        System.out.println("originalStack = " + originalStack);
    }
}
