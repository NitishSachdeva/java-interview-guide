/**
 * A stack is a linear data structure that follows principle of LIFO (Last-In-First-Out).
 * Some basic operations of stack are:
 * push() : Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
 * pop() : Removes an item from the stack. The items are popped in the reversed order in which they are pushed.
 * isEmpty() : Returns true if stack is empty, else false.
 * isFull() : Returns true if stack is full, else false.
 * peek() : Returns top element of stack.
 */
// Problem Statement: Check for balanced parentheses in an expression using stack.
// Input: exp = “[()]{}{[()()]()}”
package data_structures.stacks;

import java.util.Stack;

public class Stack_06_Balanced_Parentheses_Stack {
    public static void main(String[] args) {
        String s = "(2+[{4}])";
        System.out.println(isBalanced(s));
    }

    private static boolean isBalanced(String s) {
        Stack stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                Character top = (char) stack.pop();
                if (top == '(' && c != ')' || top == '{' && c != '}' || top == '[' && c != ']') {
                    return false;
                }
            }
        }
        return true;
    }
}