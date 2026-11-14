
class Solution {

    TreeNode dummy = new TreeNode(0);
    TreeNode current = dummy;

    public TreeNode increasingBST(TreeNode root) {

        inorder(root);

        return dummy.right;
    }

    private void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        // Visit left subtree
        inorder(root.left);

        // Make current node part of new tree
        root.left = null;
        current.right = root;
        current = root;

        // Visit right subtree
        inorder(root.right);
    }
}
