
package data_structures.linked_list;

public class Linked_List_08_Reverse_List {
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
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public void reverseTheGivenList() {
        Node previous = null;
        Node next = null;
        Node current = head;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        printLinkedList(previous);
    }

    public static void main(String[] args) {
        Linked_List_08_Reverse_List linkedList = new Linked_List_08_Reverse_List();
        linkedList.addNodeAtEnd(1);
        linkedList.addNodeAtEnd(2);
        linkedList.addNodeAtEnd(3);
        linkedList.addNodeAtEnd(4);
        linkedList.addNodeAtEnd(5);
        System.out.println("Linked list available :");
        linkedList.printLinkedList(head);
        System.out.println("\nPost reversing the list : ");
        linkedList.reverseTheGivenList();
    }
}
