public class FindDuplicateSubtrees652 {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        if (root == null) return res;
        Map<String, Boolean> visited = new HashMap<>();
        findDuplicates(root, visited, res);
        return res;
    }

    private String findDuplicates(TreeNode root, Map<String, Boolean> visited, List<TreeNode> res) {
        if (root == null) {
            return "N";
        }
        String self = Integer.toString(root.val);
        String left = findDuplicates(root.left, visited, res);
        String right = findDuplicates(root.right, visited, res);
        String curr = self + "-" + left + "-" + right;
        if (!visited.containsKey(curr)) {
            visited.put(curr, false);
        } else {
            if (!visited.get(curr)) {
                res.add(root);
                visited.put(curr, true);
            }
        }
        return curr;
    }

}
