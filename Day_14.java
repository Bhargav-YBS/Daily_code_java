public class ClosestBinarySearchTreeValue270 {
    public int closestValue(TreeNode root, double target) {
        return closestValue(root, target, null, null);
    }
    private int closestValue(TreeNode root, double target, Integer mi, Integer ma) {
        if (root == null) {
            if (mi == null) return ma;
            else if (ma == null) return mi;
            else return (ma - target > target - mi) ? mi : ma;
        } 

        double val = root.val * 1.0;
        if (val == target) {
            return root.val;
        } else if (val > target) {
            return closestValue(root.left, target, mi, root.val);
        } else {
            return closestValue(root.right, target, root.val, ma);
        }
    }
    public int closestValue2(TreeNode root, double target) {
        Integer mi = null;
        Integer ma = null;

        while (root != null) {
            double val = root.val * 1.0;
            if (val == target) {
                return root.val;
            } else if (val > target) {
                ma = root.val;
                root = root.left;
            } else {
                mi = root.val;
                root = root.right;
            }
        }

        if (mi == null) return ma;
        else if (ma == null) return mi;
        else return (ma - target > target - mi) ? mi : ma;
    }
    public int closestValue3(TreeNode root, double target) {
        int a = root.val;
        TreeNode kid = target < a ? root.left : root.right;
        if (kid == null) return a;
        int b = closestValue(kid, target);
        return Math.abs(a - target) < Math.abs(b - target) ? a : b;
    }
    public int closestValue4(TreeNode root, double target) {
        int ret = root.val;   
        while(root != null){
            if(Math.abs(target - root.val) < Math.abs(target - ret)){
                ret = root.val;
            }      
            root = root.val > target? root.left: root.right;
        }     
        return ret;
    }

}
