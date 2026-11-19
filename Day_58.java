import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // PUSH operation to insert elements
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Initial Stack: " + st);

        // PEEK operation to  display top element
        System.out.println("Top element: " + st.peek());

        // POP operation to remove top element
        System.out.println("Deleted element: " + st.pop());

        // ISEMPTY operation to  check whether stack is empty
        System.out.println("Is stack empty? " + st.isEmpty());

        // SIZE operation to count elements
        System.out.println("Stack size: " + st.size());

        // DISPLAY operation to print all elements
        System.out.println("Stack elements: " + st);
    }
}
