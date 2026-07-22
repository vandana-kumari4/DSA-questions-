class Solution {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }


    private boolean isMirror(TreeNode left, TreeNode right) {

        // Both nodes are empty
        if (left == null && right == null) {
            return true;
        }

        // One node is empty
        if (left == null || right == null) {
            return false;
        }

        // Values should be same
        if (left.val != right.val) {
            return false;
        }

        // Check mirror condition
        return isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }
}