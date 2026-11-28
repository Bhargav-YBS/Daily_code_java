import java.util.*;
public class Main {
    static int size = 5;
    static int deque[] = new int[size];
    static int front = -1;
    static int rear = -1;
    static void insertFront(int value) {
        if ((front == 0 && rear == size - 1) ||
            (front == rear + 1)) {

            System.out.println("Deque is full");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        }
        else if (front == 0) {
            front = size - 1;
        }
        else {
            front--;
        }
        deque[front] = value;
        System.out.println(value + " inserted at front");
    }
    static void insertRear(int value) {
        if ((front == 0 && rear == size - 1) ||
            (front == rear + 1)) {
            System.out.println("Deque is full");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        }
        else if (rear == size - 1) {
            rear = 0;
        }
        else {
            rear++;
        }
        deque[rear] = value;
        System.out.println(value + " inserted at rear");
    }
    static void display() {
        if (front == -1) {
            System.out.println("Deque is empty");
            return;
        }
        System.out.print("Deque: ");
        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % size;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int value = sc.nextInt();
            insertRear(value);
        }
        System.out.print("Enter element to insert at front: ");
        int a = sc.nextInt();
        insertFront(a);
        System.out.print("Enter element to insert at rear: ");
        int b = sc.nextInt();
        insertRear(b);
        display();
        sc.close();
    }
}
