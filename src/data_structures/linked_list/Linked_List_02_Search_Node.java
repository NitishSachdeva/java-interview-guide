/**
 * Linked List is a linear data structure. Unlike arrays, linked list elements are not stored at a contiguous location; the elements are linked using pointers.
 * <p> Why Linked List?
 * <p> Arrays can be used to store linear data of similar types, but arrays have the following limitations.
 * <p> 1) The size of the arrays is fixed: So we must know the upper limit on the number of elements in advance. Also, generally, the allocated memory is equal to the upper limit irrespective of the usage.
 */
// Time Complexity: O(n)
// Space Complexity: O(n)
//The program shows the implementation of a linked list in Java. It creates a linked list with five nodes and prints it.

package data_structures.linked_list;

public class Linked_List_02_Search_Node {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    static Node head = null;
    Node tail = null;

    public void addNodeAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }

    public void printLinkedList(Node headNode) {
        Node current = headNode;
        while  (current != null) {
            System.out.print(current.val + " -->");
            current = current.next;
        }
    }

    public boolean searchNodeWithGivenValue(Node headNode, int searchVal) {
        Node current = headNode;
        while (current != null) {
            if (current.val == searchVal) {
                System.out.println("\nNode with value " + searchVal + " found");
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Linked_List_02_Search_Node linkedList = new Linked_List_02_Search_Node();
        linkedList.addNodeAtEnd(1);
        linkedList.addNodeAtEnd(2);
        linkedList.addNodeAtEnd(3);
        linkedList.addNodeAtEnd(4);
        linkedList.addNodeAtEnd(5);
        linkedList.printLinkedList(head);
        linkedList.searchNodeWithGivenValue(head, 3);
    }
}
