package data_structures.linked_list;

public class Linked_List_05_Deletion_At_End {
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

    public void deleteNodeAtEnd(Node head) {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    public static void main(String[] args) {
        Linked_List_05_Deletion_At_End linkedList = new Linked_List_05_Deletion_At_End();
        linkedList.addNodeAtEnd(1);
        linkedList.addNodeAtEnd(2);
        linkedList.addNodeAtEnd(3);
        linkedList.addNodeAtEnd(4);
        linkedList.addNodeAtEnd(5);
        System.out.println("Linked list available :");
        linkedList.printLinkedList(head);
        System.out.println("\nPost Deletion at end : ");
        linkedList.deleteNodeAtEnd(head);
        linkedList.printLinkedList(head);
    }
}
