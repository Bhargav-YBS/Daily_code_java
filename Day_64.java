import java.util.*;
class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

public class Main {
    static Node head;

    // Inserting at beginning
    static void insertBeginning(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

    // Inserting at end
    static void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // Go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Inserting at a specific position
    static void insertPosition(int data, int pos) {

        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            insertBeginning(data);
            return;
        }

        Node temp = head;

        // Reach the previous node
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    // Display linked list
    static void display() {
        Node temp = head;

        System.out.print("null <-> ");

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // Creating initial linked list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            insertEnd(sc.nextInt());
        }

        System.out.print("Enter value to insert at beginning: ");
        insertBeginning(sc.nextInt());
        display();
   
        System.out.print("Enter value to insert at end: ");
        insertEnd(sc.nextInt());
        display();

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        insertPosition(value, pos);
        display();

        sc.close();
    }
}
