
package data_structures.linked_list;

public class Linked_List_07_Deletion_At_Index {
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
            System.out.print(current.val + " -->");
            current = current.next;
        }
    }

    public void deleteNodeAtGivenIndex(int index) {
        Node current = head;
        int count = 1;
        while (current != null && count != index - 1) {
            current = current.next;
            count++;
        }
        current.next = current.next.next;
    }

    public static void main(String[] args) {
        Linked_List_07_Deletion_At_Index linkedList = new Linked_List_07_Deletion_At_Index();
        linkedList.addNodeAtEnd(1);
        linkedList.addNodeAtEnd(2);
        linkedList.addNodeAtEnd(3);
        linkedList.addNodeAtEnd(4);
        linkedList.addNodeAtEnd(5);
        System.out.println("Linked list available :");
        linkedList.printLinkedList(head);
        System.out.println("\nPost Deletion of node at given index : ");
        linkedList.deleteNodeAtGivenIndex(3);
        linkedList.printLinkedList(head);
    }
}
