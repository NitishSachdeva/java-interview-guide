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

public class Stack_05_Sort_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(34);
        stack1.push(3);
        stack1.push(31);
        stack1.push(98);
        stack1.push(14);
        System.out.println(stack1);
        System.out.println(sortStack(stack1));
    }

    private static Stack<Integer> sortStack(Stack<Integer> stack1) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack1.isEmpty()) {
            int temp = stack1.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack1.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }
}