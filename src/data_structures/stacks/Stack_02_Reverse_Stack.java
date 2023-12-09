/**
 * A stack is a linear data structure that follows principle of LIFO (Last-In-First-Out).
 * Some basic operations of stack are:
 * push() : Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
 * pop() : Removes an item from the stack. The items are popped in the reversed order in which they are pushed.
 * isEmpty() : Returns true if stack is empty, else false.
 * isFull() : Returns true if stack is full, else false.
 * peek() : Returns top element of stack.
 */

//4 6 2 9 1
//1 9 2 6 4
//4 6 2 9 1
//1 9 2 6 4

package data_structures.stacks;

import java.util.Stack;

public class Stack_02_Reverse_Stack {
    public static void moveStack(Stack<Integer> st1, Stack<Integer> st2){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

    }
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        stack1.push(4);
        stack1.push(6);
        stack1.push(9);
        System.out.println(stack1);

        moveStack(stack1, stack2);
        moveStack(stack2, stack3);
        moveStack(stack3, stack1);
        System.out.println(stack1);
    }
}
