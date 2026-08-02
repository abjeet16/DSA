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
    public boolean evaluateTree(TreeNode root) {
        if (root.left==null&&root.right==null){
            return root.val==1;
        }
        return doOp(evaluateTree(root.right),evaluateTree(root.left),root.val);
    }

    private boolean doOp(boolean con1, boolean con2, int opration) {
        if (opration==2){
            return con1||con2;
        }else 
            return con1&&con2;
    }
}