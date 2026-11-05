import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        // Read number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // Create s a  linked list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Read K
        System.out.print("Enter K: ");
        int k = sc.nextInt();

        // Validate K
        if (k < 1 || k > n) {
            System.out.println("Invalid K value.");
        } else {
            Node temp = head;

            // Move to the Kth node
            for (int i = 1; i < k; i++) {
                temp = temp.next;
            }

            System.out.println("Kth element = " + temp.data);
        }

        sc.close();
    }
}
