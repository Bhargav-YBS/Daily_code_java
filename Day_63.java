
class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    static Node head;

    // Inserting a node after a given value
    static void insertAfter(int key, int value) {
        Node temp = head;

        // Finding the given node
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println(key + " not found");
            return;
        }

        Node newNode = new Node(value);

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete a node by value
    static void delete(int key) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If first node is to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Find the node before the required node
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println(key + " not found");
        }
    }

    // Searching for an element
    static void search(int key) {
        Node temp = head;
        int position = 0;

        while (temp != null) {

            if (temp.data == key) {
                System.out.println(key +
                    " found at position " + position);
                return;
            }

            temp = temp.next;
            position++;
        }

        System.out.println(key + " not found");
    }

    // Displaying elements with positions
    static void display() {
        Node temp = head;
        int position = 0;

        while (temp != null) {
            System.out.println("Position " + position +
                               " : " + temp.data);

            temp = temp.next;
            position++;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

         
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original Linked List:");
        display();

        // Operation 1: Insert 25 after 20
        insertAfter(20, 25);

        System.out.println("\nAfter Insertion:");
        display();

        // Operation 2: Delete node 40
        delete(40);

        System.out.println("\nAfter Deletion:");
        display();

        // Operation 3: Search 30 and 80
        System.out.println("\nSearch Operation:");
        search(30);
        search(80);

        // Operation 4: Display final positions
        System.out.println("\nFinal Linked List:");
        display();
    }
}
