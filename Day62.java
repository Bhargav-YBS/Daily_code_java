class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedlistStack {
    private Node top;
    public LinkedlistStack() {
        top = null;
    }

    // PUSH
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // POP
    public int pop() {
        if (top == null) {
             System.out.println("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    // PEEK
    public int peek() {
        if (top == null) {
             System.out.println("Stack is empty");
        }
        return top.data;
    }

    // DISPLAY
    public void display() {
        Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedlistStack stack = new LinkedlistStack(3);
        stack.push(11);
        stack.push(22);
        stack.push(33);

        System.out.println("Top: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Remaining stack:");
        stack.display();
    }
}
