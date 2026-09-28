public class ValidateBinarySearchTree98 {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false;
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
    public boolean isValidBST2(TreeNode root) {
        if (root == null) return true;
        return isValidBST(root, new int[]{0, 0});
    }

    private boolean isValidBST(TreeNode root, int[] bounds) {
        bounds[0] = root.val;
        bounds[1] = root.val;
        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left != null) {
            int[] leftBounds = new int[]{0, 0};
            boolean left = isValidBST(root.left, leftBounds);
            if (!left || leftBounds[1] >= root.val) return false;
            bounds[0] = leftBounds[0];
        }

        if (root.right != null) {
            int[] rightBounds = new int[]{0, 0};
            boolean right = isValidBST(root.right, rightBounds);
            if (!right || rightBounds[0] <= root.val) return false;
            bounds[1] = rightBounds[1];
        }

        return true;
    }
    public boolean isValidBST3(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(pre != null && root.val <= pre.val) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }

}
