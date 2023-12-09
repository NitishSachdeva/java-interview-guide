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

public class Stack_03_Insert_At_Index_Stack {
    public static void insertAtGivenIndexOfStack(Stack<Integer> st1, int index, int value) {
        Stack<Integer> temp = new Stack<>();
        for (int i = 1; i <= st1.size() - index + 1; i++) {
            temp.push(st1.pop());
        }
        st1.push(value);
        while (!temp.isEmpty()) {
            st1.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();

        stack1.push(4);
        stack1.push(6);
        stack1.push(9);
        System.out.println(stack1);
        int index = 2;
        int value = 10;
        insertAtGivenIndexOfStack(stack1, index, value);
        System.out.println(stack1);
    }
}
