import java.util.*;
public class Main {
    static int size = 5;
    static int queue[] = new int[size];
    static int front = -1;
    static int rear = -1;
    // Insert element into queue
    static void enqueue(int data) {
        // Checking  if queue is full
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        // First element
        if (front == -1) {
            front = 0;
        }
        rear++;
        queue[rear] = data;
        System.out.println(data + " inserted");
    }
    // Displaying queue
    static void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int data = sc.nextInt();
            enqueue(data);
        }
        display();
        System.out.println("Front: " + queue[front]);
        System.out.println("Rear: " + queue[rear]);
        sc.close();
    }
}
