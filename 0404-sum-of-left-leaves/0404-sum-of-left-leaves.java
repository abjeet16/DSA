/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return theSum(root, false);
    }

    public int theSum(TreeNode root, boolean isLeft) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return isLeft ? root.val : 0;
        }
        int lft = theSum(root.left, true);
        int rgt = theSum(root.right, false);
        return lft+rgt;
    }
}