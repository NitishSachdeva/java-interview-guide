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

public class Stack_04_Minimum_Value_Stack {
    static Stack<Integer> mainStack = new Stack<>();
    static Stack<Integer> temp = new Stack<>();

    public static void main(String[] args) {
        customPush(12);
        customPush(6);
        customPush(20);
        customPush(30);
        customPush(2);
        System.out.println(temp.peek() + " is the min value on stack");
        customPop();
        System.out.println(temp.peek() + " is the min value on stack");

    }

    private static void customPush(int i) {
        mainStack.push(i);
        if (temp.isEmpty()) {
            temp.push(i);
        } else if (temp.peek() > i) {
            temp.push(i);
        }
    }

    private static void customPop() {
        if (mainStack.peek() == temp.peek()) {
            temp.pop();
        }
        mainStack.pop();
    }
}
