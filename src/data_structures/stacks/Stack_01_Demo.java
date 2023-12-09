/**
 * A stack is a linear data structure that follows principle of LIFO (Last-In-First-Out).
 * Some basic operations of stack are:
 * push() : Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
 * pop() : Removes an item from the stack. The items are popped in the reversed order in which they are pushed.
 * isEmpty() : Returns true if stack is empty, else false.
 * isFull() : Returns true if stack is full, else false.
 * peek() : Returns top element of stack.
 */
package data_structures.stacks;

import java.util.Stack;

public class Stack_01_Demo {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        System.out.println(stack1.isEmpty());
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

        System.out.println(stack1);

        //print top element of stack
        System.out.println(stack1.peek());

        //remove top element from stack
        stack1.pop();
        System.out.println(stack1);

        //check whether the given element is present in stack or not
        System.out.println(stack1.contains(1));

        //inserting elements at stack
        stack1.insertElementAt(5, 1);
        System.out.println(stack1);

        //remove element from stack
        stack1.remove(0);
        System.out.println(stack1);
    }
}
