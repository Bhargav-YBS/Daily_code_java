import java.util.Scanner;
class LinkedListSum {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Enter at least 2 nodes.");
            return;
        }

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
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

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }
        int secondLast = current.data;
        int last = current.next.data;

        System.out.println("Second-last element: " + secondLast);
        System.out.println("Last element: " + last);
        System.out.println("Sum: " + (secondLast + last));
    }
}
