public class SuA {
    int top;
    int maxSize;
    int stack[];

    // Constructor
    public SuA(int size) {
        top = -1;
        maxSize = size;
        stack = new int[maxSize];
    }

    //  a method to push elements
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full, cannot push");
            return;
        }

        stack[++top] = value;
    }

    //  a method to pop elementa
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty, cannot pop");
            return -1;
        }

        return stack[top--];
    }

    // a method to  View top element
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    //  a method to print stack
    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        SuA s = new SuA(4);

        s.push(40);
        s.push(80);
        s.push(90);
        s.push(20);

        System.out.println("Popped: " + s.pop());

        System.out.println("Top element: " + s.peek());

        System.out.println("Stack elements:");
        s.printStack();
    }
}
