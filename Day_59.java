public class Main {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Inorder: Left, Root, Right
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder: Root, Left, Right
    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder: Left, Right, Root
    static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Searching an element
    static boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        return search(root.left, key) ||
               search(root.right, key);
    }

    // Counting  total nodes
    static int count(Node root) {
        if (root == null)
            return 0;

        return 1 + count(root.left) + count(root.right);
    }

    // Finding height
    static int height(Node root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left),
                            height(root.right));
    }

    public static void main(String[] args) {

        // Creating a tree
        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.print("Inorder: ");
        inorder(root);

        System.out.print("\nPreorder: ");
        preorder(root);

        System.out.print("\nPostorder: ");
        postorder(root);

        System.out.println("\nSearch 30: " + search(root, 30));

        System.out.println("Total nodes: " + count(root));

        System.out.println("Height: " + height(root));
    }
}
