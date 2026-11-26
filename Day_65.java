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
    static void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    static void delete(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Element not found");
            return;
        }
        if (temp == head) {
            head = temp.next;
        } else {
            temp.prev.next = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        System.out.println("Deleted: " + key);
    }
    static void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("null -> ");
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
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            insertEnd(sc.nextInt());
        }
        System.out.println("\nOriginal List:");
        display();
        System.out.print("\nEnter value to delete: ");
        int key = sc.nextInt();
        delete(key);
        System.out.println("\nUpdated List:");
        display();
        sc.close();
    }
}
