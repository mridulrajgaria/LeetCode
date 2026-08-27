class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }
    private int checkBalance(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = checkBalance(root.left);
        int right = checkBalance(root.right);
        if (left == -1 || right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}