//Queue is a linear data structure which follows a particular order in which the operations are performed.
//Queue follows principle of First In First Out (FIFO).
//Queue supports two basic operations called enqueue and dequeue.
//Enqueue: Adds an item to the end of queue. If the queue is full, then it is said to be an Overflow condition.
//Dequeue: Removes an item from the beginning of  queue.
//Queue is an interface and part of java.util package.
//ArrayDeque, LinkedList, PriorityQueue, etc are the known implementations of Queue interface.

package data_structures.queues;

public class Queue_01_Demo_Array {
    int rear;
    int size;
    int[] a;

    public Queue_01_Demo_Array(int size) {
        rear = -1;
        this.size = size;
        this.a = new int[size];
    }

    public void enqueue(int x) {
        rear++;
        a[rear] = x;
    }

    public int dequeue() {
        int element = a[0];
        for (int i = 0; i < rear; i++) {
            a[i] = a[i + 1];
        }
        rear--;
        return element;
    }

    public void printQueue() {
        for (int i = 0; i <= rear; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue_01_Demo_Array queue = new Queue_01_Demo_Array(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
    }
}
